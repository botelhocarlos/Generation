package Aula0810.Exerc�cio.Heranca;

import java.util.Scanner;

public class TestaSom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		Cavalo cavalo = new Cavalo("Alaz�o","6","123456","Quarto de milha",1);
		Cachorro cachorro = new Cachorro("Rex","8","132456","Vira-latas","M�dio");
		Preguica preguica = new Preguica ("Lara","4","124678","Liso",40);
		Animal animal = null;
		int n;
		
		cavalo.imprimirInfo();
		cavalo.validarCodigo();
		
		cachorro.imprimirInfo();
		cachorro.validarCodigo();
		
		preguica.imprimirInfo();
		preguica.validarCodigo();
		
		System.out.println("\nPara ouvir o som do animal, digite: \n\t1 - CAVALO \n\t2 - CACHORRO \n\t3 - PREGUI�A");
		n = read.nextInt();
		
		switch (n)
		{
		case 1: animal = cavalo;break;
		case 2: animal = cachorro;break;
		case 3: animal = preguica;break;
		default: System.out.println("Op��o inv�lida");
		}
		
		if (animal != null)
		{
			animal.som();
		}

	}

}
