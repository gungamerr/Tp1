package tp1;


public class Ej6{
	public static void menu() {
		System.out.println("Ejercicio n�6: Encontrar la suma de los primeros 10 n�meros naturales.\r\n" + 
				"");
		int suma = 0 ;
		for(int i = 1; i<=10;i++)
			suma +=i;
		try        
		{
			System.out.println("La suma de los 10 primeros numeros naturales es : " + suma);
		    Thread.sleep(3000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
}
