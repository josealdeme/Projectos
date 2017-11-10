/**
 * Suma8num.java
 * Programa que te pide 8 numeros y los suma.
 * ajp - 2017.10.17
 */
import java.util.Scanner;
public class Suma8num
{
	public static void main(String argumentos[])
	{
		//Crea un Scanner
		Scanner teclado = new Scanner(System.in);
	
	//Muestra mensajes que te piden introducir 8 numeros
	//declaracion como variables
	System.out.println("Dame el numero 1: ");
	int num1=teclado.nextInt();
	System.out.println("Dame el numero 2: ");
	int num2=teclado.nextInt();
	System.out.println("Dame el numero 3: ");
	int num3=teclado.nextInt();
	System.out.println("Dame el numero 4: ");
	int num4=teclado.nextInt();
	System.out.println("Dame el numero 5: ");
	int num5=teclado.nextInt();
	System.out.println("Dame el numero 6: ");
	int num6=teclado.nextInt();
	System.out.println("Dame el numero 7: ");
	int num7=teclado.nextInt();
	System.out.println("Dame el numero 8: ");
	int num8=teclado.nextInt();
	
//variable cuyo resultado es la suma de las variables declaradas anteriormente
int resultado=num1+num2+num3+num4+num5+num6+num7+num8;

//muestra el la suma de todas las variables introducidas
System.out.println("resultado "+resultado);
			}
		}
	
	