package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;
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
	public List<AcRepairFormDatadto> getAllUserServiceData(){
		return acRepairFormService.getAllUserServiceData();
	}
	
	@PostMapping("/AC_Service_Registration")
	public void addAcUser(@RequestBody AcRepairFormEntity acRepairFormEntity) {
		acRepairFormService.addAcUser(acRepairFormEntity);
	}
	
	@RequestMapping("/serviceDetail/{id}")
	public AcRepairFormDatadto getSingleAcUser(@PathVariable Long id){
		return acRepairFormService.getSingleAcUser(id);
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
	
}
