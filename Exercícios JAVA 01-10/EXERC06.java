package familia;

import java.util.Scanner;

public class EXERC06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,y1,y2,d;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o ponto x1: ");
		x1 = leia.nextFloat();
		System.out.println("Digite o ponto y1: ");
		y1 = leia.nextFloat();
		System.out.println("Digite o ponto x2: ");
		x2 = leia.nextFloat();
		System.out.println("Digite o ponto y2: ");
		y2 = leia.nextFloat();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("O valor da distância é de: %2.2f",d);	

	}

}
