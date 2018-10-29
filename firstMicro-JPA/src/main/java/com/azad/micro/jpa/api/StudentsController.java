package com.azad.micro.jpa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azad.micro.jpa.domain.Students;
import com.azad.micro.jpa.repository.StudentsRepo;

@RestController
public class StudentsController {

	@Autowired
	StudentsRepo studentRepo;
	
	@GetMapping("/all")
	public List<Students> getAllStudents() {
		return studentRepo.findAll();
	}
	
	@GetMapping("/saveStudent")
	public Students saveStudent() {
		Students st = new Students("Azad MJ", "INDIA", 21);
		return studentRepo.save(st);
	}
}
