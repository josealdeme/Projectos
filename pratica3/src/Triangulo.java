/**
 * Triangulo.java
 * Programa que te pide los lados de un triangulo y te dice que tipo es/ bucle.
 * ajp - 2017.10.23
 */
import java.util.Scanner;
public class Triangulo
{
	public static void main(String argumentos[])
	{
		//introducimos 2 scanner ya que uno es necesario para los numeros y el otro para el string
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
//Muestra el mensaje que solicita numeros y les da valor a lado1, lado2 y lado3.
System.out.println("Dame el primer lado");		
double lado1 = teclado.nextDouble();
System.out.println("Dame el segundo lado");
double lado2 = teclado.nextDouble();
System.out.println("Dame el tercer lado");
double lado3 = teclado.nextDouble();
//le da valor a la s para poder usarla en el while
String s ;
{
//mensaje de error
if(lado1<=0 || lado2<=0 || lado3<=0)
System.out.println("\nError ponga un numero entero");	
else
	
//condicion si todos los lados son iguales mostrar el mensaje que indica que el triangulo es equilatelo.
if (lado1==lado2 && lado2==lado3)
	System.out.println("\nEl Triangulo es Equilatero\n");

//si no ocurre lo estimado con que dos ladps sean iguales mostrar el mensaje que indica que el triangulo es isosceles.
else

if(lado1==lado2 || lado1==lado3 || lado2==lado3)
	System.out.println("\nEl Triangulo es Isosceles");

//si tampoco ocurre lo estimado si todos los lados son desiguales mostrar el mensaje que indica que el triangulo es escaleno.
else
	
//condicion
if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
	System.out.println("\nEl Triangulo es Escaleno");	

}
 System.out.println("Quieres continuar s/n");
 s = teclado2.nextLine();
 //bucle
 	while(s.equals("s")){
 		
 		//mensajes que te piden variables para declararlas
 		System.out.println("Dame el primer lado");		
 		lado1 = teclado.nextDouble();
 		System.out.println("Dame el segundo lado");
 		lado2 = teclado.nextDouble();
 		System.out.println("Dame el tercer lado");
 		lado3 = teclado.nextDouble();
 		
 		//condiciones que segun se cumpla una u otra se mostrara un mensaje u otro
 		if(lado1<=0 || lado2<=0 || lado3<=0)
 			System.out.println("\\nError ponga un numero entero");	
 		else
 		if (lado1==lado2 && lado2==lado3)
 			System.out.println("\nEl Triangulo es Equilatero\n");
 		else
 		
 		if(lado1==lado2 || lado1==lado3 || lado2==lado3)
 			System.out.println("\nEl Triangulo es Isosceles");
 		else
 		
 		if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
 			System.out.println("\nEl Triangulo es Escaleno");	
 		
 		//segun la respuesta el bucle continuara o no
 		 System.out.println("Quieres continuar s/n");
 		 s = teclado2.nextLine();
 			 
 					}
			}
	}

