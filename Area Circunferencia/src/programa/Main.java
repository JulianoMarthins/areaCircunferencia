package programa;

import java.util.Scanner;

/**
 * 
 * @author JulianoMarthins
 *
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculo da circunferência de um raio\n" + "Digite o raio a ser calculado: ");

		double raio = sc.nextDouble();
		final double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);

		System.out.printf("Area da circunferência: %.2f M²", area);

		sc.close();

	}

}
