package vetormatriz;

import java.util.Scanner;

public class EXERC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int [6];
		int i,somaPares = 0,somaImpares =0;
		
		Scanner leia = new Scanner (System.in);
		
		for (i=0; i<6; i++) {
			System.out.println("Entre com o valor: ");
			num[i] = leia.nextInt();
		}
		for (i=0; i<6; i++) {
			if (num[i]%2 == 0) {
			   somaPares += num[i];
			   System.out.println("Par: "+num[i]);
			}
			if (num[i]%2 != 0) {
		       somaImpares ++;
			   System.out.println("�mpar: "+num[i]);
				   
			}
		}
		System.out.println("A soma dos n�meros pares � de: "+somaPares);
		System.out.println("A quantidade de n�meros �mpares � de: "+somaImpares);
	}
}

