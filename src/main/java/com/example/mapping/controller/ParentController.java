package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Parent;
import com.example.mapping.service.ParentService;

@RestController
@RequestMapping("/api")
public class ParentController {
	@Autowired
	private ParentService parentService;

	@PostMapping("/save")
	public Parent saveParent(@RequestBody Parent parent) {
		return parentService.save(parent);

	}
}
