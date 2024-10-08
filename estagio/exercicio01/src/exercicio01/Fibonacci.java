package exercicio01;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Informe um numero: ");
	        int numero = sc.nextInt();
	        sc.close();

	        int n1 = 0, n2 = 1, n3 = 0;
	        
	        if (numero == n1 || numero == n2) {
	            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
	            return;
	        }

	        while (n3 < numero) {
	            n3 = n1 + n2;
	            n1 = n2;
	            n2 = n3;
	        }

	        if (n3 == numero) {
	            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
	        } else {
	            System.out.println("O numero " + numero + " não pertence a sequencia de Fibonacci.");
	        }
	    }
	}
