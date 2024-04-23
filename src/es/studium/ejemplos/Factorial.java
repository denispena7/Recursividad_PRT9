package es.studium.ejemplos;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, resultado;
		System.out.println("Dame un número entero:");
		n = sc.nextInt();
		sc.close();
		resultado = factorial(n);
		System.out.println("El factorial de " + n + " vale " + resultado);
	}

	private static int factorial(int n)
	{
		// Caso base
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return (n * factorial(n - 1));
		}
	}
}