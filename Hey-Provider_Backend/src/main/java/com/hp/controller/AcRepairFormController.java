package com.hp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.entity.AcRepairFormEntity;
import com.hp.service.AcRepairFormService;

@RestController
@RequestMapping("/AC_Service")
public class AcRepairFormController {

	@Autowired
	AcRepairFormService acRepairFormService;
	AcRepairFormEntity acRepairFormEntity;
	
	@RequestMapping("/AC_Users")
	public List<AcRepairFormEntity> getUser(){
		return (List<AcRepairFormEntity>) acRepairFormService.getAllAcUser();
	}
	
	@PostMapping("/AC_Users")
	public void addAcUser(@RequestBody AcRepairFormEntity acRepairFormEntity) {
		acRepairFormService.addAcUser(acRepairFormEntity);
	}
	
	@RequestMapping("/AC_Users/{id}")
	public Optional<AcRepairFormEntity> getSingleAcUser(@PathVariable Long id){
		return acRepairFormService.getSingleAcUser(id);
	}
		 
	@PutMapping("/AC_Users/{id}")
	public void updateAcUser(@RequestBody AcRepairFormEntity acRepairFormEntity,@PathVariable Long id) {
		acRepairFormService.updateAcUser(id, acRepairFormEntity);
	}
	
	@DeleteMapping("AC_Users/{id}")
	public void deleteAcUser(@PathVariable Long id) {
		acRepairFormService.deleteAcUser(id);
	}
}
