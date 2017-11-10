/**
 * InteresCapital.java
 * Programa ejemplo que compara 3 numeros y los oredna de mayor a menor.
 * ajp - 2017.10.10
 */
import java.util.Scanner;
public class InteresCapital
{
	public static void main(String argumentos[])
	{
		//crea un Scanner para teclado
		Scanner teclado = new Scanner(System.in);
		
	//variables	
	int  ci, r, n ;
	
	//muestra mensaje y pide introducir el valor de ci mediante un Scanner
    System.out.print("Introduzca capital inicial: ");
    ci = teclado.nextInt();
    
	//muestra mensaje y pide introducir el valor de r mediante un Scanner
    System.out.print("Introduzca interés anual en tanto por uno: ");
    r = teclado.nextInt();
    
	//muestra mensaje y pide introducir el valor de n mediante un Scanner
    System.out.print("Introduzca número de años: ");
    n = teclado.nextInt();
    
	//Se muestra el resultado de la formula matematica
    System.out.print
    (Math.pow((1+r), n) * ci);   // calcula num2
}
}