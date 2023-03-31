package Punto2;
import java.util.Scanner;
/*
 * Escriba un método de clase que dado un número n devuelva un nuevo arreglo de tamaño n con 
 * los n primeros múltiplos enteros de n mayores o iguales que 1.
 * Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k}
 * 
 * 
 * 
 * */
public class punto2 {
	
	public static int[] devuelveArray(int n) {
		int[] array = new int[n];
		int nuevo;
		for(int i=1;i <= n;i++) {
			nuevo = n * i;
			array[i-1] = nuevo;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = devuelveArray(n);
		System.out.println(array[4]);
	}

}
