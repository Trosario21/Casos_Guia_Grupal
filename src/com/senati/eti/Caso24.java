package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese primer monto: ");
		float monto1 = sc.nextFloat();
		
		System.out.print("Ingrese segundo monto: ");
		float monto2 = sc.nextFloat();
		
		System.out.print("Ingrese tercer monto: ");
		float monto3 = sc.nextFloat();
		
		float primer_monto = monto1 / 5 + monto2 * 0.2f;
		float segundo_monto = (monto3 + (monto3 * 0.6f))/2;
		float tercer_monto = (monto1 + monto2 + monto3)-((monto1 + monto2 + monto3) * 0.08f);
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Primer monto....: " + df.format(primer_monto));
		System.out.println("Segundo monto....: " + df.format(segundo_monto));
		System.out.println("Tercer monto....: " + df.format(tercer_monto));
	}

}
