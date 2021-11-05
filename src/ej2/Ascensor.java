package ej2;

import java.util.Scanner;

public class Ascensor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Posición inicial: ");
		int inicial = entrada.nextInt();
		
		int actual = inicial;
		int seg = 0;
		int recorrido = 0;
		
		while(true) {
			System.out.print("Seguinte posición: ");
			seg = entrada.nextInt();
			if(seg < 0) break;
			recorrido += Math.abs(seg - actual);
			actual = seg;
		}
		
		System.out.println("Recorrido final: " + recorrido);
		
		entrada.close();
	}

}
