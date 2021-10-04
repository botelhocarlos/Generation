package lacodecisao;

import java.util.Scanner;

public class EXERC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num,raiz,quad;
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com um número: ");
		num = leia.nextDouble();
		if (num%2 == 0) {
			raiz = Math.sqrt(num);	
			System.out.printf("O número "+num+" é par e a raiz quadrada do mesmo é: "+raiz);
		}
		else {
			quad = Math.pow(num, 2);
			System.out.printf("O número "+num+" é ímpar e seu valor elevado ao quadrado é: "+quad);
		}
		
	}

}
