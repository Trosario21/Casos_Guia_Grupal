package com.senati.etii;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat("#0.00");
			
		 System.out.print("Alumno(a): ");
		 String alumno = sc.nextLine();
		 
		 System.out.print("Carrera [DS],[RC],[DG]: ");
		 String carrera = sc.nextLine();
		 
		 System.out.print("Turno [M],[T],[N]: ");
		 String turno = sc.nextLine();
					
		 float monto = 0;
		 float desct = 0;
		 
		 switch (carrera) {
		     case "DS":
		    	monto = 1500;	
		    	carrera = "Desarrollo de Software";
		    	break;
		     case "RC":
			    monto = 1400;	
			    carrera = "Redes y Conectividad";
			    break;
		     case "DG":
				monto = 1300;	
				carrera = "Diseño Grafico";
			    break;
		     default:
				carrera = "No coincide"; 
				 
			}
		 switch (turno) {
	         case "M":
	    	    desct = monto * 0.1f;
	    	    turno =  "Mañana"; 
	    	    break;
	         case "T":
	        	desct = monto * 0.2f;    
	        	turno =  "Tarde"; 
		        break;
	         case "N":
	        	desct = monto * 0.15f;	
	        	turno =  "Noche"; 
		    break;
	         default:
			    turno =  "desconocido"; 			       
			    
		}
		  float total_a_pagar = monto - desct;
		  float total_dolares = total_a_pagar / 3.33f;
		 		
		 System.out.println("\n--------------------");
		 System.out.println(".....Resultados.....");
		 System.out.println("--------------------");
		 System.out.println("Alumno(a): " + alumno.toUpperCase());
		 System.out.println("Monto: " + df.format(monto));
		 System.out.println("Carrera: " + carrera );
		 System.out.println("Nombre del turno: " + turno );
		 System.out.println("Descuento: " + df.format(desct));
		 System.out.println("Total a pagar: " + df.format(total_a_pagar));
		 System.out.println("Total a pagar en dolares: " + df.format(total_dolares));
		

	}

}
