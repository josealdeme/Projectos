/**
 * SumaMedia.java
 * Programa simple que lee tantos números enteros como se quiera mientras no sea un cero, que terminaría. 
 * Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética..
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * ajp - 2017.10.17
 */

import java.util.Scanner;
public class SumaMedia
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
		
		// Declaramos las variables de tipo entero
		double num;
		double suma;
		int acumulador = 0;

		System.out.println("Dime un numero");
		num = teclado.nextInt();
		suma = num;
		

		while (num != 0) {
			System.out.println("Dime un numero");
			num = teclado.nextInt();
			suma = suma + num;
			acumulador++;
		}
		System.out.println("Suma de todos los numeros" + " " + suma );
		System.out.println("Media es" + " " + suma/acumulador);
		
	}
}