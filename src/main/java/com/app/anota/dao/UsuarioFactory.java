package com.app.anota.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fabrica")
public class UsuarioFactory {
	
	@Autowired
	UsuarioImplOracle usrOracle;
	
	public void getInsertar() {
		usrOracle.insertar();
	}
	
	
	
}
