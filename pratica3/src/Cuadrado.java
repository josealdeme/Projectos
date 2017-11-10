/**
 * Cuadrado.java
 * Programa que te pide el tamaña de un cuadrado y te lo crea. 
 * ajp - 2017.10.17
 */

import java.util.Scanner;
public class Cuadrado
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util

		Scanner teclado = new Scanner(System.in);
		
		// Declaramos las variables de tipo entero
		int x;
		int y;
		
		//Pide el tamaño y lo guarda en un Scanner
		System.out.println("Dime el tamaño");
		int lado= teclado.nextInt();
		
		//condicion
		for( x = 0; x <= lado-1; x++) {
		System.out.println("");
		
			//condicon
			for( y = 0; y <=lado-1; y++) {
				//Si cumple lo especificado mostrar
				if(x == 0 || y == 0) {
					System.out.print("*"+ " ");
					}
				//Si ocurre lo contrario mostrar
				else 
				if (x == lado-1 || y == lado-1) System.out.print("*" + " ");
				else System.out.print(" "+ " ");
				
				}
			}
	//cierra el escaner
		
	teclado.close();
	}
}