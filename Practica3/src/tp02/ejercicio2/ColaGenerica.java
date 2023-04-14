package tp02.ejercicio2;

public class ColaGenerica<T>{
	ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
	int tamanio = 0;
	public ColaGenerica(){
		lista.comenzar();
	}
	public void encolar(T elem) {
		lista.agregarFinal(elem);
		tamanio += 1;
	}
	public T desencolar(){
		T dato = lista.elemento(1);
		lista.eliminarEn(1);
		tamanio -= 1;
		return dato;
	}
	public T tope(){
		T dato = lista.elemento(1);
		return dato;
	}
	
	public boolean esVacia() {
		return (tamanio == 0);
	}
}
