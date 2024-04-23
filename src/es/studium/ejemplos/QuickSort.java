package es.studium.ejemplos;

import java.util.Scanner;

public class QuickSort
{
	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[] = new int[TAM];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < TAM; i++)
		{
			System.out.println("Dame el valor de la tabla["+i+"]");
			tabla[i] = sc.nextInt();	
		}
		sc.close();
		
		ordenar(tabla, 0, TAM - 1);
		System.out.println("Tabla ordenada por QuickSort");
		
		for(int i = 0; i < TAM; i++)
		{
			System.out.println(tabla[i]);
		}
	}

	private static void ordenar(int[] tabla, int desde, int hasta)
	{
		int pivote;
		if(desde < hasta)
		{
			pivote = colocar (tabla, desde, hasta);
			ordenar(tabla, desde, pivote - 1);
			ordenar(tabla, pivote + 1, hasta);
		}
	}

	private static int colocar(int[] tabla, int desde, int hasta)
	{
		int i, pivote, valor_pivote, temp;
		pivote = desde;
		valor_pivote = tabla[pivote];
		for(i = desde+1; i <= hasta; i++)
		{
			if(tabla[i] < valor_pivote)
			{
				pivote = pivote + 1;
				temp = tabla[i];
				tabla[i] = tabla[pivote];
				tabla[pivote] = temp;
			}
		}
		temp = tabla[desde];
		tabla[desde] = tabla[pivote];
		tabla[pivote] = temp;
		return pivote;
	}
}