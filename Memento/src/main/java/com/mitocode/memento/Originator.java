package com.mitocode.memento;
//ESTA CLASE GURADA EL OBJETO
public class Originator {

	private Juego estado; //TENEMOS UN ATRIBUTO JUEGO QUE LO ESTAMOS LLAMANDO ESTADO

	public void setEstado(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

	public Memento guardar() {//AQUI CREA UNA NUEVA INSTANCIA MEMENTO CON EL ESTADO QUE DECLARAMOS ARRIBA ESTADO Y GUARDA EL ESTADO ESTO ES EL METODO 
		return new Memento(estado);//RETORNA
	}

	public void restaurar(Memento m) {// AQUI LO RECUPERA
		this.estado = m.getEstado();
	}
}
