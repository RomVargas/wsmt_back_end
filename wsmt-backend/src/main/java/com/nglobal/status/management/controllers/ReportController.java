package com.nglobal.status.management.controllers;

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
import com.nglobal.status.management.repository.AccomplishmentsRepo;
import com.nglobal.status.management.repository.ReportRepository;

@RestController
@CrossOrigin(origins= {
		"http://localhost:4200"
})
@RequestMapping("/report")
public class ReportController {

	@Autowired
	JSONResponse jSONResponse;
	
	@Autowired
	ReportRepository reportRepository;
	
	@Autowired
	AccomplishmentsRepo accomplishRepo;

	private Report reportId;
	
	@GetMapping("/allreports")
	public ResponseEntity<?> getAllReports(){
		return new ResponseEntity<>(reportRepository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveReport(@RequestBody Report report){
		reportId = reportRepository.save(report);
		return new ResponseEntity<>(reportId,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getReportById(@PathVariable Long id){
		return new ResponseEntity<>(reportRepository.findById(id), HttpStatus.OK);
	}
	
}
