package ej7;

import java.util.Scanner;

public class Legion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero de legioneres: ");
		int legioners = entrada.nextInt();
		int shields = 0;
		
		entrada.close();
		
		for(int i = legioners; i > 0; i--) {
			if(legioners / Math.pow(i, 2) >= 1) {
				legioners -= i * i;
				shields += Math.pow(i, 2) + 4 * i;
			}
		}
		
		System.out.println("Shields: " + shields);
	}

}
