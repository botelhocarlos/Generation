package familia;

import java.util.Scanner;

public class EXERC08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorCarro,valorDist,valorFinal;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o valor de fábrica do carro: ");
		valorCarro = leia.nextFloat();
		valorDist = valorCarro + (valorCarro * 0.85);
		valorFinal = valorDist + (valorDist * 0.45);
		System.out.println("O valor final do carro é de: "+valorFinal);
	}

}
