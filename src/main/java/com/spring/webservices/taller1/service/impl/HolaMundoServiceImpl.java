package com.spring.webservices.taller1.service.impl;

import javax.jws.WebService;

import com.spring.webservices.taller1.service.HolaMundoService;

@WebService(endpointInterface="com.spring.webservices.taller1.service.HolaMundoService")
public class HolaMundoServiceImpl implements HolaMundoService {

	@Override
	public String saludaHola(String text) {
		// TODO Auto-generated method stub
		System.out.println("Saluda: " + text);
		return "Saludo: " + text;
	}

}
