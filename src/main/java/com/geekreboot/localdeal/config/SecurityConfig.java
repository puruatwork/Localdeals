package com.geekreboot.localdeal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.geekreboot.localdeal.exception.JwtAuthenticationEntryPoint;
import com.geekreboot.localdeal.jwt.JwtTokenVerifier;
import com.geekreboot.localdeal.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;

	@Autowired
	private Environment environment;

	@Autowired
	private JwtTokenVerifier jwtTokenVerifier;

	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// disable CSRF required if request is from browser
		http.csrf().disable();
				// dont authenticate this particular request
				//.authorizeRequests().antMatchers("*").permitAll()
				// other request need to be authenticated
				//.anyRequest().authenticated().and()
				// exception handling
				//.exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and()
				// session management
				//.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		//http.addFilterBefore(jwtTokenVerifier, UsernamePasswordAuthenticationFilter.class);
		http.headers().frameOptions().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(new Pbkdf2PasswordEncoder(environment.getProperty("password.encoder.key")));
		provider.setUserDetailsService(userService);
		auth.authenticationProvider(provider);
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

}
