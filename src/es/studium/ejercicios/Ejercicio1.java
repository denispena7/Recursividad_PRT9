package es.studium.ejercicios;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		int resultado;
		resultado = sumaCien(100);
		System.out.println("La suma de los primeros 100 números naturales es igual a: " + resultado);
	}

	private static int sumaCien(int i)
	{
		// Caso base
		if(i == 1)
		{
			return 1;
		}
		else
		{
			return (i + sumaCien(i - 1));			
		}
	}
}