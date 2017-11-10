/**
 * IntervalosNumerosPrimos.java
 * Programa que muestra un menu con varias funciones
 * ajp - 2017.10.20
 */
import java.util.Scanner;


public class Menu {
	static Scanner teclado = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opoi�n elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
	
	public static void main(String[] args) {
		
		//Mientras la opcion elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opcion:\n1.- Sumar" +
						"\n2.- Restar\n" +
						"3.- Multiplicar\n" +
						"4.- Dividir\n" +
						"0.- Salir");
				//Recoger una variable por consola
				select = Integer.parseInt(teclado.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
					System.out.println("Introduce numero 1:");
					num1 = Integer.parseInt(teclado.nextLine());
					
					System.out.println("Introduce numero 2:");
					num2 = Integer.parseInt(teclado.nextLine());
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				case 2: 
					System.out.println("Introduce numero 1:");
					num1 = Integer.parseInt(teclado.nextLine());
					
					System.out.println("Introduce numero 2:");
					num2 = Integer.parseInt(teclado.nextLine());
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case 3: 
					System.out.println("Introduce numero 1:");
					num1 = Integer.parseInt(teclado.nextLine());
					
					System.out.println("Introduce numero 2:");
					num2 = Integer.parseInt(teclado.nextLine());
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				case 4: 
					System.out.println("Introduce numero 1:");
					num1 = Integer.parseInt(teclado.nextLine());
					
					System.out.println("Introduce numero 2:");
					num2 = Integer.parseInt(teclado.nextLine());
					System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Numero no reconocido");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de linea en Java
				
			}catch(Exception e){
				
			}
		}

	}
	


	}
