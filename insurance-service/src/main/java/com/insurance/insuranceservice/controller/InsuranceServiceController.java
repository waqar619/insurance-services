package com.insurance.insuranceservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceservice.entity.InsuranceServiceEntity;
import com.insurance.insuranceservice.service.InsuranceService;

@RestController
public class InsuranceServiceController {

	@Autowired
	private InsuranceService insuranceService;

	@PostMapping("/saveInsurance")
	public ResponseEntity<InsuranceServiceEntity> addInsurance(
			@RequestBody InsuranceServiceEntity insuranceServiceEntity) {

		// InsuranceServiceEntity insurancetest = null;
		try {
			InsuranceServiceEntity insurancetest = insuranceService.addInsurance(insuranceServiceEntity);
			return ResponseEntity.of(Optional.of(insurancetest));
			// ResponseEntity.ok(null)
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@RequestMapping("getall")
	public ResponseEntity<List<InsuranceServiceEntity>> getAllInsurance() {
		List<InsuranceServiceEntity> list = insuranceService.getAllInsurance();

		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else

			return ResponseEntity.of(Optional.of(list));

	}

	@PutMapping("/updateinsurance")
	public ResponseEntity<InsuranceServiceEntity> updateInsurance(
			@RequestBody InsuranceServiceEntity insuranceServiceEntity) {

		InsuranceServiceEntity insurancetest = new InsuranceServiceEntity();

		insurancetest = insuranceService.updateInsurance(insuranceServiceEntity);
		return ResponseEntity.of(Optional.of(insurancetest));

	}

	@DeleteMapping("/deleteInsuranceId")
	public ResponseEntity<?> deleteInsurance(@RequestParam(value = "userId") int insuranceId) {
		// try {
		insuranceService.deleteInsuranceiId(insuranceId);
		return ResponseEntity.status(HttpStatus.OK).build();
//		} catch (NoSuchElementException e) {
//			Map<String, String> responseBody = new HashMap<>();
//            responseBody.put("error", e.getMessage());
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
//		}

	}

}
