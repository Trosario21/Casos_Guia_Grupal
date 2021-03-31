package com.senati.eti;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Alumno(a)....: ");
		String alumno = sc.nextLine();
		
		System.out.print("Nota 1....: ");
		float n1 = sc.nextInt();
		
		System.out.print("Nota 2....: ");
		float n2 = sc.nextInt();
		
		System.out.print("Nota 3....: ");
		float n3 = sc.nextInt();
			
		float promedio = (float)((n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5));

		
		System.out.println("\n----Resultados----");
		System.out.println("Alumno(a) : " + alumno.toUpperCase());
	    System.out.println("Promedio de notas....: " + promedio);

	}

}
