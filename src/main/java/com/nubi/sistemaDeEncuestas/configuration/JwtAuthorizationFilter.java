package com.nubi.sistemaDeEncuestas.configuration;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.filter.OncePerRequestFilter;

//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.MalformedJwtException;
//import io.jsonwebtoken.UnsupportedJwtException;

//public class JwtAuthorizationFilter extends OncePerRequestFilter {

//	private final String HEADER = "Authorization";
//	private final String PREFIX = "Bearer ";
//	private final String SECRET = "llave";
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//
//		try {
//			if (isExisteToken(request, response)) {
//				Claims claims = validateToken(request);
//				if(claims.get("authorities") != null) {
//					setUpSpringAuthentication(claims);
//				}else {
//					SecurityContextHolder.clearContext();
//				}
//			} else {
//				SecurityContextHolder.clearContext();
//			}
//			
//			filterChain.doFilter(request, response);
//
//		} catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException e) {
//			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//			((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, e.getMessage());
//			return;
//		}
//
//	}
//	
//	//Se añade la configuración necesaria para autorizar la petición
//	private void setUpSpringAuthentication(Claims claims) {
//		
//		List<String> authorities = (List) claims.get("authorities");
//		
//		//El GrantedAuthority se incluyó en el token durante la autenticación
//		UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
//														claims.getSubject(), null, authorities
//																							.stream()
//																							.map(SimpleGrantedAuthority::new)
//																							.collect(Collectors.toList()));
//		SecurityContextHolder.getContext().setAuthentication(auth);
//	}
//
//	// Desencripta y valida el token
//	private Claims validateToken(HttpServletRequest request) {
//
//		String jwtToken = request.getHeader(HEADER).replace(PREFIX, "");
//
//		return Jwts.parser().setSigningKey(SECRET.getBytes()).parseClaimsJws(jwtToken).getBody();
//	}
//
//	
//	//Comprueba si existe el token
//	private boolean isExisteToken(HttpServletRequest request, HttpServletResponse response) {
//
//		String authenticationHeader = request.getHeader(HEADER);
//
//		if (authenticationHeader == null || !authenticationHeader.startsWith(PREFIX))
//			return false;
//
//		return true;
//	}

//}
