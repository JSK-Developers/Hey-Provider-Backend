package com.hp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;
import com.hp.entity.Registration;
import com.hp.entity.UserServiceDataEntity;
import com.hp.exception.ResourceNotFoundException;
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
	
	public List<AcRepairFormEntity> getAllUserServiceData(){
		return acRepairFormRepository.getAllUserServiceData();
	}
	public List<AcRepairFormDatadto> getAllCompletedServiceDetail(Long id){
		return acRepairFormRepository.getAllCompletedServiceDetail(id);
	}
	public List<AcRepairFormDatadto> getAllPendingServiceDetail(Long id){
		return acRepairFormRepository.getAllPendingServiceDetail(id);
	}
	public void addAcUser(AcRepairFormEntity acRepairFormEntity) {
		acRepairFormRepository.save(acRepairFormEntity);
	}
	public AcRepairFormEntity getSingleAcUser(Long id){
		AcRepairFormEntity singleServiceDetail = acRepairFormRepository.findServiceById(id);
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
	
	
	public AcRepairFormEntity updateActiveStatus(AcRepairFormEntity acRepairFormEntity) {
		Optional<AcRepairFormEntity> user=this.acRepairFormRepository.findById(acRepairFormEntity.getId());
		
		if(user.isPresent()) {
			AcRepairFormEntity userUpdate=user.get();
			userUpdate.setActiveStatus((long) 1);
			userUpdate.setDate(acRepairFormEntity.getDate());
			
			acRepairFormRepository.save(userUpdate);
			return userUpdate;
		}else {
			throw new ResourceNotFoundException("User Not Found With This Id: "+acRepairFormEntity.getId());
		}
	}
	
	public AcRepairFormEntity updateDetail(AcRepairFormEntity acRepairFormEntity) {
		Optional<AcRepairFormEntity> user=this.acRepairFormRepository.findById(acRepairFormEntity.getId());
		
		if(user.isPresent()) {
			AcRepairFormEntity userUpdate=user.get();
			userUpdate.setId(acRepairFormEntity.getId());
			userUpdate.setName(acRepairFormEntity.getName());
			userUpdate.setNumber(acRepairFormEntity.getNumber());
			userUpdate.setDate(acRepairFormEntity.getDate());
			userUpdate.setTime(acRepairFormEntity.getTime());
			userUpdate.setAddresss1(acRepairFormEntity.getAddresss1());
			userUpdate.setLandmark(acRepairFormEntity.getLandmark());
			userUpdate.setCity(acRepairFormEntity.getCity());
			userUpdate.setPincode(acRepairFormEntity.getPincode());
			userUpdate.setProviderid(acRepairFormEntity.getProviderid());
			userUpdate.setUserid(acRepairFormEntity.getUserid());
			userUpdate.setEnd_services_otp(acRepairFormEntity.getEnd_services_otp());
			userUpdate.setWindow_ac_service(acRepairFormEntity.getWindow_ac_service());
			userUpdate.setSplit_ac_service(acRepairFormEntity.getSplit_ac_service());
			userUpdate.setLess_no_cooling(acRepairFormEntity.getLess_no_cooling());
			userUpdate.setAc_not_starting(acRepairFormEntity.getAc_not_starting());
			userUpdate.setNoise_issue(acRepairFormEntity.getNoise_issue());
			userUpdate.setWater_leakege(acRepairFormEntity.getWater_leakege());
			userUpdate.setTotal(acRepairFormEntity.getTotal());
			userUpdate.setActiveStatus(acRepairFormEntity.getActiveStatus());
			acRepairFormRepository.save(userUpdate);
			return userUpdate;
		}else {
			throw new ResourceNotFoundException("User Not Found With This Id: "+acRepairFormEntity.getId());
		}
	}
}
