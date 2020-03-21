package com.hp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;
import com.hp.entity.UserServiceDataEntity;

public interface AcRepairFormRepository extends CrudRepository<AcRepairFormEntity, Long>{

	@Query("SELECT new com.hp.dto.AcRepairFormDatadto(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,r.userName,p.userName,a.activeStatus) FROM AcRepairFormEntity a JOIN Registration r on a.userid=r.id JOIN Provider p on a.providerid=p.id")
	public List<AcRepairFormDatadto> getAllUserServiceData();

	@Query("SELECT new com.hp.dto.AcRepairFormDatadto(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,r.userName,p.userName,a.activeStatus) FROM AcRepairFormEntity a JOIN Registration r on a.userid=r.id JOIN Provider p on a.providerid=p.id WHERE a.id = :id")
	public AcRepairFormDatadto findServiceById(@Param("id") long id);
	
	@Query("SELECT new com.hp.dto.AcRepairFormDatadto(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,r.userName,p.userName,a.activeStatus) FROM AcRepairFormEntity a JOIN Registration r on a.userid=r.id JOIN Provider p on a.providerid=p.id WHERE a.userid = :id")
	public List<AcRepairFormDatadto> orderDetailById(@Param("id") long id);
}
