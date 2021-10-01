package familia;

import java.util.Scanner;

public class EXERC05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1,nota2,nota3,media;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.printf("\nA sua média é de: %2.1f", media);
	}

}
