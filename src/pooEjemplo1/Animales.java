package pooEjemplo1;

public class Animales {
	
	public String nombre;
	public int iD, edad;
	
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	public void mostrarCaracteristicas(String nomb, int age, int id) {
		System.out.println("Mi animal se llama "+nomb+" tiene "+edad+" años y su ID es "+id);
	}
	
}
