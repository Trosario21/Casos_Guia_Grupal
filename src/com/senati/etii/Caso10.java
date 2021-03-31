package com.senati.etii;
import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Empleado(a)........: ");
		String empleado = sc.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float ht = sc.nextInt();
	
		System.out.print("Tarifa por hora: ");
		float th = sc.nextInt();
		
		System.out.print("Numero de minutos de tardanza: ");
		float mt = sc.nextInt();
		
		float importe = ht * th;		
		
		
		float bono = 0.04f * importe;	
		if (ht > 60) bono = 0.13f * importe;
		
		
		float dscto = 0;		
		if (mt > 15) 
			dscto = 0.03f * importe;
		
		   	
		float meta_alcanzada = ht / 70 * 100;	
		
		System.out.println("\n--------------------");
		System.out.println(".....Resultados.....");
		System.out.println("--------------------");
		System.out.println("Trabajador(a)......: " + empleado.toUpperCase());
		System.out.println("Horas trabajadas...: " + ht);
		System.out.println("Tarifa por horas...: " + th);
		System.out.println("Importe............: " + importe);
		System.out.println("Bono...............: " + bono);
		System.out.println("Descuento..........: " + dscto);
		System.out.println("Meta alcanzada.....: " + meta_alcanzada + "%");
	}

}
