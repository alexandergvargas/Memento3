package com.mitocode.memento;

import java.util.ArrayList;

public class Caretaker {

	private ArrayList<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento m) {//AQUI SE GUARDA SE ALMACENA LOS DIFERENTES ESTADOS POR EL METODO ADDMEMENTO
		mementos.add(m);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
