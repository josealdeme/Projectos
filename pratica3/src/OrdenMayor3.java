/**
 * OrdenMayor3.java
 * Programa que compara 3 numeros que introducimos y los oredna de mayor a menor.
 * ajp - 2017.10.17
 */
import java.util.Scanner;
public class OrdenMayor3
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		
		//declaramos la variables numericas
		int numero1, numero2, numero3;//
		
		//se pide que introduzcas los numeros
		System.out.print("Introduzca primer numero: ");
	    numero1 = teclado.nextInt();
	    System.out.print("Introduzca segundo numero: ");
	    numero2 = teclado.nextInt();
	    System.out.print("Introduzca tercer numero: ");
	    numero3 = teclado.nextInt();
	    
	    //Orden
	    if (numero1 > numero2 && numero1 > numero3 &&numero2 > numero3) //1 2 3
	    	System.out.println(numero1+" "+numero2+" "+numero3);
	    if (numero1 < numero2 && numero1 > numero3 &&numero2 > numero3) //2 1 3
	    	System.out.println(numero2+" "+numero1+" "+numero3);
	    if (numero1 > numero2 && numero1 < numero3 &&numero2 < numero3) //3 1 2
	    	System.out.println(numero3+" "+numero1+" "+numero2);
	    if (numero1 < numero2 && numero1 < numero3 &&numero2 < numero3) //3 2 1
	    	System.out.println(numero3+" "+numero2+" "+numero1);
	    if (numero1 > numero2 && numero1 > numero3 &&numero2 < numero3) //1 3 2
	    	System.out.println(numero1+" "+numero3+" "+numero2);
	    if (numero1 < numero2 && numero1 < numero3 &&numero2 > numero3) //2 3 1
	    	System.out.println(numero2+" "+numero3+" "+numero1);

}
}