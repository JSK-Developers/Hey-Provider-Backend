package com.hp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hp.dto.AcRepairFormDatadto;
import com.hp.entity.AcRepairFormEntity;

public interface AcRepairFormRepository extends CrudRepository<AcRepairFormEntity, Long>{

	@Query("SELECT new com.hp.entity.AcRepairFormEntity(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,a.userid,a.providerid,a.activeStatus,a.end_services_otp,a.window_ac_service,a.split_ac_service,a.less_no_cooling,a.ac_not_starting,a.noise_issue,a.water_leakege) FROM AcRepairFormEntity a ")
	public List<AcRepairFormEntity> getAllUserServiceData();

	@Query("SELECT new com.hp.entity.AcRepairFormEntity(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,a.userid,a.providerid,a.activeStatus,a.end_services_otp,a.window_ac_service,a.split_ac_service,a.less_no_cooling,a.ac_not_starting,a.noise_issue,a.water_leakege) FROM AcRepairFormEntity a WHERE a.id = :id")
	public AcRepairFormEntity findServiceById(@Param("id") long id);
	
	@Query("SELECT new com.hp.dto.AcRepairFormDatadto(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.end_services_otp,a.landmark,a.city,a.pincode,a.total,r.userName,p.userName,a.activeStatus,a.window_ac_service,a.split_ac_service,a.less_no_cooling,a.ac_not_starting,a.noise_issue,a.water_leakege) FROM AcRepairFormEntity a JOIN Registration r on a.userid=r.id JOIN Provider p on a.providerid=p.id WHERE a.userid = :id")
	public List<AcRepairFormDatadto> orderDetailById(@Param("id") long id);
	
	@Query("SELECT new com.hp.dto.AcRepairFormDatadto(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,r.userName,p.userName,a.activeStatus,a.end_services_otp,a.window_ac_service,a.split_ac_service,a.less_no_cooling,a.ac_not_starting,a.noise_issue,a.water_leakege) FROM AcRepairFormEntity a JOIN Registration r on a.userid=r.id JOIN Provider p on a.providerid=p.id WHERE a.activeStatus= 1 AND p.id= :id")
	public List<AcRepairFormDatadto> getAllCompletedServiceDetail(@Param("id") long id);
	
	@Query("SELECT new com.hp.dto.AcRepairFormDatadto(a.id,a.name,a.number,a.date,a.time,a.addresss1,a.landmark,a.city,a.pincode,a.total,r.userName,p.userName,a.activeStatus,a.end_services_otp,a.window_ac_service,a.split_ac_service,a.less_no_cooling,a.ac_not_starting,a.noise_issue,a.water_leakege) FROM AcRepairFormEntity a JOIN Registration r on a.userid=r.id JOIN Provider p on a.providerid=p.id WHERE a.activeStatus= 0 AND p.id= :id")
	public List<AcRepairFormDatadto> getAllPendingServiceDetail(@Param("id") long id);
}
