package familia;

import java.util.Scanner;

public class EXERC07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Digite o valor de B: ");
		b = leia.nextFloat();
		System.out.println("Digite o valor de C: ");
		c = leia.nextFloat();
		System.out.println("Digite o valor de D: ");
		d = leia.nextFloat();
		System.out.println("Digite o valor de E: ");
		e = leia.nextFloat();
		System.out.println("Digite o valor de F: ");
		f = leia.nextFloat();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X é de: "+ x);
		System.out.println("O valor de Y é de: "+ y);
		
		

	}

}
