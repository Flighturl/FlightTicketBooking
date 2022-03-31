package com.kingflyer.flightbooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.Model.Users;
import com.kingflyer.flightbooking.Service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public void addUser(@RequestBody Users user) throws Exception {
		userService.addUser(user);
	}

	@GetMapping("/getUser/{email}")
	public Users getUser(@PathVariable("email") String email) {
		return userService.getUser(email);
	}

	@PutMapping("/modifyUser")
	public void modifyUser(@RequestBody Users users) {
		userService.modifyUser(users);
	}

}
