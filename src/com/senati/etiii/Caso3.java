package com.senati.etiii;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero.....: ");
		int n = sc.nextInt();
		
		int i = 1, factorial = 1;
	
	
		while (i <= n && n < 8) {
	        factorial *= i;
			
			if (i < n) 
			    System.out.print(i + " x ");
			else 
				System.out.println(i + " = " + factorial);						
			i++;
						
	    }
		if (n >= 8) 
		    System.out.println("El numero es superior a 7");
		else 
			System.out.print("El factorial de " + n + " es: " + factorial);	

	}

}
