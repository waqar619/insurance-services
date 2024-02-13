package com.insurance.insuranceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.insuranceservice.entity.InsuranceServiceEntity;

public interface InsuranceServiceRepository extends JpaRepository<InsuranceServiceEntity, Integer> {

}
