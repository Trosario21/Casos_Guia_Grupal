package com.senati.eti;
import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Ingrese base: ");
	      int base = sc.nextInt();
	      
	      System.out.print("Ingrese altura: ");
	      int altura = sc.nextInt();
	       
	      int area = base * altura;
	      int perimetro = base * 2 + altura * 2;
	      
	      System.out.println("\n----------");
	      System.out.println("Resultados");
	      System.out.println("----------");
	      System.out.println("Area del rectangulo: " + area);
	      System.out.println("Perimetro del rectangulo: " + perimetro);

	}

}
