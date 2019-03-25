package tp1;

import java.util.Scanner;

public class Ej17 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio n�17: Programa lea la longitud de los catetos de un tri�ngulo\r\n" + 
				"rect�ngulo y calcule la longitud de la hipotenusa seg�n el teorema de\r\n" + 
				"Pit�goras.\r\n");
		double ladoA, ladoB,hipotenusa;
		System.out.println("Ingresar el lado A: ");
		ladoA = Double.parseDouble(scan.next());
		System.out.println("Ingresar el lado B");
		ladoB = Double.parseDouble(scan.next());
		hipotenusa = sacaHipotenusa(ladoA,ladoB);
		try 
		{
			System.out.println("La hipotenusa es "+hipotenusa);
			Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
		
	}
	
	public static double sacaHipotenusa (double ladoA, double ladoB) {
		double hipotenusa = Math.sqrt( Math.pow(ladoA, 2)+ Math.pow(ladoB, 2));
		return hipotenusa;
	}
}
