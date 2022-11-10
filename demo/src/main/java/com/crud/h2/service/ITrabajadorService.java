package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Trabajador;

public interface ITrabajadorService {

	//Metodos del CRUD
	public List<Trabajador> listarTrabajadores(); //Listar All 
	
	public Trabajador guardarTrabajador(Trabajador trabajador);	//Guarda un cliente CREATE
	
	public Trabajador TrabajadorXID(Long id); //Leer datos de un cliente READ
	
	public List<Trabajador> listarTrabajadorNomnbre(String nombre);//Listar Clientes por campo nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); //Actualiza datos del cliente UPDATE
	
	public void eliminarTrabajador(Long id);// Elimina el cliente DELETE
	
}
