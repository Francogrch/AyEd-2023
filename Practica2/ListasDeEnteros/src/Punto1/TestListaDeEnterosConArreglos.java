package Punto1;
import tp02.ejercicio1.*;
public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		for (int i = 0; i < args.length; i++) {
			lista.agregarInicio(Integer.parseInt(args[i]));
		}
		lista.comenzar();
		for (int i = 0; i < lista.tamanio();i++){
			System.out.println(lista.proximo());
		}
	}

}
