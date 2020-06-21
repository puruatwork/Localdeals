package com.geekreboot.localdeal.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "user_id")
	private long userId;
	@Column(name = "vendor_id")
	private long vendorId;
	@Column(name = "order_date")
	private LocalDate orderDate;
	@Column(name = "email")
	private String email;
	@Column(name = "shipped_date")
	private String shippedDate;
	@Column(name = "ship_to_name")
	private String shipToName;
	@Column(name = "ship_to_address")
	private String shipToAddress;
	@Column(name = "ship_to_city")
	private String shipToCity;
}
