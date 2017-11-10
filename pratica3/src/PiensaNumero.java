/**
 * PiensaNumero.java
 * Programa que intenta adivinar un numero que hayas pensado de 1 al 10.
 * ajp - 2017.10.24
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PiensaNumero
{
	public static void main(String argumentos[])
	{
//nuevo escaner
		Scanner teclado = new Scanner(System.in);
		
//variables
int num;

//variable para simplificar en el codigo que indica que aleatorio
//es igual a la formula especificada
int aleatorio =(1 + (int)(Math.random() * 10));

//muestran mensajes en una ventana emergente
JOptionPane.showMessageDialog(null,"Hola");	
JOptionPane.showMessageDialog(null,"Piensa un numero del 1 al 10 ");

//muestra en la consola el mensaje especificado y te pide que introduzcas un numero
System.out.println("Escribe el numero...");
num=teclado.nextInt();

//ventana emergente con numero aleatorio
JOptionPane.showMessageDialog(null,"El número es " + aleatorio);
{

//si coincide con el introducido muestra el mensaje especificado
if(num==aleatorio)
JOptionPane.showMessageDialog(null,"He acertado");

//en el caso contrario muestra el mensaje especificado
else
JOptionPane.showMessageDialog(null,"He fallado");	
		}
	}
}
