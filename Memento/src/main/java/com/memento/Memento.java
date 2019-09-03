package com.memento;

public class Memento {

	private Juego estado;

	public Memento(Juego estado) { //ES UN CONTRUCTOR QUE SIRVE PARA GUARDARLO EN LA VARIABLE
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

}
