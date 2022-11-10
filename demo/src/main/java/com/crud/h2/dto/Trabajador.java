package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

enum job {
	
	Cocinero,
	Programador,
	Barrendero,
	Paleta,
	Otros
	
}

@Entity
@Table(name="trabajador")//en caso que la tabala sea diferente
public class Trabajador {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "job")//no hace falta si se llama igual
	private job trabajo;

	
	//Constructores
	
	public Trabajador() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 */
	public Trabajador(Long id, String nombre, job trabajo) {

		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		
	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public job getJob() {
		return trabajo;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setJob(job trabajo) {
		this.trabajo = trabajo;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", job=" + trabajo + "]";
	}
	
	
	
	
	
}
