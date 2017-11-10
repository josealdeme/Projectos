/**
 * practica3ej1.java
 * Programa ejemplo que compara 3 numeros y los oredna de mayor a menor.
 * ajp - 2017.10.10
 */
import java.util.Scanner;
public class Autoevaluacion

{
	public static void main(String argumentos[])
	{
		//intropducimos 2 Scanners
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		
//Declaramos las variables		
double valorEntrada=1;
double mayor=1;
double menor=2147483647;
int contadorValidos=0;
String t;

//bucle do-while
//Se mostrara el mensaje una vez,
//despues si se cumple la condicon se volvera a mostrar hasta que no se cumpla la condicion
do {System.out.println("Teclea numeros positivos y menores a 2147483647 y finaliza con 0");

//funcionara mientras sea distinto de 0
while(valorEntrada!=0) {
	
	//uso del Scanner
	valorEntrada=teclado.nextInt();
	
		//si se cumple la condicion se ejecutaran los if de dentro
		if(valorEntrada>=1 && valorEntrada<=2147483647){
		
		//if para guardar el numero mayor
		if(valorEntrada > mayor) mayor = valorEntrada;{
		}
		
		//if para guardar el numero menor
		if (valorEntrada < menor) menor = valorEntrada;{
			menor = valorEntrada;}	
		}
		
		//contador
		contadorValidos++ ;

		}

//muestra el mensaje que indicacuando se deja de cumplir 
//la condicion del while mostrara esto si no aceptas vuelves al bucle
System.out.println("estas seguro de que quieres terminat pulsa t para finalizar");
t=teclado1.nextLine();
valorEntrada=1;
 }

//respuesta para salir del bucle
 while(!t.equals("t"));
 	System.out.println("El mayor es "+mayor+"\nEl menor es "+menor+"\nSe han introducido "+contadorValidos+" numeros");
	}
}