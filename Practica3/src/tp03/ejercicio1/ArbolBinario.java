package tp03.ejercicio1;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas(){
		int cant = 0;
		if (this.esHoja()){
			return 1;
		}
		else
		{
			if (this.tieneHijoDerecho()){
				cant +=  this.getHijoDerecho().contarHojas();
			}
			if (this.tieneHijoIzquierdo()) {
				cant += this.getHijoIzquierdo().contarHojas();
			}
		}
		return cant;
	}
	

    public ArbolBinario<T> espejo() {
		ArbolBinario<T> espejo = new ArbolBinario<T>(this.getDato());
		if (this.esHoja()){
			return this;
		}
		if (this.tieneHijoDerecho()) {
			espejo.agregarHijoIzquierdo(this.getHijoDerecho());
		}
		if (this.tieneHijoIzquierdo()) {
			espejo.agregarHijoDerecho(this.getHijoIzquierdo());
		}
		return espejo;
	}


	public void entreNiveles(int n, int m){
	}

	

}
