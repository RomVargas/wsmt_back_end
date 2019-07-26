package com.nglobal.status.management.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nglobal.status.management.model.JSONResponse;
import com.nglobal.status.management.persistence.entity.Report;
import com.nglobal.status.management.repository.ReportRepository;

@RestController
@CrossOrigin
@RequestMapping("/report")
public class ReportController {

	@Autowired
	JSONResponse jSONResponse;
	
	@Autowired
	ReportRepository reportRepository;
	
	@GetMapping("/allreports")
	public ResponseEntity<?> getAllReports(){
		return new ResponseEntity<>(reportRepository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveReport(@Valid @RequestBody Report report){
		return new ResponseEntity<>(reportRepository.save(report),HttpStatus.OK);
	}
	
	@GetMapping("/getreport/{id}")
	public ResponseEntity<?> getReportById(@PathVariable Long id){
		return new ResponseEntity<>(reportRepository.findById(id), HttpStatus.OK);
	}
	
}
