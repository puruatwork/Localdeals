package com.geekreboot.localdeal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JwtResponseDto {
	private String token;
	private String username;
	private Status status;

	public enum Status {
		SUCCESS, ERROR
	}

	public JwtResponseDto() {
	}

	public JwtResponseDto(String token, String username) {
		this.token = token;
		this.username = username;
		this.status = Status.SUCCESS;
	}

}