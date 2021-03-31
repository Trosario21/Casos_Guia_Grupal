package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer numero: ");
		n1 = sc.nextFloat();
			
		System.out.print("Segundo numero: ");
		n2 = sc.nextFloat();
			
		float promedio = (n1 + n2)/2;
		float aumentado =n1 + (n1 * 0.2f);
		float disminuido =n2 - (n2 * 0.3f);
		

		System.out.println("----------");	
		System.out.println("Resultados");
		System.out.println("----------");
		System.out.println("Resultado 1: " + promedio);
		System.out.println("Resultado 2: " + aumentado);
		System.out.println("Resultado 3 : " + disminuido);

	}

}


