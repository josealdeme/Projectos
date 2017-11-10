/**
 * NumMayor.java
 * Programa que te permite introducir tantos numeros como desees y te dice el numero mayor
 * de todos los introducidos
 * ajp - 2017.10.18
 */
import java.util.Scanner;
public class NumMayor
{
	public static void main(String argumentos[])
	{
		//Crea 2 Scanners
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		
//Declaracion de variables
 int num;
 int mayor;
 String s;
 
 //Pide un numero que guarda utilizando un Scanner
 System.out.println("dime un numero");
 num= teclado.nextInt();
 
 //relacion
 mayor = num;
 
 //muestra un mensaje mediante el cual, segun la respuesta, entra en el bucle o no
System.out.println("quieres continuar s/n");
	s=teclado1.nextLine();
	
	//bucle el cual continuara siempre y cuando el valor dado al Scanner teclado1 sea s
	while (s.equals("s")){
		 System.out.println("dime un numero");
		 num=teclado.nextInt();
		 
		 //se plantea una condicion que si se cumple te pregunta si quieres continuar
		 //dicha condicio indica que si el numero introducido por el Scanner teclado es mayor que el valor actual de mayor se le de dicho valor
		 //si se da una respuesta distinta de s el bucle se acabara
		if (num > mayor) mayor = num;
		System.out.println("quieres continuar s/n");
			s=teclado1.nextLine();
	}
	
	//mensaje que muestra el numero mayor de los mostrados
	System.out.println("el mayor es: " + mayor);
	}
}