package ej7;

import java.util.Scanner;

public class Legion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero de legioneres: ");
		int legioners = entrada.nextInt();
		int shields = 0;
		int pow = 0;
		
		entrada.close();
		
		for(int i = legioners; i > 0; i--) {
			pow = i * i;
			if(legioners / pow >= 1) {
				legioners -= pow;
				shields += pow + 4 * i;
			}
		}
		
		// Por cada legioner solo => shields += 5
		System.out.println("Shields: " + (shields += legioners * 5));
	}

}
