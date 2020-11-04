package com.cic.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cic.domain.Recharge;

@Repository
@Transactional
public interface RechargeRepository extends  JpaRepository<Recharge, Long>{
	
	List<Recharge> findAll();
	
	@Query("SELECT a FROM Recharge a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.feeCharge IS NOT NULL")
	List<Recharge> findByPhoneNum(@Param("phoneNum") String phoneNum);
}
