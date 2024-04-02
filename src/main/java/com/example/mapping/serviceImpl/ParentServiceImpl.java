package com.example.mapping.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Parent;
import com.example.mapping.repository.ParentReposiotry;
import com.example.mapping.service.ParentService;

@Service
public class ParentServiceImpl implements ParentService {

	@Autowired
	private ParentReposiotry parentReposiotry;

	@Override
	public Parent save(Parent parent) {

		return parentReposiotry.save(parent);
	}
}
