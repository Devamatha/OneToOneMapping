package com.example.mapping.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.entity.Child;
import com.example.mapping.entity.Parent;
import com.example.mapping.repository.ChildRepository;
import com.example.mapping.repository.ParentReposiotry;
import com.example.mapping.service.ChildService;

@Service
public class childServiceImpl implements ChildService {
	@Autowired
	private ChildRepository childRepository;
	@Autowired
	private ParentReposiotry parentReposiotry;

	@Override
	public Child savechild(Child child, Long ParentId) {
		Parent parentId = parentReposiotry.findById(ParentId)
				.orElseThrow(() -> new RuntimeException("ParentId is not Present" + ParentId + "try with other Id"));
		child.setParent(parentId);
		return childRepository.save(child);
	}

}
