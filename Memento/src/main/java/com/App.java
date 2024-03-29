package com;

import com.memento.Caretaker;
import com.memento.Juego;
import com.memento.Originator;

public class App {

	public static void main(String[] args) {
		String nombreJuego = "ValleGrande";
		
		Juego juego = new Juego();///CREAMOS UNA INSTANCIA DE JUEGO 1 Y LUEGO LOS DEMAS
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);

		Caretaker caretaker = new Caretaker();//INSTANCIO LAS CLASES
		Originator originator = new Originator();

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		originator.setEstado(juego);//AQUI EN LA SIGUIENTE PASE DEL JUEGO MUESTRA QUE YA VA A TENER UN ESTADO 

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);		
		originator.setEstado(juego);//AQUI EN LA SIGUIENTE PASE DEL JUEGO MUESTRA QUE YA VA A TENER UN ESTADO 
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION "0" Y GUARDA EL ESTADO

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION "1" Y GUARDA EL ESTADO

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION "2" Y GUARDA EL ESTADO
		originator.restaurar(caretaker.getMemento(1));// AQUI PONEMOS EL NUMERO QUE QUEREMOS RESTAURAR DACUERDO COMO LO DECLARAMOS ARRIBA
                
         
		juego = originator.getEstado();
		System.out.println(juego);
	}

}
