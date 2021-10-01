package familia;

import java.util.Scanner;

public class EXERC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias,meses,anos,idade;
		Scanner leia = new Scanner (System.in);
		System.out.println("\nEntre com a sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("\nEntre com a sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("\nEntre com a sua idade em dias: ");
		dias = leia.nextInt();
		
		idade = (anos*365) + (meses*30) + dias;
		System.out.println("A idade total em dias é de "+idade+".");

	}
}
