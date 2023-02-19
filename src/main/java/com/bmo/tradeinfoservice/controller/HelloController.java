package com.bmo.tradeinfoservice.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("hw")
	public String helloWorld() {
		return "Hello Beru Seth";
	}

	@GetMapping("hw/{name}/{age}")
	public String secondController(@PathVariable("name") String name1, @PathVariable("age") String age1) {

		return "Hello " + name1 + " " + age1;
	}

	@GetMapping("hw/{name}/{age}/{gender}/{school}")
	public String secondController(@PathVariable Map<String, String> input) {

		String resultName = input.get("name");
		String resultAge = input.get("age");
		String resultgGender = input.get("gender");
		String resultgSchool = input.get("school");

		return resultName + " " + resultAge + " " + resultgGender +" "+resultgSchool;
	}

	@PostMapping("create")
	public String createResource(@RequestParam("name") String name1, @RequestParam("age") String age1) {

		return name1 + " " + age1;

	}

	
	@PostMapping("createMultiple")
	public String createResource(@RequestParam Map<String, String> input) {
  
		String resultName = input.get("name");
		String resultAge = input.get("age");
		String resultgGender = input.get("gender");
		String resultgSchool = input.get("school");

		return resultName + " " + resultAge + " " + resultgGender +" "+resultgSchool;
		//comment for git demo
	}
}
