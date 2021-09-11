package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.BooksModel;

public interface BooksInformationService extends JpaRepository<BooksModel, Integer>{
	
	List<BooksModel> findByName(String name);
	
}
