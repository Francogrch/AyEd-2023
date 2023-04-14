package tp02.ejercicio2;
public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario <Integer> raiz = new ArbolBinario<Integer>(3);
		ArbolBinario <Integer> der = new ArbolBinario<Integer>(4);
		ArbolBinario <Integer> izq = new ArbolBinario<Integer>(6);
		ArbolBinario <Integer> izq2 = new ArbolBinario<Integer>(8);
		ArbolBinario <Integer> der2 = new ArbolBinario<Integer>(9);
		ArbolBinario <Integer> izq3 = new ArbolBinario<Integer>(10);
		izq2.agregarHijoDerecho(der);
		der.agregarHijoDerecho(der2);
		der.agregarHijoIzquierdo(izq3);
		izq.agregarHijoIzquierdo(izq2);
		raiz.agregarHijoDerecho(der);
		raiz.agregarHijoIzquierdo(izq);
		
		System.out.println(raiz.contarHojas());
		ArbolBinario <Integer> espejito = raiz.espejo();
		
		raiz.entreNiveles(0, 5);
	}

}
