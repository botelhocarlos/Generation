package vetormatriz;

import java.util.Scanner;

public class EXERC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] num = new int [3][3];
		int contador=0;
		Scanner leia = new Scanner(System.in);
		
		for (int linha=0; linha<3; linha++) {
			for (int coluna =0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				num[linha][coluna] = leia.nextInt();
			}
		}
		
		for (int linha=0; linha<3; linha++) {
			for (int coluna =0; coluna<3; coluna++) {
				if (num[linha][coluna] > 10) {
					contador++;
				}
				
			}
		}
		System.out.println("Os valores maiores que 10 são: " +contador);
	}

}
