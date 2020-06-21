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
public class Invoices {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long orderld;
	@Column(name = "invoice_date")
	private LocalDate invoiceDate;
	@Column(name = "invoice_status")
	private String invoiceStauts;
}
