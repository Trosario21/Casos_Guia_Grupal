package com.senati.etii;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
		 System.out.print("Ingrese sueldo: ");
		 float sueldo = sc.nextFloat();
		 	 
		 float impuesto = 0;
		 
		 if (sueldo > 2800) impuesto = (float) 0.05 * sueldo;
		 else
			 impuesto = (float) 0.02 * sueldo;
		 
		 System.out.println("\n---- R E S U L T A D O S ----");
		 System.out.println("Sueldo................: " + sueldo);
		 System.out.println("Impuesto calculado............: " + impuesto);

	}

}
