package Punto1;
import tp02.ejercicio1.*;
public class punto1_6 {
	ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
	
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		int temp;
		if (n != 1){ 
			if (n % 2 == 0) {
				temp = n/2;
			}else{
				temp = ((3*n) + 1);
			}
			lista.agregarFinal(temp);
			calcularSucesion(temp);
		}
		return lista;
	}

}
