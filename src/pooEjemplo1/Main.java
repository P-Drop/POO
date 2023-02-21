package pooEjemplo1;

public class Main {
	
	public static void main(String[] args) {
		
		Animales animal1 = new Animales();
		animal1.nombre = "Manolo";
		animal1.iD = 1;
		animal1.edad = 14;
		animal1.mostrarNombre();
		animal1.mostrarCaracteristicas(animal1.nombre, animal1.edad, animal1.iD);
	}
	
	
}
