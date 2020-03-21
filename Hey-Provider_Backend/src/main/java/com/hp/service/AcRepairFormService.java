package com.hp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;
import com.hp.entity.UserServiceDataEntity;
import com.hp.repository.AcRepairFormRepository;

@Service
public class AcRepairFormService {

	@Autowired
	AcRepairFormRepository acRepairFormRepository;
	
	@Autowired
	private ConverterService converterService;
	
	public List<AcRepairFormDatadto> getAllAcUser(){
		List<AcRepairFormEntity> userDataList=(List<AcRepairFormEntity>) acRepairFormRepository.findAll();
		return userDataList.stream().map(converterService::convertToDto).collect(Collectors.toList());
	}
	
	public List<AcRepairFormDatadto> getAllUserServiceData(){
		return acRepairFormRepository.getAllUserServiceData();
	}
	public void addAcUser(AcRepairFormEntity acRepairFormEntity) {
		acRepairFormRepository.save(acRepairFormEntity);
	}
	public AcRepairFormDatadto getSingleAcUser(Long id){
		AcRepairFormDatadto singleServiceDetail = acRepairFormRepository.findServiceById(id);
		return singleServiceDetail;
	} 
	public List<AcRepairFormDatadto> getAllDetailOfUser(Long id){
		List<AcRepairFormDatadto> serviceDetail = acRepairFormRepository.orderDetailById(id);
		return serviceDetail;
	} 
	public void updateAcUser(Long id,AcRepairFormEntity acRepairFormEntity) {
		acRepairFormRepository.save(acRepairFormEntity);
	}
	public void deleteAcUser(Long id) {
		acRepairFormRepository.deleteById(id);
	}
	
}
