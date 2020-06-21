package com.geekreboot.localdeal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String code;
	private String name;
	private String desc;
	@Column(name = "grocery_type")
	private String groceryTypeEnum;
	@Column(name = "image_url")
	private String imageUrl;
}
