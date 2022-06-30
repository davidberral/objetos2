package gestion;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Persona p1;
	
		
		p1 = new Persona();
		//p1.nombre="Ana";
		
		Persona p2 = new Persona("María", "Sánchez");
		
		
		//System.out.println();
		
		///p2.nombre="David";
		
		Persona p3 = new Persona("David","Martin", 27, "Hombre", 80, 170);
		
		Persona copia= new Persona(p3);
		Persona referncia=p3;
		
		//p3.nombre="otro";
		
		System.out.println(copia);
		
		System.out.println(p3);
		System.out.println("La persona 3 es: ");
		p3.mostrar();
		
		System.out.println("La persona copia es: ");
		copia.mostrar();
		
		System.out.println("la edad de p3 es "+p3.getEdad());
		
		p3.setEdad(28);
		
		System.out.println("la edad de p3 es "+p3.getEdad());
		
		p3.setEdad(-30);
		
		System.out.println("la edad de p3 es "+p3.getEdad());
		p3.setEdad(8);
		
		if (p3.esMayorDeEdad()) {
			System.out.println(p3.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p3.getNombre() + " NO mayor de edad");
		}
	}
	

}
