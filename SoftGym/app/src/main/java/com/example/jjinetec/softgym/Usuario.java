package com.example.jjinetec.softgym;

/**
 * Created by DarkKlitos on 27/11/16.
 */

public class Usuario {

	private String Correo;
	private String Direccion;
	private String Estatura;
	private String FechaNacimiento;
	private String Genero;
	private Long IMC;
	private Long IdUsuario;
	private Long Identificacion;
	private String Nombre;
	private Long Password;
	private String Peso;
	private Long RolId;
	private String UserName;
	private String Telefono;
	private String TipoSangre;
	private String FechaIngreso;
	private String CondicionMedica;

	public Usuario () {

	}


	public String getCorreo ( ) {
		return Correo;
	}

	public void setCorreo ( String correo ) {
		Correo = correo;
	}

	public String getDireccion ( ) {
		return Direccion;
	}

	public void setDireccion ( String direccion ) {
		Direccion = direccion;
	}

	public String getEstatura ( ) {
		return Estatura;
	}

	public void setEstatura ( String estatura ) {
		Estatura = estatura;
	}

	public String getFechaNacimiento ( ) {
		return FechaNacimiento;
	}

	public void setFechaNacimiento ( String fechaNacimiento ) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getGenero ( ) {
		return Genero;
	}

	public void setGenero ( String genero ) {
		Genero = genero;
	}

	public Long getIMC ( ) {
		return IMC;
	}

	public void setIMC ( Long IMC ) {
		this.IMC = IMC;
	}

	public Long getIdUsuario ( ) {
		return IdUsuario;
	}

	public void setIdUsuario ( Long idUsuario ) {
		IdUsuario = idUsuario;
	}

	public Long getIdentificacion ( ) {
		return Identificacion;
	}

	public void setIdentificacion ( Long identificacion ) {
		Identificacion = identificacion;
	}

	public String getNombre ( ) {
		return Nombre;
	}

	public void setNombre ( String nombre ) {
		Nombre = nombre;
	}

	public Long getPassword ( ) {
		return Password;
	}

	public void setPassword ( Long password ) {
		Password = password;
	}

	public String getPeso ( ) {
		return Peso;
	}

	public void setPeso ( String peso ) {
		Peso = peso;
	}

	public Long getRolId ( ) {
		return RolId;
	}

	public void setRolId ( Long rolId ) {
		RolId = rolId;
	}

	public String getUserName ( ) {
		return UserName;
	}

	public void setUserName ( String userName ) {
		UserName = userName;
	}
	public String getTelefono ( ) { return Telefono;	}

	public void setTelefono ( String telefono ) {	Telefono = telefono;	}

	public String getTipoSangre ( ) {
		return TipoSangre;
	}

	public void setTipoSangre ( String tipoSangre ) {
		TipoSangre = tipoSangre;
	}

	public String getFechaIngreso ( ) {
		return FechaIngreso;
	}

	public void setFechaIngreso ( String fechaIngreso ) {
		FechaIngreso = fechaIngreso;
	}

	public String getCondicionMedica ( ) {
		return CondicionMedica;
	}

	public void setCondicionMedica ( String condicionMedica ) {
		CondicionMedica = condicionMedica;
	}
}
