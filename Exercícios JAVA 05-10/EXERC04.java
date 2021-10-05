package lacorepeticao;

import java.util.Scanner;

public class EXERC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,sexo,personalidade,x=1;
		int pessoasCalmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0,nervoso40=0,calmo18=0;
		Scanner leia = new Scanner (System.in);
		
		while (x<=10) {
			
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<0) {
				System.out.println("Entrada inválida, verifique e tente novamente.");
				idade = leia.nextInt();

			}
			
			System.out.println("Entre com o seu sexo:\n1 - Feminino\n2 - Masculino\n3  -Outro");
			sexo = leia.nextInt();
			while(sexo!=1 && sexo!=2 && sexo!=3) {
				System.out.println("Entrada inválida, verifique e tente novamente.");
				sexo = leia.nextInt();
			}
			
			System.out.println("Entre com a sua personalidade:\n1 - Pessoa Calma\n2 - Pessoa Nervosa\n3 - Pessoa Agressiva");
			personalidade = leia.nextInt();
			while(personalidade!=1 && personalidade!= 2 && personalidade!=3) {
				System.out.println("Entrada inválida, verifique e tente novamente.");
				personalidade = leia.nextInt();
			}
			
			if(personalidade == 1) {pessoasCalmas++;}
			if(sexo == 1 && personalidade == 2) {mulheresNervosas++;}
			if(sexo == 2 && personalidade == 3) {homensAgressivos++;}
			if(sexo == 3 && personalidade == 1) {outrosCalmos++;}
			if(idade > 40 && personalidade == 2) {nervoso40++;}
			if(idade<18 && personalidade == 1) {calmo18++;}
			x++;
			
		}
		System.out.println("Número de pessoas calmas " + pessoasCalmas);
		System.out.println("Número de mulheres nervosas " + mulheresNervosas);
		System.out.println("Número de homens agressivos " + homensAgressivos);
		System.out.println("Número de outros calmos " + outrosCalmos);
		System.out.println("Número de pessoas com mais de 40 anos, nervosas " + nervoso40);
		System.out.println("Número de pessoas com menos de 18 anos, calmas " + calmo18);

	}

}
