package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;
import com.hp.entity.Registration;
import com.hp.service.AcRepairFormService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class AcRepairFormController {

	@Autowired
	AcRepairFormService acRepairFormService;
	AcRepairFormEntity acRepairFormEntity;
	
//	@RequestMapping("/AC_Users")
//	public List<AcReapairFormdto> getUser(){
//		return acRepairFormService.getAllAcUser();
//	}
	
	@GetMapping("AllData")
	public List<AcRepairFormEntity> getAllUserServiceData(){
		return acRepairFormService.getAllUserServiceData();
	}
	@GetMapping("AllCompletedData/{id}")
	public List<AcRepairFormDatadto> getAllCompletedServiceDetail(@PathVariable Long id){
		return acRepairFormService.getAllCompletedServiceDetail(id);
	}
	@GetMapping("AllPendingServiceData/{id}")
	public ResponseEntity<List<AcRepairFormDatadto>> getAllPendingServiceDetail(@PathVariable Long  id){
		return ResponseEntity.ok().body(this.acRepairFormService.getAllPendingServiceDetail(id));
	}
	@PostMapping("/AC_Service_Registration")
	public void addAcUser(@RequestBody AcRepairFormEntity acRepairFormEntity) {
		acRepairFormService.addAcUser(acRepairFormEntity);
	}
	
	@RequestMapping("/serviceDetail/{id}")
	public AcRepairFormEntity getSingleAcUser(@PathVariable Long id){
		return acRepairFormService.getSingleAcUser(id);
	}
	
	@PutMapping("/updateService/{id}")
	public ResponseEntity<AcRepairFormEntity> updateDetail(@PathVariable long id,@RequestBody AcRepairFormEntity acRepairFormEntity){
		acRepairFormEntity.setId(id);
		return ResponseEntity.ok().body(this.acRepairFormService.updateDetail(acRepairFormEntity));
	}
	
	@RequestMapping("/myOrder/{id}")
	public List<AcRepairFormDatadto> getAllDetailOfUser(@PathVariable Long id){
		return acRepairFormService.getAllDetailOfUser(id);
	}
		 
//	@PutMapping("/AC_Users/{id}")
//	public void updateAcUser(@RequestBody AcRepairFormEntity acRepairFormEntity,@PathVariable Long id) {
//		acRepairFormService.updateAcUser(id, acRepairFormEntity);
//	}
	
	@DeleteMapping("AC_Users/{id}")
	public void deleteAcUser(@PathVariable Long id) {
		acRepairFormService.deleteAcUser(id);
	}
	
	@PutMapping("/setActiveStatus/{id}")
	public ResponseEntity<AcRepairFormEntity> updateUser(@PathVariable long id,@RequestBody AcRepairFormEntity acRepairFormEntity){
		acRepairFormEntity.setId(id);
		return ResponseEntity.ok().body(this.acRepairFormService.updateActiveStatus(acRepairFormEntity));
	}
	
}
