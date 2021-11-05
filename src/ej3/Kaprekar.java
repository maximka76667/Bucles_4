package ej3;

import java.util.*;

public class Kaprekar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime tu numero: ");
		int numero = entrada.nextInt();
		int iter = 0;
		
		while(iter <= 7 && numero != 6174) {
			++iter;
			//System.out.println("\nIteracion " + iter);
			char arrayOfCharacters[] = String.valueOf(numero).toCharArray();
			Arrays.sort(arrayOfCharacters);
			String sortedString = new String(arrayOfCharacters);
			
			int numero_sortado = Integer.parseInt(sortedString);
			int numero_sortado_reversado = Integer.parseInt(reverse(arrayOfCharacters));
			
//			System.out.println("Numero inicial:  " + numero);
//			System.out.println("Sortado:  " + numero_sortado);
//			System.out.println("Reversado: " + numero_sortado_reversado);
			
			numero = numero_sortado_reversado - numero_sortado;
			//System.out.println("Numero final: " + numero);
		}
		
		System.out.println("\nNumero de iteraciones final: " + iter);
		
		entrada.close();
	}

	static String reverse(char[] a) {
		String result = "";
		for(int i = a.length - 1; i >= 0; i--) result += a[i];
		// Si longitud < 4, añadimos 0;
		if(result.length() < 4) for(int j = 0; j <= 4 - result.length(); j++) result += "0";
        return result;
    }
}
