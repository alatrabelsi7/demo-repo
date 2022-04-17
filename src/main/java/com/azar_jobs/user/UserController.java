package com.azar_jobs.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/user")
public class UserController {
private final  UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

	@GetMapping
	public Optional<User> getUserById(int id){
		return userService.getUserById(id);
	}
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.addNewUser(user);
	}
	
	@DeleteMapping(path="{userId}")
	public void deleteUser(@PathVariable("userId")int userId) {
		userService.deleteUser(userId);
	}
}
