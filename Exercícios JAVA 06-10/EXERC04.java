package vetormatriz;

import java.util.Scanner;

public class EXERC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		float[][] matriz1 = new float [2][2];
		float[][] matriz2 = new float [2][2];
		float[][] matriz3 = new float [2][2];
		float[][] matriz4 = new float [2][2];
		float[][] matriz1const = new float [2][2];
		float[][] matriz2const = new float [2][2];
		float constante;
		int opcao;
		
		for (int lin=0; lin<2; lin++) {
			for (int col=0; col<2; col++) {
				System.out.printf("Insira a MATRIZ 1[%d][%d]: ",lin+1,col+1);
				matriz1[lin][col] = leia.nextFloat();
			}
		}
		
		for (int lin=0; lin<2; lin++) {
			for (int col=0; col<2; col++) {
				System.out.printf("Insira a MATRIZ 2[%d][%d]: ",lin+1,col+1);
				matriz2[lin][col] = leia.nextFloat();
			}
		}
		
		
		System.out.println("\tESCOLHA UMA OPÇÃO: ");
		System.out.println("\n(1) SOMAR AS DUAS MATRIZES");
		System.out.println("\n(2) SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA");
		System.out.println("\n(3) ADICIONAR UMA CONSTANTE AS DUAS MATRIZES");
		System.out.println("\n(4) IMPRIMIR MATRIZES");
		opcao = leia.nextInt();
		
		if (opcao == 1) {
			for (int lin=0; lin<2; lin++) {
				for (int col=0; col<2; col++) {
					matriz3[lin][col] = matriz1[lin][col] + matriz2[lin][col];
					System.out.printf("\t %f \t",matriz3[lin][col]);
				}
			}
		}
		
		else if (opcao == 2) {
			for (int lin=0; lin<2; lin++) {
				for (int col=0; col<2; col++) {
					matriz4[lin][col] = matriz1[lin][col] - matriz2[lin][col];
					System.out.printf("\t %f \t",matriz4[lin][col]);
				}
			}
		}
		
		else if (opcao == 3) {
			System.out.println("Digite a constante que deseja adcionar as matrizes: ");
			constante = leia.nextFloat();
			for (int lin=0; lin<2; lin++) {
				for (int col=0; col<2; col++) {
					matriz1const[lin][col] = matriz1[lin][col] + constante;
					matriz2const[lin][col] = matriz2[lin][col] + constante;
					System.out.printf("\t %f \t",matriz1const[lin][col]);
					System.out.printf("\t %f \t",matriz2const[lin][col]);
					
				}
			}
		}
		
		else if (opcao == 4) {
			for (int lin=0; lin<2; lin++) {
				for (int col=0; col<2; col++) {
					System.out.printf("\t %f \t",matriz1[lin][col]);
					System.out.printf("\t %f \t",matriz2[lin][col]);
				}
			}
		}
		
		else {
			System.out.println("Opção inválida");
		}
	}

}
