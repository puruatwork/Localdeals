package com.geekreboot.localdeal.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.geekreboot.localdeal.service.PrincipleDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenUtil {

	public static final int EXPIRATION_IN_SECONDS = 1200000;

	@Value("${security.jwt.key}")
	private String secret;

	private JwtTokenUtil() {
		// Hide default constructor
	}

	public String getUsernameFromToken(String token) {
		return extractClaims(token).getSubject();
	}

	public Boolean validateToken(String token, UserDetails userDetails) {
		PrincipleDetails user = (PrincipleDetails) userDetails;
		final String username = getUsernameFromToken(token);
		return (username.equals(user.getUsername()) && !isTokenExpired(token));
	}

	public Date getIssuedAtDateFromToken(String token) {
		return extractClaims(token).getIssuedAt();
	}

	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return "Bearer " + doGenerateToken(claims, userDetails.getUsername());
	}

	private String doGenerateToken(Map<String, Object> claims, String subject) {
		final Date createdDate = new Date();
		final Date expirationDate = calculateExpirationDate(createdDate);

		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(createdDate)
				.setExpiration(expirationDate).signWith(Keys.hmacShaKeyFor(secret.getBytes())).compact();
	}

	private Date calculateExpirationDate(Date createdDate) {
		return new Date(createdDate.getTime() + EXPIRATION_IN_SECONDS);
	}

	public String createToken(String username, Date issueDate) {
		return Jwts.builder().setSubject(username).setIssuedAt(issueDate)
				.setExpiration(new Date(issueDate.getTime() + EXPIRATION_IN_SECONDS))
				.signWith(Keys.hmacShaKeyFor(secret.getBytes())).compact();

	}

	public String getSubject(String token) {
		Claims claims = extractClaims(token);
		return claims.getSubject();
	}

	public String refreshToken(String token) {
		final Claims claims = extractClaims(token);

		Date now = new Date();
		claims.setIssuedAt(now);
		claims.setExpiration(new Date(now.getTime() + EXPIRATION_IN_SECONDS));

		return createTokenFromClaims(claims);
	}

	public boolean isTokenExpired(String token) {
		final Claims claims = extractClaims(token);
		Date now = new Date();

		return now.after(claims.getExpiration());
	}

	private String createTokenFromClaims(Claims claims) {
		return Jwts.builder().setClaims(claims).signWith(Keys.hmacShaKeyFor(secret.getBytes())).compact();
	}

	private Claims extractClaims(String token) {
		return Jwts.parserBuilder().setSigningKey(secret.getBytes()).build().parseClaimsJws(token).getBody();
	}

}