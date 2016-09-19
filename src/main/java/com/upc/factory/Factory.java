package com.upc.factory;

import com.upc.service.IUsuario;
import com.upc.service.impl.Usuarioserviceimpl;

public class Factory {
	
	private static Factory fac;
	
	private Factory (){
		
	}
	
	public static Factory getInstance(){
		
		if (fac==null) {
			fac= new Factory();
		}
		return fac;
	}
	
	public IUsuario getUsuario(){
		return new Usuarioserviceimpl();
	}

}
