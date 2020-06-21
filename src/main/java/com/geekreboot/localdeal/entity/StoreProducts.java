package com.geekreboot.localdeal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StoreProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "product_id")
	private Integer productId;
	private String cost;
	@Column(name = "store_id")
	private Integer storeId;
}
