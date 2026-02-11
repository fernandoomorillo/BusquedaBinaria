package BusquedaBinaria;
import java.util.*;
public class busquedabinaria {
	public static void main(String[] args) {
		int[] numeros = {0, 2, 4, 6, 8, 10, 12};
		Scanner sc = new Scanner(System.in);
			System.out.println("Números del array (0, 2, 4, 6, 8, 10, 12)");
			System.out.print("Escribe un número para buscar en el array: ");
		int numbuscado = sc.nextInt();
		int numencontrado = -1;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numbuscado) {
				numencontrado = i;
				break;
			}
		}

		if (numencontrado != -1) {
			System.out.println("El número " + numbuscado + " está en el índice " + numencontrado + ".");
		} else {
			System.out.println("El número no esta en el array.");
		}
		sc.close();
	}
}