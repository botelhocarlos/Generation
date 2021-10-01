package familia;

import java.util.Scanner;

public class EXERC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A,B,C,D,R,S;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S) / 2;
		System.out.println("O resultado da função é: " + D);	
	}

}
