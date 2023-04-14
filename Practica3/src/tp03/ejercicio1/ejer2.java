package tp03.ejercicio1;
public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario <Integer> raiz = new ArbolBinario<Integer>(3);
		ArbolBinario <Integer> der = new ArbolBinario<Integer>(4);
		ArbolBinario <Integer> izq = new ArbolBinario<Integer>(6);
		ArbolBinario <Integer> izq2 = new ArbolBinario<Integer>(6);
		ArbolBinario <Integer> der2 = new ArbolBinario<Integer>(6);
		ArbolBinario <Integer> izq3 = new ArbolBinario<Integer>(6);
		der.agregarHijoDerecho(der2);
		izq.agregarHijoIzquierdo(izq2);
		der.agregarHijoIzquierdo(izq3);
		
		
		raiz.agregarHijoDerecho(der);
		raiz.agregarHijoIzquierdo(izq);
		
		System.out.println(raiz.contarHojas());
		ArbolBinario <Integer> espejito = raiz.espejo();
		System.out.println(raiz.getHijoDerecho().getDato());
		System.out.println(raiz.getHijoIzquierdo().getDato());
		System.out.println(espejito.getHijoDerecho().getDato());
		System.out.println(espejito.getHijoIzquierdo().getDato());
	}

}
