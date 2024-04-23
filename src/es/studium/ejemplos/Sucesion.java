package es.studium.ejemplos;

import java.util.Scanner;

public class Sucesion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Dame un número entero:");
		n = sc.nextInt();
		sc.close();
		sucesion(n);
	}

	private static void sucesion(int n)
	{
		// Caso base
		if(n == 1)
		{
			System.out.println((float)n / 2f);
		}
		else
		{
			sucesion(n - 1);
			System.out.println((float)n / 2f);
		}
	}
}