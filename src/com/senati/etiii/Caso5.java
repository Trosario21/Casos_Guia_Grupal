package com.senati.etiii;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			int i = 1, n = 0;
			int num_menor = 0;
			
			while(i <= 5) {
				System.out.print("Ingrese n�mero " + i + ": ");
				n = sc.nextInt();
		        
			    if (i == 1)
			    	num_menor = n;
			    else if (n < num_menor)
			          num_menor = n;
			
				i++;
			}
			
			System.out.println("\nEl n�mero menor es: " + num_menor);


	}

}
