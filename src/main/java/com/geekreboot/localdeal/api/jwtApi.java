package com.geekreboot.localdeal.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.geekreboot.localdeal.dto.JwtRequestDto;
import com.geekreboot.localdeal.dto.JwtResponseDto;
import com.geekreboot.localdeal.jwt.JwtTokenUtil;
import com.geekreboot.localdeal.service.UserService;

@Controller
@RequestMapping("/")
public class jwtApi {

	@Autowired
	private UserService userService;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping(value = "/token")
	public ResponseEntity<JwtResponseDto> signin(@Validated @RequestBody JwtRequestDto request) {

		final Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);

		final UserDetails user = userService.loadUserByUsername(request.getUsername());

		final String token = jwtTokenUtil.generateToken(user);

		return ResponseEntity.ok(new JwtResponseDto(token, user.getUsername()));
	}

}
