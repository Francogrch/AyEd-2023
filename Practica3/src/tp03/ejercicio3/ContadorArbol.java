package tp03.ejercicio3;
import tp02.ejercicio2.*;


public class ContadorArbol {
	private ColaGenerica<Integer> numerosParesIn(ArbolBinario<Integer> a,ColaGenerica<Integer> cola){
		if (!a.esVacio()) {
			if (a.tieneHijoDerecho()) {
				this.numerosParesIn(a.getHijoDerecho(),cola);
			}
			if ((a.getDato() % 2) == 0) {
				cola.encolar(a.getDato());
			}
			if (a.tieneHijoIzquierdo()) {
				this.numerosParesIn(a.getHijoIzquierdo(), cola);
			}
		}
		return cola;
	}
	
	private ColaGenerica<Integer> numerosParesPost(ArbolBinario<Integer> a, ColaGenerica<Integer> cola){
		if (!a.esVacio()) {
			if (a.tieneHijoDerecho()) {
				this.numerosParesPost(a.getHijoDerecho(),cola);
			}
			if (a.tieneHijoIzquierdo()) {
				this.numerosParesPost(a.getHijoIzquierdo(), cola);
			}
			if ((a.getDato() % 2) == 0) {
				cola.encolar(a.getDato());
			}
		}
		return cola;
	}
	public ColaGenerica<Integer> numerosPares(ArbolBinario<Integer> arbol){
		ColaGenerica<Integer> cola = new ColaGenerica<Integer>();
		return this.numerosParesPost(arbol,cola);
		//return this.numerosParesIn(arbol,cola);
	}
}
