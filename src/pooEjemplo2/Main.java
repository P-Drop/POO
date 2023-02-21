package pooEjemplo2;

import java.util.Scanner;

public class Main {
	
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.edad=18;
		p1.nombre = "Lamberto";
		p1.estatura = 1.56;
		p1.saludar();
		p1.cumplirAnios();
		System.out.println(p1.nombre+" ha cumplido "+p1.edad+" años...¡Felicidades!");
		System.out.println("¿Que pastilla tomas, la roja o la azul?");
		String pastilla = keyboard.next();
		if(pastilla.equals("roja")) {
			p1.crecer(1);
			System.out.println(p1.nombre+" tomó la pastilla roja y creció un metro. Ahora mide "+p1.estatura);
		}
		else if(pastilla.equals("azul")) {
			p1.crecer(-1);
			System.out.println(p1.nombre+" tomó la pastilla azul y menguó un metro. Ahora mide "+p1.estatura);
			
		}
	}
}
