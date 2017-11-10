/**
 * TresNumerosReales
 * Programa que te saca la raiz de tres numeros.
 * ajp - 2017.10.16
 */
import java.util.Scanner;
public class TresNumerosReales
{
	public static void main(String argumentos[])
	{
		//Crea Scanner
		Scanner teclado = new Scanner(System.in);
		
//declaracion de variables		
double a , b, c, d, x1, x2;

//pide 3 numeros y con un Scanner les da valor a las variables a b y c
 System.out.println("dime un numero");
 a= teclado.nextDouble();
 System.out.println("dime un numero");
 b= teclado.nextDouble();
 System.out.println("dime un numero");
 c= teclado.nextDouble();
 
 //variable d es igual a la formula mostrada
 d =  (Math.pow(b,2) - (4*a*c));
 
 //Segun la condicion que se cumpla se mostrara un mensaje u otro
 if ((a == 0) && (b == 0)) System.out.println("Ecuacion degenerada");
 if ((a == 0) && (b != 0)) System.out.println("Ecuacion con raiz unica: " + (-c)/b);
 if (d >= 0){
	 	System.out.println("Hay dos raices reales");
		x1 = (-b + Math.sqrt(d))/2*a;
	 	x2 = (-b - Math.sqrt(d))/2*a;
	 	System.out.println("x1: " + x1);
	 	System.out.println("x2:" + x2);
 }
 //si no se cumple ninguna condicion se mostrara este mensaje
 else System.out.println("Hay dos raíces complejas de la forma: x + yi y x - yi");
	}
}