package ejer4;

public class testEjer4 {
	public static void main(String arg[]) {
		ArbolGeneral<Integer> ar = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> ar1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> ar2 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> ar20 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> ar21 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> ar3 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> ar4 = new ArbolGeneral<Integer>(5);
		ar3.agregarHijo(ar4);
		ar2.agregarHijo(ar3);
		ar2.agregarHijo(ar20);
		ar2.agregarHijo(ar21);
		ar1.agregarHijo(ar2);
		ar.agregarHijo(ar1);
		System.out.print(ar.ancho());
	}
	
}
