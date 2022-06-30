package gestion;

public class Persona {
	
	// estado del objeto
	 String nombre;
	private String apellidos;
	private int edad;
	private String sexo; // Hombre o Mujer
	private double peso;
	private double altura;
	
	
	public Persona() {
		edad=0;
		nombre="no inicializado";
	}
	
	public Persona(String n, String a) {
		nombre=n;
		apellidos=a;
	}

	public Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	

}
