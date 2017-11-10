/**
 * Fibonacci.java
 * Programa que muestra el numero de la posición deseado en la serie fibonacci.
 * ajp - 2017.10.25
 */
import java.util.*;

public class Fibonacci
{
    public static void main(String[] args){
    	
    	//crea el scanner teclado
        Scanner teclado = new Scanner(System.in);
        
        //declara las variables
        int numero,i;
        int num1=1;
        int num2=1;
        
        //
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = teclado.nextInt();
        }while(numero<=0);
        System.out.println("Los " + numero + " primeros n de la serie de Fibonacci son:");
       // System.out.print(num1 + " ");
        for(i=2;i<=numero;i++){
            
             num2 = num1 + num2;
             num1 = num2 - num1;
        }
        System.out.println(num2-num1);
    }
}
 

