package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.entity.AcService;
import com.hp.entity.TimeForServices;
import com.hp.repository.AcServiceRepository;
import com.hp.repository.TimeForServicesRepository;

@Component
public class AcServiceService {

	
	@Autowired
	private AcServiceRepository acServiceRepository;
	@Autowired
	private TimeForServicesRepository timeForServicesRepository;

	public List<AcService> getAllUserOfAcService(){
		return(List<AcService>) acServiceRepository.findAll();
	}
	
	public void addAcServiceUser(AcService acService) {
		acServiceRepository.save(acService);
	}
	
	public Optional<AcService> getSingleAcServiceUser(Long id){
		return acServiceRepository.findById(id);
	}
	
	public void updateAcServiceUser(Long id, AcService acService) {
		acServiceRepository.save(acService);
	}
	
	public void deleteAcServiceUser(Long id) {
		acServiceRepository.deleteById(id);
	}
	public List<TimeForServices> getAllServiceList() {
		return (List<TimeForServices>) timeForServicesRepository.findAll();
}
	
}
