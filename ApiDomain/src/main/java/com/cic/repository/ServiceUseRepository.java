package com.cic.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cic.domain.ServiceUse;

@Repository
@Transactional
public interface ServiceUseRepository extends  JpaRepository<ServiceUse, Long>{
	
	List<ServiceUse> findAll();
	
	@Query("SELECT a FROM ServiceUse a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.serviceId IS NOT NULL")
	List<ServiceUse> findByPhoneNum(@Param("phoneNum") String phoneNum);
}
