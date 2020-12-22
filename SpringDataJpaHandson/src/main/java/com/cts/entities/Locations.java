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
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Locations {
	@Id
	private int locationId;
	private String streetAddress;
	private int postalCode;
	private String city;
	private String stateProvince;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Countries countryId;
}
