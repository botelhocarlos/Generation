package familia;

import java.util.Scanner;

public class EXERC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int segundos,horas,minutos,segundosFinal;
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com o tempo em segundos: ");
		segundos = leia.nextInt();
		horas = segundos / 3600;
		minutos = (segundos%3600) / 60;
		segundosFinal = ((segundos % 3600) % 60);
		System.out.println("O tempo total é de " + horas + " hora(s), " + minutos + " minuto(s), e " + segundosFinal + " segundos.");
	}

}
