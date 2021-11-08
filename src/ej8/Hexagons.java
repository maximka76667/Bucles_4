package ej8;

import java.util.Scanner;

public class Hexagons {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Simbol: ");
		char symbol = entrada.nextLine().charAt(0);

		System.out.print("Longitud del lado: ");
		int longitud = entrada.nextInt();
		
		System.out.println();

		// Parte arriba
		for(int i = 0; i < longitud - 1; i++) {
			for(int j = 0; j < (longitud * 2 - 1) / 2 - i; j++) System.out.print(" ");
			for(int j = 0; j < longitud + i * 2; j++) System.out.print(symbol);
			System.out.println();
		}

		// Parte media y baja
		for(int i = longitud - 1; i >= 0; i--) {
			for(int j = (longitud * 2 - 1) / 2 - i; j > 0; j--) System.out.print(" ");
			for(int j = longitud + i * 2; j > 0; j--) System.out.print(symbol);
			System.out.println();
		}

		entrada.close();
	}

}
