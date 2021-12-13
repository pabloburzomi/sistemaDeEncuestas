package com.nubi.sistemaDeEncuestas.configuration;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Configuration;

//@Configuration
//public class AppToken {
//	
//	public String getJWTToken(String username) {
//		
//		String secretKey = "llave";
//		
//		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
//		
//		String token = Jwts
//				.builder()
//				.setId("encuestas")
//				.setSubject(username)
//				.claim("authorities",
//						grantedAuthorities.stream()
//								.map(GrantedAuthority::getAuthority)
//								.collect(Collectors.toList()))
//				.setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis() + 100000))
//				.signWith(SignatureAlgorithm.HS512,
//						secretKey.getBytes())
//				.compact();
//
//		return "Bearer " + token;
//	}
//
//}
