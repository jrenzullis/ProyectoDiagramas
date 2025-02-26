package org.cuatrovientos.ed.ejercicio4;

public class Producto {
	    private String nombre;
	    private boolean comprado;

	
	    public Producto(String nombre) {
	        this.nombre = nombre;
	        this.comprado = false;
	    }

	    public void marcarComoComprado() {
	        this.comprado = true;
	    }

	
	    public boolean estaComprado() {
	        return comprado;
	    }

	
	    @Override
	    public String toString() {
	        return nombre + (comprado ? " (Comprado)" : " (Pendiente)");
	    }
	}


