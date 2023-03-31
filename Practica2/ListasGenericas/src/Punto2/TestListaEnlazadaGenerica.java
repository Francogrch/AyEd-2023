package Punto2;
import tp02.ejercicio2.*;
public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estu1 = new Estudiante(null, null, null, null, null);
		Estudiante estu2 = new Estudiante(null, null, null, null, null);
		Estudiante estu3 = new Estudiante(null, null, null, null, null);
		Estudiante estu4 = new Estudiante(null, null, null, null, null);
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<Estudiante>();
		lista.agregarInicio(estu1);
		lista.agregarInicio(estu2);
		lista.agregarInicio(estu3);
		lista.agregarInicio(estu4);
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println((lista.proximo().tusDatos()));
		}
	}

}
