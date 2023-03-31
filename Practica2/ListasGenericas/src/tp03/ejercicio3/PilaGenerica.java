package tp03.ejercicio3;
import tp02.ejercicio2.*;
public class PilaGenerica <T> {
	ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
	int tamanio = 0;
	public PilaGenerica(){
		lista.comenzar();
	}
	public void apilar(T elem){
		lista.agregarInicio(elem);
		tamanio += 1;
	}
	public T desapilar() {
		T dato = lista.elemento(1);
		lista.eliminarEn(1);
		tamanio -= 1;
		return dato;
	}
	public T tope() {
		return(lista.elemento(1));
	}
	public boolean esVacia(){
		return(tamanio == 0);
	}
}
