package com.hp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;

@Component
public class ConverterService {

	@Autowired
	private ModelMapper modelMapper;
	
	public AcRepairFormDatadto convertToDto(AcRepairFormEntity acRepairFormEntity) {
		return modelMapper.map(acRepairFormEntity, AcRepairFormDatadto.class); 
	}
	
}
