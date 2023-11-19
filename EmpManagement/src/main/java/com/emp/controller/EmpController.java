package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.EmpDetails;
import com.emp.repository.EmpRepository;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepository empRepository;
	
	@PostMapping("/insert")
	public String insert(@RequestBody EmpDetails empDetails) {
		empRepository.save(empDetails);
		return "Inserted successfully.";
	}
	
	@GetMapping("/findById")
	public Optional<EmpDetails> findById(@RequestParam int empId) {
		return empRepository.findById(empId);
	}
	
	@GetMapping("/findAll")
	public List<EmpDetails> findAll() {
		return empRepository.findAll();
	}

}
