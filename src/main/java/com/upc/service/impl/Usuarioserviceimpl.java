package com.upc.service.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.upc.ds.Dbconexion;
import com.upc.dto.Usuario;
import com.upc.service.IUsuario;

public class Usuarioserviceimpl implements IUsuario{

	@Override
	public void create(Usuario o) throws Exception {
		// TODO Auto-generated method stub
		String insert = "{call sp_insert_usuario(?,?,?,?,?,?,?)}";
		
		Connection cn =Dbconexion.conexion();
		
		cn.setAutoCommit(true);
		
		CallableStatement cs = cn.prepareCall(insert);
		
		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		
		cs.setString(2, "gustavo");
		cs.setString(3, "27236721");
		cs.setString(4, "tavo@gmail.com");
		cs.setString(5, "tavo12");
		cs.setString(6, "123");
		
		/*cs.setString(2, o.getNombreUsuario());
		cs.setString(3, o.getDniUsuario());
		cs.setString(4, o.getCorreoUsuario());
		cs.setString(5, o.getUsuario());
		cs.setString(6, o.getClave());*/
		
		String rol = "usuario";
		
		cs.setString(7, rol);
		
		cs.execute();
		
		String estado = cs.getString(1);
		
		cs.close();
		
		cs = null;
		
		if (!estado.equals("ok")) {
			throw new Exception(estado);
		}
		
		
	}

	@Override
	public void update(Usuario o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario get(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
