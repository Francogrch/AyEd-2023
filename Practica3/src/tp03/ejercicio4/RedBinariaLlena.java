package tp03.ejercicio4;
import tp02.ejercicio2.*;
public class RedBinariaLlena {
	ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
	
	private Integer retardo(ArbolBinario<Integer> arbol){
		if (arbol.esHoja()){
			return arbol.getDato();
		}else{
			return arbol.getDato() + Math.max(retardo(arbol.getHijoIzquierdo()),retardo(arbol.getHijoDerecho()));
		}
	}
	public Integer retardoReenvio(){
		return retardo(arbol);
	}
}
