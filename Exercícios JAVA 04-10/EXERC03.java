package lacodecisao;

import java.util.Scanner;

public class EXERC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leia = new Scanner (System.in);
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		if (idade>=10 && idade<=14) {
			System.out.println("\nVoc� est� na categoria: INFANTIL");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("\nVoc� est� na categiria: INFANTO-JUVENIL");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("\nVoc� est� na categoria: ADULTO");
		}
		else {
			System.out.println("\nVoc� entrou com uma idade n�o categorizada.");
		}

	}

}
