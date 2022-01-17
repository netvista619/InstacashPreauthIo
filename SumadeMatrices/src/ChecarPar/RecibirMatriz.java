package ChecarPar;

import java.util.Scanner;

public class RecibirMatriz {

	public static void main(String[] args) {
		int arregloDado[] = new int[5];
		int entradaTecladoNumero;
		int tam = arregloDado.length;
		Scanner inDatoArray = new Scanner(System.in);
		Scanner entradaEscaner = new Scanner(System.in);
		for (int i = 0; i < arregloDado.length; i++) {
			System.out.println("Posicion numero: " + i);
			arregloDado[i] = inDatoArray.nextInt();
		}
		System.out.println("Numero para encontrar la sumatoria:");
		entradaTecladoNumero = entradaEscaner.nextInt();
		if (pintarPares(arregloDado, tam, entradaTecladoNumero)) {
			System.out.println("Par existente");
		} else {
			System.out.println("no existe par para:  " + entradaTecladoNumero);
		}
		inDatoArray.close();
		entradaEscaner.close();
	}
	static boolean pintarPares(int A[], int size, int x) {
		for (int i = 0; i < (size - 1); i++) {
			for (int j = (i + 1); j < size; j++) {
				if (A[i] + A[j] == x) {
					System.out.println("Par encontrado para la suma " + x + " es (" + A[i] + ", " + A[j] + ")");

					return true;
				}
			}
		}
		return false;
	}
}