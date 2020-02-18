package com.hp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.entity.AcService;
import com.hp.entity.TimeForServices;
import com.hp.service.AcServiceService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/AcService")
@RestController
public class AcServiceController {

	@Autowired
	AcServiceService acServiceService;
	AcService acService;
	
	@RequestMapping("/acServiceUsers")
	public List<AcService> getAllUserOfAcService(){
		return (List<AcService>) acServiceService.getAllUserOfAcService();
	}
	
	@PostMapping("/acServiceUsers")
	public void addUser(@RequestBody AcService acService) {
		acServiceService.addAcServiceUser(acService);
	}
	
	@RequestMapping("/acServiceUsers/{id}")
	public Optional<AcService> getSingleAcServiceUser(@PathVariable Long id){
		return acServiceService.getSingleAcServiceUser(id);
	}
		 
	@PutMapping("/acServiceUsers/{id}")
	public void updateAcServiceUser(@RequestBody AcService acService,@PathVariable Long id) {
		acServiceService.updateAcServiceUser(id, acService);;
	}
	
	@DeleteMapping("acServiceUsers/{id}")
	public void deleteUser(@PathVariable Long id) {
		acServiceService.deleteAcServiceUser(id);;
	}
	
	@RequestMapping("/acServiceUsers/time")
	public List<TimeForServices> getAllServiceList() {
		return (List<TimeForServices>) acServiceService.getAllServiceList();
	}
	
	
}
