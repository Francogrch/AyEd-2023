package Punto1;
import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class mainPunto1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		punto1_6 f = new punto1_6();
		ListaDeEnterosEnlazada l = f. calcularSucesion(4);
		l.comenzar();
		while (!l.fin()){
			System.out.println(l.proximo());
		}
	}

}
