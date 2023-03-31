package Punto1;
import tp02.ejercicio1.*;
public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		for (int i = 0; i < args.length; i++) {
			lista.agregarInicio(Integer.parseInt(args[i]));
		}
		lista.comenzar();
		imprimirLista(lista);
	}
	private static void imprimirLista(ListaDeEnterosEnlazada list) {
			if (!list.fin()) {
				int elem = list.proximo();
				imprimirLista(list);
				System.out.println(elem);
			}
	}


}
