package Aula0710.Exercicios.Classes;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente cliente1 = new cliente("Carlos Botelho", "carlos@gmail.com","777777777-7");
		
		cliente1.imprimirInfo();
		System.out.println("________Alterar email________");
		cliente1.setEmail("carlosbotelho@gmail.com");
		cliente1.imprimirInfo();
		System.out.println("________Alteração concluída________");

	}

}
