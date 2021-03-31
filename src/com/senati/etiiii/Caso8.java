package com.senati.etiiii;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();

		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		
		while (rp.equals("S")|| rp.equals("s")) {
			nr++;
			
			System.out.println("REGISTRO N. " + nr);
			System.out.println("***************");
			
			System.out.print("Nombre...: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad.....: ");
			edad = sc.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			sc.nextLine();
			
			rp = "";
			
			while (!rp.equals("S")&& !rp.equals("s") && !rp.equals("N") && !rp.equals("n")){
			    System.out.print("¿Continuar registro [S|N]?: ");
			    rp = sc.nextLine();
			
			    if (!rp.equals("S")&& !rp.equals("s") && !rp.equals("N") && !rp.equals("n")){
				    System.out.print("Solo escriba S o N: ");
			
			 }		
		  }
		}
		//Impresion del contenido de los ArrayList	
		System.out.println("\n -- DATOS REGISTRADOS -- ");
		System.out.println("==========================");
		
		System.out.println("Alumno(a) \tEdad \t\tEstado \t\t\tEstado ");
		System.out.println("---------------------------------------------------------------- ");
		
		for (int i = 0; i < arrNombre.size(); i++) {
			System.out.println(arrNombre.get(i) + "\t\t" + arrEdad.get(i) + " años\t\t" +
		                       VerMensaje(arrEdad.get(i)) + "\t\t" + VerEstado(arrEdad.get(i)) );
			
		}
	  }
	//Crear metodos
	//Funcion(metodo que devuelve un valor)
	public static String VerMensaje(int edad) {
		String mensaje = "Menor de edad";
		
		if (edad >= 18) mensaje = "Mayor de edad";
		return mensaje;
    }

	public static String VerEstado(int edad) {
		String estado = "";
		if (edad <= 10) estado = "niñez";		
		
		else if(edad > 10 && edad <= 17)
			estado = "adolescencia";
		else if(edad > 17 && edad <= 24)
			estado = "juventud";
		else if(edad > 24 && edad <= 59)
			estado = "adulto";
		else if(edad >=60)
			estado = "adulto mayor";
		
		// hasta 10 ->niñez
		//hasta 17 -> adolescencia
		//hasta 24 ->juventud
		//hasta 59 ->adulto
		//DE 60 a mas -> adulto mayor
		return estado;

	}

}
