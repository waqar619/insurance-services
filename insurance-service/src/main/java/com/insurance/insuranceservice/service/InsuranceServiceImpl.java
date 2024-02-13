package com.insurance.insuranceservice.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.insuranceservice.entity.InsuranceServiceEntity;
import com.insurance.insuranceservice.exception.BusinessException;
import com.insurance.insuranceservice.repository.InsuranceServiceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceServiceRepository insuranceServiceRepository;

	@Override
	public InsuranceServiceEntity addInsurance(InsuranceServiceEntity insuranceServiceEntity) {
		return insuranceServiceRepository.save(insuranceServiceEntity);
	}

	@Override
	public List<InsuranceServiceEntity> getAllInsurance() {
		return insuranceServiceRepository.findAll();
	}

	@Override
	public InsuranceServiceEntity updateInsurance(InsuranceServiceEntity insuranceServiceEntity) {

		// Optional<InsuranceServiceEntity> insuranceService = InsuranceServiceEntity();
		Optional<InsuranceServiceEntity> insuranceService = insuranceServiceRepository
				.findById(insuranceServiceEntity.getId());
		  if(insuranceService.isEmpty()) {
			  throw new BusinessException("6","No data found for Insurance id " + insuranceService + " in databases");
		  }
		return insuranceServiceRepository.save(insuranceServiceEntity);
	}

	@Override
	public void deleteInsuranceiId(int insuranceId) {

		Optional<InsuranceServiceEntity> insuranceServiceEntity = insuranceServiceRepository.findById(insuranceId);
		if (insuranceServiceEntity.isEmpty()) {
			throw new NoSuchElementException("No data found for Insurance id " + insuranceId + " in databases");
		}
		insuranceServiceRepository.deleteById(insuranceId);

	}

}
