package ejer3;
import tp04.src.tp02.ejercicio2.*;
import tp04.src.tp04.ejercicio1.*;
public class RecorridosAG {
	ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
	
	private void preOrden(ArbolGeneral<Integer> a,Integer n){
		if ((a.getDato() > n) && (a.getDato() % 2 != 0)) {
			l.agregarInicio(a.getDato());
		}
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos =a.getHijos();
			hijos.comenzar();
			while (hijos.fin() != true) {
				preOrden(hijos.proximo(),n);
			} 
		}
	}
	
	private void inOrden(ArbolGeneral<Integer> a, Integer n){
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			ArbolGeneral<Integer> hijo_izq = hijos.proximo();
			if ((hijo_izq.getDato() > n) && (hijo_izq.getDato() % 2 != 0)){
				l.agregarInicio(hijo_izq.getDato());
			}
		}
		if ((a.getDato() > n) && (a.getDato() % 2 != 0)) {
			l.agregarInicio(a.getDato());
		}
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			while (hijos.fin() != true) {
				inOrden(hijos.proximo(),n);
			}
		}
	}
	public void posOrden(ArbolGeneral<Integer> a,Integer n) {
		if (a.tieneHijos()){
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				posOrden(hijos.proximo(),n);
			}
		}
		Integer dato = a.getDato();
		if ((dato > n) && (dato % 2 != 0)) {
			l.agregarInicio(dato);
		}
	}
	public ListaGenerica<Integer> numerosParesMayoresQuePreOrden(ArbolGeneral<Integer> a,Integer n){
		l.comenzar();
		preOrden(a,n);
		return l;
	
	}
	public ListaGenerica<Integer> numerosParesMayoresQueInOrden(ArbolGeneral<Integer> a,Integer n){
		l.comenzar();
		inOrden(a,n);
		return l;
	}

	public ListaGenerica<Integer> numerosParesMayoresQuePosOrden(ArbolGeneral<Integer> a, Integer n){
		l.comenzar();
		posOrden(a,n);
		return l;
	}
}