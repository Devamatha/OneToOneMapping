package com.example.mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Child {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long childId;
	private String childName;
	private String villageName;
	private String surName;

	@OneToOne
	private Parent parent;

}
