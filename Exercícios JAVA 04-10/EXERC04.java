package lacodecisao;

import java.util.Scanner;

public class EXERC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num,raiz,quad;
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com um n�mero: ");
		num = leia.nextDouble();
		if (num%2 == 0) {
			raiz = Math.sqrt(num);	
			System.out.printf("O n�mero "+num+" � par e a raiz quadrada do mesmo �: "+raiz);
		}
		else {
			quad = Math.pow(num, 2);
			System.out.printf("O n�mero "+num+" � �mpar e seu valor elevado ao quadrado �: "+quad);
		}
		
	}

}
