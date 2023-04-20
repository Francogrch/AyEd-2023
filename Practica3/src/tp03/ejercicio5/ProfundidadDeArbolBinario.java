package tp03.ejercicio5;
import tp02.ejercicio2.*;
public class ProfundidadDeArbolBinario {
	ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
	static int pro = 0;
	
	private int sumaProfun(ArbolBinario<Integer> arbol, int profun) {
		if ((profun < pro) | (arbol.esHoja())) {
			return arbol.getDato();
		}else {
			if (arbol.tieneHijoDerecho()){
				profun++;
				return arbol.getDato() + sumaProfun(arbol.getHijoDerecho(),profun);
			}
			if (arbol.tieneHijoIzquierdo()) {
				profun++;
				return arbol.getDato() + sumaProfun(arbol.getHijoDerecho(),profun);
			}
		}
		return 0;
	}
	
	public int sumaElementosProfundidad(int p) {
		this.pro = p;
		int profun = 0;
		sumaProfun(arbol,profun);
		return 0;
	}
}
