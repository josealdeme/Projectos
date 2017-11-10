/**
 * practica3ej1.java
 * Programa ejemplo que compara 3 numeros y los oredna de mayor a menor.
 * ajp - 2017.10.10
 */
import java.util.Scanner;
public class Factorialpositivo
{
	public static void main(String argumentos[])
	{
		//introduce el scanner teclado
		Scanner teclado = new Scanner(System.in);
		
		//valores
		int acumulador;
		int num;
		int factorial = 1;
		
		//pide un numero que le da valor a num
		System.out.println("dame un numero");
		num=teclado.nextInt();
	
		//igualda
		acumulador = num;
		
		//condicion que si se cumple muestra el mensaje especificadp
		if (num < 0) System.out.println("Error, numero negativo");
		else {
			//bucle+condicion
			while( num!=0){
			//formula
			  factorial=factorial*num;
			  num--;  
			}
			//muestra el mensaje
			  System.out.println("El factorial es " + factorial );

		}
		//muestra el mensaje
		System.out.println("Hasta luego");
		
	}	
}	