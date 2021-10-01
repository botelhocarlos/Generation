package familia;

import java.util.Scanner;

public class EXERC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias, meses, anos, diasFinal;
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com a sua idade em dias: ");
		dias = leia.nextInt();
		anos = dias/365;
		meses = ((dias%365) / 30);
		diasFinal = ((dias%365)%30);
		System.out.println("\nSua idade é de " + anos + " ano(s) " + meses + " mes(es) " + diasFinal + " dia(s).");
	}

}
