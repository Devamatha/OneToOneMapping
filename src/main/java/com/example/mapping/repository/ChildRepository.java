package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Long>{

}
