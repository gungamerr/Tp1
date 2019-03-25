package tp1;

import java.util.Scanner;

public class Ej22 {
	public static void menu(Scanner scan) {
		System.out.println("Ejercicio n�23: Crea una aplicaci�n llamada CalculadoraPolacaInversaApp,\r\n" + 
				"nos pedir� 2 operandos (int) y un signo aritm�tico (String), seg�n este �ltimo\r\n" + 
				"se realizar� la operaci�n correspondiente. Al final mostrara el resultado en un\r\n" + 
				"cuadro de di�logo.\r\n" + 
				"Los signos aritm�ticos disponibles son:\r\n" + 
				" +: suma los dos operandos.\r\n" + 
				" -: resta los operandos.\r\n" + 
				" *: multiplica los operandos.\r\n" + 
				" /: divide los operandos, este debe dar un resultado con decimales\r\n" + 
				"(double)\r\n" + 
				" ^: 1� operando como base y 2� como exponente.\r\n" + 
				" %: m�dulo, resto de la divisi�n entre operando1 y operando2.");
		int numero1, numero2;
		String operando = "";
		while(!operando.equals("salida")) 
		{
			System.out.println("\r\n Bienvenido a la CalculadoraPolacaInversaApp \r\n por favor ingresar el Primer numero");
			numero1 = Integer.parseInt(scan.next());
			System.out.println("Ingresar el segundo numero");
			numero2=Integer.parseInt(scan.next());
			
			System.out.println("Ingresar un operando : \r\n" +" +: suma los dos operandos.\r\n" + 
					" -: resta los operandos.\r\n" + 
					" *: multiplica los operandos.\r\n" + 
					" /: divide los operandos, este debe dar un resultado con decimales\r\n" + 
					"(double)\r\n" + 
					" ^: 1� operando como base y 2� como exponente.\r\n" + 
					" %: m�dulo, resto de la divisi�n entre operando1 y operando2.");
			operando = scan.next().toLowerCase();
			
			switch(operando) {
			case "+" :
				System.out.println("La suma de los 2 numeros es : "+suma(numero1,numero2));
				break;
				
			case "-":
				System.out.println("La resta de los 2 numeros es : "+resta(numero1,numero2));
				break;
				
			case "/":
				System.out.println("La division de los 2 numeros es : "+division(numero1,numero2));
				break;
				
			case "*":
				System.out.println("La multiplicacion de los 2 numeros es :"+multiplicacion(numero1,numero2));
				break;
				
			case "^":
				System.out.println("El resultado numero1(base) y numero2 (exponente)"+exponente(numero1,numero2));
				break;
				
			case "%":
			System.out.println("El resto de la division de los 2 numeros es :"+resto(numero1,numero2));
			break;
			
			default:
				try 
				{
					if (!operando.equals("salida")){
					System.out.println("Ingresa bien la operatoria, segui participando");
					Thread.sleep(3000);
					}else
					{
						System.out.println("Saliendo del programa");
						Thread.sleep(2000);
					}
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				break;
				
			}
		
		}
		
	}
	public static int suma (int numero1, int numero2)
	{
		int resultado = numero1 + numero2;
		return resultado;
	}
	
	public static int resta (int numero1, int numero2) 
	{
		int resultado;
		if(numero1 > numero2) 
				resultado = numero1 - numero2;
			else
				resultado = numero2 - numero1;
		return resultado;
	}
	
	public static int multiplicacion(int numero1, int numero2) 
	{
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	public static double division (int numero1, int numero2)
	{
		double resultado = (double)(numero1 / numero2);
		return resultado;
	}
	
	public static int exponente(int numero1, int numero2) 
	{
		int resultado = (int)Math.pow(numero1,numero2);
		return resultado;
	}
	
	public static double resto (int numero1, int numero2) 
	{
		double resultado = numero1 % numero2;
		return resultado;
	}
}
