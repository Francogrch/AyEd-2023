package ejer3;
import tp04.src.tp02.ejercicio2.*;
import tp04.src.tp04.ejercicio1.*;
public class pruebaPun3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecorridosAG reco = new RecorridosAG();
		ArbolGeneral<Integer> ar = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> ar1 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> ar2 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> ar3 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> ar4 = new ArbolGeneral<Integer>(11);
		ar1.agregarHijo(ar2);
		ar3.agregarHijo(ar4);
		ar3.agregarHijo(ar4);
		ar.agregarHijo(ar1);
		ar.agregarHijo(ar3);
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		l = reco.numerosParesMayoresQueInOrden(ar, 4);
		l.comenzar();
		while (!(l.fin())){
			System.out.println(l.proximo());
		}
	}

}
