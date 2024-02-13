package com.insurance.insuranceservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "insurance")
public class InsuranceServiceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type_of_insurance;
	private String description;
	
	public InsuranceServiceEntity(int id, String type_of_insurance, String description) {
		super();
		this.id = id;
		this.type_of_insurance = type_of_insurance;
		this.description = description;
	}

	public InsuranceServiceEntity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType_of_insurance() {
		return type_of_insurance;
	}

	public void setType_of_insurance(String type_of_insurance) {
		this.type_of_insurance = type_of_insurance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
