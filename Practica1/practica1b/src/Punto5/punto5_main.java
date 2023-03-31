package Punto5;

public class punto5_main {
	private static int[] usandoReturn(int[] array) {
		int max = 0;
		int min = 999;
		int prom = 0;
		for (int i = 0;i < 10;i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
			prom= prom + array[i];
		}
		prom = prom / array.length;
		int[] resul = new int[3];
		resul[0] = min;
		resul[1] = max;
		resul[2] = prom;
		return resul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arrayInt = new int[10];
		for (int i = 0;i < 10;i++) {
			arrayInt[i] = i;
		}
		int[] puntoA = new int[3];
		//Uso un arreglo para devolver los valores
		puntoA = usandoReturn(arrayInt);
		System.out.println(puntoA[0]);
		System.out.println(puntoA[1]);
		System.out.println(puntoA[2]);
	}

}
