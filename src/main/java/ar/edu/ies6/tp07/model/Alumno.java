package ar.edu.ies6.tp07.model;

import java.time.LocalDate;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Alumno {

	
		/// crear los atributos
			
			@Column
		private String nombre;
			@Column
		private String apellido;
			@Id
		private String dni;
			@Column
		private String gmail;
			@Column
		private String edad;
			@Column
		private LocalDate fechaDeNacimiento;
			@Column
		private Boolean estado;
		
		// contructor por defecto
		public Alumno() {
			
        }
		
		
		// contructor por parametro: va si osi para poder cargar alumnos

        public Alumno(String nombre, String apellido, String dni, String gmail, String edad,
				LocalDate fechaDeNacimiento, Boolean estado) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.gmail = gmail;
			this.edad = edad;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.estado = estado;
		}
        
        
      //metodo Accesores
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


		public String getGmail() {
			return gmail;
		}
        public void setGmail(String gmail) {
			this.gmail = gmail;
		}


		public String getEdad() {
			return edad;
		}
        public void setEdad(String edad) {
			this.edad = edad;
		}


		public LocalDate getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}
        public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
    	this.fechaDeNacimiento = fechaDeNacimiento;
		}


		public Boolean getEstado() {
			return estado;
		}
        public void setEstado(Boolean estado) {
			this.estado = estado;
		}

    ////metodo de interfaz el to String
		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", gmail=" + gmail
					+ ", edad=" + edad + ", fechaDeNacimiento=" + fechaDeNacimiento + ", estado=" + estado + "]";
		} 

}

