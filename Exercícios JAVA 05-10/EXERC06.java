package lacorepeticao;

import java.util.Scanner;

public class EXERC06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,soma = 0,contador = 0;
		float media;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Entre com um n�mero: ");
			numero = leia.nextInt();
			if (numero%3 == 0 && numero != 0){
				soma += numero;
				contador++;
			}
		}while (numero !=0);
		media = soma / contador;
		System.out.printf("A m�dia dos m�ltiplos de 3 �: %.2f",media);
	}

}
