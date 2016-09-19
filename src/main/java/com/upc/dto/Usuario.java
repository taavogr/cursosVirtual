package com.upc.dto;

public class Usuario {
	
	private int idUsuario;
	private String nombreUsuario;
	private String dniUsuario;
	private String correoUsuario;
	private String Usuario;
	private String Clave;
	private String rolUsuario;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getDniUsuario() {
		return dniUsuario;
	}
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getRolUsuario() {
		return rolUsuario;
	}
	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", dniUsuario=" + dniUsuario
				+ ", correoUsuario=" + correoUsuario + ", Usuario=" + Usuario + ", Clave=" + Clave + ", rolUsuario="
				+ rolUsuario + "]";
	}
	
	
	
	
	
	

}
