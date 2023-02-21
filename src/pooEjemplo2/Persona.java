package pooEjemplo2;

public class Persona {

	String nombre;
	byte edad;
	double estatura;
	
	public void saludar() {
		System.out.println("Hola, mi nombre es "+nombre+"\n¿Tienes un cigarro?");
	}
	public void cumplirAnios() {
		edad++;
	}
	public void crecer(double incremento) {
		estatura+=incremento;
	}
}
