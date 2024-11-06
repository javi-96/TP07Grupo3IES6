package ar.edu.ies6.tp07.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Docente {

//atributos de un docente
@Column
private String nombre;
@Column
private String apellido;
@Id
private String dni;
@Column
private LocalDate FechaNacimiento;
@Column
private Boolean estado;


// constructor por defecto
public Docente() {
	// TODO Auto-generated constructor stub
}



// contructor por parametros, si o si va. porq sino no nos permite cargar un docente
public Docente(String nombre, String apellido, String dni, LocalDate FechaNacimiento, Boolean estado) {
	
}


//metdosaccesores
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}



public LocalDate getFechaNacimiento() {
	return FechaNacimiento;
}



public void setFechaNacimiento(LocalDate fechaNacimiento) {
	FechaNacimiento = fechaNacimiento;
}





public Boolean getEstado() {
	return estado;
}



public void setEstado(Boolean estado) {
	this.estado = estado;
}


// metodo de interfaz
@Override
public String toString() {
	return "Docente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" 
			+ ", FechaNacimiento=" + FechaNacimiento + ", estado=" + estado + "]";
}









}

