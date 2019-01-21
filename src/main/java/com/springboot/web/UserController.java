package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@PostMapping("/create")
	public String create(User user, String name, String password) {
		System.out.println(user);   //자동으로 toString이 호출됨
		System.out.println("name: " + name + " password: "+ password);
		return "index2";  //시험용
	}
	
}
