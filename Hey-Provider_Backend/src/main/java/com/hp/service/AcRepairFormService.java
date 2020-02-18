package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.entity.AcRepairFormEntity;
import com.hp.repository.AcRepairFormRepository;

@Service
public class AcRepairFormService {

	@Autowired
	AcRepairFormRepository acRepairFormRepository;
	
	public List<AcRepairFormEntity> getAllAcUser(){
		return(List<AcRepairFormEntity>) acRepairFormRepository.findAll();
	}
	public void addAcUser(AcRepairFormEntity acRepairFormEntity) {
		acRepairFormRepository.save(acRepairFormEntity);
	}
	public Optional<AcRepairFormEntity> getSingleAcUser(Long id){
		return acRepairFormRepository.findById(id);
	} 
	public void updateAcUser(Long id,AcRepairFormEntity acRepairFormEntity) {
		acRepairFormRepository.save(acRepairFormEntity);
	}
	public void deleteAcUser(Long id) {
		acRepairFormRepository.deleteById(id);
	}
	
}
