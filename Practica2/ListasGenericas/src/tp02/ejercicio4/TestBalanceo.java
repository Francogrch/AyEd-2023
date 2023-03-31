package tp02.ejercicio4;
import tp03.ejercicio3.*;
public class TestBalanceo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prueba = estaBalanceado("( [ ) ]");
		System.out.println(prueba);
	}
	
	public static boolean estaBalanceado(String cadena) {
		PilaGenerica <Character> pila = new PilaGenerica<Character>();
		for (int i = 0; i < cadena.length();i++) {
			char caracter = cadena.charAt(i);
			if (caracter == '{' || caracter == '[' || caracter == '(' ){
				pila.apilar(caracter);
			}
			else {
				char tope = pila.tope();
				if ((caracter == '}' && tope == '{') || (caracter == ']' && tope == '[') || (caracter == ')' && tope == '(')){
					pila.desapilar();
				}
			}
		}
		return (pila.esVacia());
	}

}
