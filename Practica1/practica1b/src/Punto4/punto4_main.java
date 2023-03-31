/*¿Qué imprime el siguiente programa al ejecutar main?
 * 	a. Intente averiguarlo sin ejecutar el programa en su computadora. 
 * 		No se modifican las variables
 * 	b. Ejecute el ejercicio en su computadora, y compare su resultado con lo esperado en el
 * 	inciso anterior.
 * 		No se modificaron las variables
 * c. Inserte un breakpoint en las lineas donde se indica: y = tmp y ejecute en modo debug 
 * ¿los valores que adoptan las variables x, y coinciden con los valores impresos por consola?
 * 		En swap2 al debuguear hace llamados a ciertos metododes del propio objeto Integer.
 * */
package Punto4;

public class punto4_main {
	public static void swap1 (int x, int y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
		public static void swap2 (Integer x, Integer y) {
			if (x < y) {
				int tmp = x ;
				x = y ;
				y = tmp;
		}
	}
	public static void main(String[] args) {
		int a = 1, b = 2;
		Integer c = 3, d = 4;
		swap1(a,b);
		swap2(c,d);
		System.out.println("a=" + a + " b=" + b) ;
		System.out.println("c=" + c + " d=" + d) ;
	}

}
