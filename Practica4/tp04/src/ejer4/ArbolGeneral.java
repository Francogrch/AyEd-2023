package ejer4;
import tp04.src.tp02.ejercicio2.*;


public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			hijos.comenzar();
			while (!hijos.fin()) {
				
			}
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}

	public Integer altura() {
		Integer altura = -1;
		if (this.esHoja()) {
			return 0;
		}else {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				return Math.max(altura(), hijos.proximo().altura());
			}
		}
		return altura + 1;
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<>();
		Integer nivel = 0;
		ArbolGeneral<T> actual;
		if (!this.esVacio()) {
			cola.encolar(this);
		}
		cola.encolar(null);
		while (!cola.esVacia()) {
			actual = cola.desencolar();
			if (actual != null) {
				if (actual.getDato() == dato) {
					return nivel;
				}
				ListaGenerica<ArbolGeneral<T>> hijos = actual.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			} else {
				nivel++;
				cola.encolar(null);
			}
		}
		return nivel;
	}


	public Integer ancho(){
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> actual;
		Integer anchoMax = 0;
		// Si el arbol no esta vacio lo encolo
		if (!this.esVacio()){
			cola.encolar(this);
		}
		//Despues encolo null
		cola.encolar(null);
		while (!cola.esVacia()){ //Mientras la cola no este vacia
			int anchoActual = 0;
			actual = cola.desencolar(); //desencolo 
			while (!cola.esVacia() && (actual  != null)){ //mientras lo que desencole no sea null y tampoco termine la cola
				anchoActual++;
				if (actual.tieneHijos()){ //Si tiene hijos, los encolo
					ListaGenerica<ArbolGeneral<T>> hijos = actual.getHijos();
					hijos.comenzar();
					while (!hijos.fin()){
						cola.encolar(hijos.proximo());	
					}
				}
				anchoMax = Math.max(anchoMax,anchoActual);
				if (!cola.esVacia()) // Si no esta vacia encolo null ya que termine el nivel
					cola.encolar(null);
				actual=cola.desencolar(); //desencolo
			}
		}
		return anchoMax;
	}

}