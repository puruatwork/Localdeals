package com.geekreboot.localdeal.dto;

import lombok.Data;

@Data
public class UserDto {

	private long id;
	private String username;
	private String password;
	private String roles;
	private String firstName;
	private String lastName;
	private String contactName;
	private String contactNumber;
	private String email;
	private String address;
	private String city;

}
