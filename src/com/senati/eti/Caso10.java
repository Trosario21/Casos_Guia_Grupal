package com.senati.eti;
import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese radio: ");
	    int radio = sc.nextInt();
	    
	    float pi =3.1416f;
	    
	    float area = (float)(pi * Math.pow(radio,2));
	    float perimetro = (float) (2 * radio * pi);
	    		
	    System.out.println("\n----------");
	    System.out.println("Resultados");
	    System.out.println("----------");
	    System.out.println("Area del circulo: " + area);
	    System.out.println("Perimetro del circulo: " + perimetro);


	}

}
