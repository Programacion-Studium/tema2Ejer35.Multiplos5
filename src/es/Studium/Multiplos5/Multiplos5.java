package es.Studium.Multiplos5;

import java.util.Scanner;

public class Multiplos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, i;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame un número");
		numero1 = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Dame otro número");
		numero2 = teclado.nextInt();
		//Mientras numero1<=numero2 hacer
		if(numero1<numero2)
		{
			System.out.print("Los multiplos de 5 entre "+numero1+" y "+numero2+" son ");
			for(i=numero1; i<=numero2;i++) 
			{
				//Si i modulo5 da 0 hacer
				if (i%5==0)
				{
				System.out.print((i)+", ");
				}
			}
			//cerramos teclado
			teclado.close();
			System.out.println("");
			System.out.println("Fin del programa");
		}
		else
		{
			System.out.println("Error, número 1 tiene que ser mayor que número 2");
		}
	}

}
