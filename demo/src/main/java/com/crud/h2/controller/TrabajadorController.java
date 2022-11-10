package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Trabajador;
import com.crud.h2.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl TrabajadorServideImpl;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajador(){
		return TrabajadorServideImpl.listarTrabajadores();
	}
	
	//listar Clientes por campo nombre
	@GetMapping("/trabajadores/nombre/{nombre}")
	public List<Trabajador> listarTrabajadorNombre(@PathVariable(name="nombre") String nombre) {
	    return TrabajadorServideImpl.listarTrabajadorNomnbre(nombre);
	}
	
	
	@PostMapping("/trabajadores")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		
		return TrabajadorServideImpl.guardarTrabajador(trabajador);
	}
	
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador TrabajadorXID(@PathVariable(name="id") Long id) {
		
		Trabajador cliente_xid= new Trabajador();
		
		cliente_xid=TrabajadorServideImpl.TrabajadorXID(id);
		
		System.out.println("Trabajador XID: "+cliente_xid);
		
		return cliente_xid;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id, @RequestBody Trabajador trabajador) {
		
		Trabajador cliente_seleccionado = new Trabajador();
		Trabajador cliente_actualizado = new Trabajador();
		
		cliente_seleccionado = TrabajadorServideImpl.TrabajadorXID(id);
		
		cliente_seleccionado.setNombre(trabajador.getNombre());
		cliente_seleccionado.setJob(trabajador.getJob());
		
		cliente_actualizado = TrabajadorServideImpl.actualizarTrabajador(cliente_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ cliente_actualizado);
		
		return cliente_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajador(@PathVariable(name="id")Long id) {
		TrabajadorServideImpl.eliminarTrabajador(id);
	}
	
	
}
