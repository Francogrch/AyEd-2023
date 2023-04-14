package tp03.ejercicio3;
import tp02.ejercicio2.*;
public class testContadorArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> der = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> izq = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> der1 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> izq1 = new ArbolBinario<Integer>(7);
		ColaGenerica<Integer> cola = new ColaGenerica<Integer>();
		
		ContadorArbol contador = new ContadorArbol();
		der.agregarHijoIzquierdo(izq1);
		der1.agregarHijoDerecho(izq1);
		der.agregarHijoDerecho(der1);
		izq.agregarHijoDerecho(der);
		izq.agregarHijoIzquierdo(der);
		arbol.agregarHijoDerecho(der);
		arbol.agregarHijoIzquierdo(izq);
		
		cola = contador.numerosPares(arbol);
		System.out.println(cola.desencolar());
		while (!cola.esVacia()) {
			System.out.println(cola.desencolar());
		}
	}

}
