package com.geekreboot.localdeal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JwtRequestDto {
	private String username;
	private String password;

}
