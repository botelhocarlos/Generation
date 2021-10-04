package lacodecisao;

import java.util.Scanner;

public class EXERC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,maior;
		Scanner leia = new Scanner (System.in);
		System.out.println("\nEntre com o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		num3 = leia.nextInt();
		if (num1>=num2 && num1>=num3) {
			maior = num1;	
			System.out.println("\nO maior número é: "+maior);
		}
		else if (num2>=num1 && num2>=num3) {
			maior = num2;
			System.out.println("\nO maior número é: "+maior);
		}
		else if (num3>=num1 && num3>=num2) {
			maior = num3;
			System.out.println("\nO maior número é: "+maior);
		}
	}

}
