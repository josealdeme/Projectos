/**
 * IntervalosNumerosPrimos.java
 * Programa que te pide los un intervalo para sacar los numeros primos del susodicho intervalo
 * ajp - 2017.10.24
 */
import java.util.Scanner;
//Hallar números primos con un rango inicial y final.
public class IntervalosNumerosPrimos
{
 public static void main(String arg[]){
Scanner teclado = new Scanner(System.in);
	double i,j;
	boolean numprimo;
	System.out.print("Introduzca capital inicial: ");
	double recInicial= teclado.nextDouble();
	System.out.print("Introduzca capital inicial: ");
	double recFinal= teclado.nextDouble();
	{
	
	//recorro ciclo tantas veces como necesite
	//<= es para incluir el valor de rFinal.
	for(i = recInicial;i <= recFinal;i++){
		
	// i es primo hasta que se demuestre lo contrario
	numprimo=true;
	
	//no coloque j = 1 porque  que todos los numeros son divisibles entre 1.
    //j < i es para no incluir el numero a evaluar, pues todo numero es divisible por si mismo.
	for(j = 2;j < i;j++){
		
	//Si además del 1 y el mismo hay otro divisor, ya no es primo.
	//% devuelve el residuo de i/j
	//se demostró que i no es primo.	
	if(i % j == 0){
	numprimo = false;
       }
       }
	//Si es primo imprimir.
       if(numprimo){
        System.out.println(i+"\n");
        	}
		}
	}
 }
} 
