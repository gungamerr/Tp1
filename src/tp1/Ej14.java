package tp1;

import java.util.Scanner;

public class Ej14 {
	public static void menu (Scanner scan){
	System.out.println("Ejercicio n�14: Programa que lea una cantidad de grados cent�grados y la " + 
			"pase a grados Fahrenheit. La f�rmula correspondiente para pasar de grados " + 
			"cent�grados a fahrenheit es: F = 32 + ( 9 * C / 5) " );
		double centigrado,fahrenheit;
		System.out.println("Ingrese los grados centigrados :");
		centigrado = Double.parseDouble(scan.next());
		fahrenheit = fahrenheit(centigrado);
			try        
		{
				System.out.println("Los grados centigrados "+ centigrado+"�C" + "\r\n"
						+ "Fahrenheit : "+fahrenheit+"�F");
		    Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
	public static double fahrenheit (double centigrado) {
		double fahrenheit = 32 +(9 * centigrado / 5);
		return fahrenheit;
	}
}