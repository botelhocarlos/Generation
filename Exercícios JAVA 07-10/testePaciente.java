package Aula0710.Exercicios.Classes;

public class testePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        paciente[] lista = new paciente[3];
		
		lista[0] = new paciente("Maiury Sousa", "12000", "1");
		lista[1] = new paciente("Juliana Macedo", "13000", "1");
		lista[2] = new paciente("Gabriel Mendes", "35000", "2");
		
		for (paciente roda:lista)
		{
			roda.imprimirInfo();
		}
	}

}
