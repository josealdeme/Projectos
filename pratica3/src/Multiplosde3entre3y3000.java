/**
 * Multiplosde3entre3y3000.java
 * Programa que muestra todos los multiplos que hay entre 3 y 3000
 * ajp - 2017.10.17
 */
import java.util.Scanner;
public class Multiplosde3entre3y3000
{
	public static void main(String argumentos[])
	{
		Scanner teclado = new Scanner(System.in);
		//declaracion de variables numericas
		int cantidad = 0;
		int imprimir = 0;
		int numero = 1;                           
		
		for (numero = 1; numero <= 3000; numero++) {  //condicion de que de numero sea menor o igual a 3000 y que se acumule.
			if (numero % 3 == 0) { //hará que sea multiplo de 3 el resultado de la division 
				cantidad++; //acumulador
				imprimir = numero; //el valor de imprimir es igual al valor de numero
				System.out.println(":" + imprimir);//imprima los resultados
			}
			
		}
		System.out.println("La cantidad de multiplos es: " + cantidad);//imprime la cantidad total
		
		/*while (numero <= 3000) {
			numero++;
			if (numero % 3 == 0) {
				cantidad++;
				imprimir = numero;
				System.out.println(":" + imprimir);
			}
			
		}
		System.out.println("La cantidad de multiplos es: " + cantidad);*/
		
/*do {

			numero++;
			if (numero % 3 == 0) {
				cantidad++;
				imprimir = numero;
				System.out.println(":" + imprimir);
			}
			
		
		System.out.println("La cantidad de multiplos es: " + cantidad);
		}while (numero < 3000);*/
	}
}