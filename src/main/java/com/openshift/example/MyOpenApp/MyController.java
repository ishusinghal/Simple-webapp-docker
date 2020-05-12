package com.openshift.example.MyOpenApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/example")
	public String showExample() {
		return "This is Sample Response";
	}

}
