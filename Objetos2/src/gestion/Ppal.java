package gestion;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		Persona p1;
	
		
		p1 = new Persona();
		p1.nombre="Ana";
		
		Persona p2 = new Persona("María", "Sánchez");
		
		
		//System.out.println();
		
		p2.nombre="David";
		
		Persona p3 = new Persona("David","Martin", 27, "Hombre", 80, 170);
		
		System.out.println(p3);
		
		

	}

}
