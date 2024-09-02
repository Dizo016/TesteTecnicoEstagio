package exercicio02;

import java.util.Scanner;

public class VerificaMaiuscula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra:");		
		String palavra = sc.nextLine();
		int numLetrasA = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			char a = palavra.charAt(i);
			
			if (a == 'a' || a == 'A') {
				numLetrasA ++;
			}
		}
		
		if (numLetrasA == 0) {
			System.out.println("A letra 'A' nao apareceu nenhuma vez");
		}
		else {
			System.out.println("A letra 'A' apareceu " + numLetrasA + " Vez(es)");
		}
		
		sc.close();		
	}

}
