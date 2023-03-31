package Punto3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante[] arrayE = new Estudiante[2];
		Profesor[] arrayP = new Profesor[3];
		for (int i = 0; i < 3;i++) {
			if (i < 2) {
				arrayE[i] = new Estudiante(("Nombre " + i),(" Apellido " + i),(" Comision " + i),(" Email " + i),(" Direccion " + i));	
			}
			arrayP[i] = new Profesor(("Nombre " + i),(" Apellido " + i),(" Comision " + i),(" Email " + i),(" Catedra " + i),(" Facultad " + i));
		}
		for (int i = 0; i < 3;i++) {
			if (i < 2) {
				System.out.println("Estudiante: " + arrayE[i].tusDatos());	
			}
			System.out.println("Profesor: " + arrayP[i].tusDatos());		
		}
	}

}
