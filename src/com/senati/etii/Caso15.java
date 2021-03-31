package com.senati.etii;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Cliente: ");
		 String cliente = sc.nextLine();
		 
		 System.out.print("Producto [TB/LT/MN/IM]: ");
		 String producto = sc.nextLine();
		 		 	 
		 System.out.print("Forma de pago [C1/C2]: ");
		 String forma = sc.nextLine(); 
		 
		 System.out.print("Cantidad : ");
		 int cantidad = sc.nextInt();	 
		
		 float monto = 0;
		 
		 switch (producto) {
		     case "TB":
		    	monto = 350;
		    	producto = "Tablet";
		    	break;
		     case "LT":
		    	 monto = 2300;
		    	 producto = "Laptop";
			    break;
		     case "MN":
				monto = 850;	  
				producto = "Monitor";
			    break;
		     case "IM":
				monto = 680;	
				producto = "Impresora";
			    break;  	
			 default:
				 producto = "Producto desconocido";				 
		 }	 	 	 
		 float desct = 0;
		 float importe = monto * cantidad;
		 float total_a_pagar = 0;
		 float incremento = 0;
			 
		 switch (forma) {
	         case "C1":
	    	    forma = "Contado";
	    	    desct = importe * 0.05f;
	    	    total_a_pagar = importe - desct;
	    	    break;
	    	    
	         case "C2": 
	        	forma = "Credito";
	        	incremento = importe * 0.12f;
	        	total_a_pagar = importe + incremento;	
	  		  break;	        		 
		}
		 System.out.println("\nCliente..........: " + cliente.toUpperCase());
  		 System.out.println("Producto.........: " + producto);
  		 System.out.println("Precio...........: " + monto);
  		 System.out.println("Cantidad.........: " + cantidad );
  		 System.out.println("Importe..........: " + importe);	
  		 System.out.println("Forma de pago....: " + forma );	 
  		 if(forma == "Contado")  
  			 System.out.println("Descuento....: " + desct);
  		 else 
  		     System.out.println("Incremento....: " + incremento);  	
  		 System.out.println("Total a pagar....: " + total_a_pagar);

	}

}
