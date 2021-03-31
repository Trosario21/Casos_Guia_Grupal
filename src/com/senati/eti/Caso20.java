package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor de una venta: ");
		float venta = sc.nextFloat();

		float venta_aumentado = venta + venta * 0.42f;
		
		
		System.out.println("\n----Resultados----");
	    System.out.println("Total de la venta aumentado en 42%....: " + df.format(venta_aumentado));

	}

}
