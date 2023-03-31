package Punto1;
public class main {
	public static void iEfor(int a, int b){
		for (int i = a;i <= b; i++) {
			System.out.println(i);
		}		
	}
	public static void iEwhile(int a,int b) {
		while(a <= b) {
			System.out.println(a);
			a++;
		}
	}
	public static void iEnada(int a,int b) {
		if (a >= b) {
			System.out.println(a);
		}
		else {
			System.out.println(a);
			iEnada(a+1,b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 5;
		iEfor(a,b);
		iEwhile(a,b);
		System.out.println("Recursiva: ");
		iEnada(a,b);
	}

}
