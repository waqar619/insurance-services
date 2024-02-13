package com.insurance.insuranceservice.service;

import java.util.List;

import com.insurance.insuranceservice.entity.InsuranceServiceEntity;

public interface InsuranceService {
	
	public InsuranceServiceEntity addInsurance(InsuranceServiceEntity insuranceServiceEntity);
	public InsuranceServiceEntity updateInsurance(InsuranceServiceEntity insuranceServiceEntity);
	
	public void deleteInsuranceiId(int insuranceId);
	
	public List<InsuranceServiceEntity> getAllInsurance();

}
