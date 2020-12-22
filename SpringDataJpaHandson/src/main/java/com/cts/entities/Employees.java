package com.cts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employees {
	
	@Id
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String hireDate;
	private int jobId;
	private int salary;
	private int commissionPct;
	private int managerId;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Departments departmentId;
	
}
