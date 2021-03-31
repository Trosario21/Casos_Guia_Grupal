package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Ingrese base...: ");
	    float base = sc.nextFloat();
	    
		System.out.print("Ingrese altura...: ");
	    float altura = sc.nextFloat();
		
		
	    float area = (base * altura)/ 2;
		
		System.out.println("\n==========RESULTADOS==========");
		System.out.println("Área del triangulo......: " + area);

	}

}
