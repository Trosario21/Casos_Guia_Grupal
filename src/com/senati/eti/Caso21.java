package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor del gasto: ");
		float gasto = sc.nextFloat();
		
		float gasto_disminuido = gasto - gasto * 0.12f;
		
		
		System.out.println("\n----Resultados----");
	    System.out.println("Gasto disminuido en....: " + df.format(gasto_disminuido));
		

	}

}
