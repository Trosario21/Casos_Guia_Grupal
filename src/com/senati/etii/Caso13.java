package com.senati.etii;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Numero 1: ");
		 float num1 = sc.nextFloat();
		 
		 System.out.print("Numero 2: ");
		 float num2 = sc.nextFloat();
		
		 System.out.print("Operación [1-6]: ");
		 int op = sc.nextInt();
		 
		
		 String operacion = "Operación no valida";
		 float res = 0;
		 
		 switch (op) {
		     case 1:
		    	operacion = "suma";
		    	res = num1 + num2;	
		    	break;
		     case 2:
		    	operacion = "Resta";
		    	res = num1 - num2;
		    	break;
		     case 3:
		    	operacion = "Producto";
		    	res = num1 * num2;
		    	break;
		     case 4:
		       operacion = "Division";
		       res = num1 / num2;
		    	if (num2 == 0) {
		    		operacion = "No es posible dividir entre 0";
		    		res = 0; 
		    	}	     
		    	break;	    	
		     case 5:		    		
		    	operacion = "Resto Entero";		    	
		    	res = num1 % num2;	 
		    	if (num2 == 0) {
		    		operacion = "No es posible hallar el resto entero";
		    		res = 0; 
		    	}
		    	break;		    	
		     case 6:
		    	operacion = "Promedio";
		    	res = (num1 + num2)/2;
		    	break;
		     	
			}
			
		 System.out.println("\n--------------------");
		 System.out.println(".....Resultados.....");
		 System.out.println("--------------------");
		 System.out.println("Numero 1: " + num1);
		 System.out.println("Numero 2: " + num2);
		 System.out.println("Operación: " + operacion);
		 System.out.println("Resultado: " + res);
		


	}

}
