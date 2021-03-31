package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese precio del producto: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad del producto: ");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		float IGV = importe * 0.18f;
		float descuento = importe * 0.03f;
		float importe_total = importe - descuento + IGV;
		
		System.out.println("\n----------");
		System.out.println("Resultados");
		System.out.println("----------");
	    System.out.println("Producto....: " + producto);
	    System.out.println("Importe....: " + df.format(importe));
	    System.out.println("IGV....: " + df.format(IGV));
	    System.out.println("Descuento....: " +descuento);
	    System.out.println("Importe total....: " + df.format(importe_total));

	}

}
