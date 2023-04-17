// Se recorre el arbol sumando sus valores de arriba hacia abajo hasta llegar a una hoja y esta se compara con el maximo, donde este valor es el que se retorna
//Esta MAL
public RedBinariaLlena(){
    abstract int max = 0;
    public int retardoReenvio(ArbolBinario<Integer> arbol, Integer sum){
        
        if (!a.esVacio()){
            if (a.tieneHijoDerecho()){
                sum = a.getDato() + sum;
                retardoReenvio(a.getHijoDerecho(),sum)
            }
            if (a.tieneHijoDerecho()){
                sum = a.getDato() + sum;
                retardoReenvio(a.getHijoDerecho(),sum)
            }
        }
        if (sum > max){
            max = sum;
        }
        return max;
    }
}

//Pizarron
//Pensar en todos los casos
//1.Que sea hoja = retorna el valor
//Que sea un arbol con dos hojas = max(HD+HI) + Padre
//Que sea un arbol de arboles = la maxima suma de los sub arboles mas la suma del dato de la raiz 
public int retardo(<ArbolBinario> a){
    if (arbol.esHoja()){
        return a.getDato();
    }else{
        return a.getDato() + max(retardo(a.getHjoDerecho()),retardo(a.getHijoIzquierdo()))
    }
}

public class RedBinariaLlena{
    ArbolBinario arbol = new ArbolBinario();
    public int retardo(<ArbolBinario> a){
    if (arbol.esHoja()){
        return a.getDato();
    }else{
        return a.getDato() + max(retardo(a.getHjoDerecho()),retardo(a.getHijoIzquierdo()))
    }
}
    public int retardoReenvio(){
        return retardo(arbol);
    }
}