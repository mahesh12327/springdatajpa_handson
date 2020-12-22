package com.cts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Departments {
	
	@Id
	private int departmentId;
	private String departmentName;
	private int managerId;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Locations locationId;
}
