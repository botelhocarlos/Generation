package lacorepeticao;

import java.util.Scanner;

public class EXERC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, par = 0, impar = 0;
		Scanner leia = new Scanner (System.in);
		for (int x = 0; x < 10; x++) {
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("\nA quantidade de n�meros pares � de: "+ par);
		System.out.printf("\nA quantidade de n�meros �mpares � de: "+ impar);

	}
}
