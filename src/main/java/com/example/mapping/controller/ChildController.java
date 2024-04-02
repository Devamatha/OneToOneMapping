package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.entity.Child;
import com.example.mapping.service.ChildService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class ChildController {

	@Autowired
	private ChildService childService;

	@PostMapping("/save/{ParentId}")
	public Child saveChild(@RequestBody Child child, @PathVariable Long ParentId) {

		return childService.savechild(child, ParentId);
	}

}
