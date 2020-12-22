package com.cts.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "job_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobHistory implements Serializable{
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Employees> employeeId;
	private String startDate;
	private String endDate;
	@Id
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Jobs jobId;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Departments departmentId;
}
