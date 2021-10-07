package Aula0710.Exercicios.Classes;

public class cliente {
	//declaração dos atributos da classe;
	
		private String nomeCliente;
		private String email;
		private String cpf;
		
		//declaração do método especial contrutor
		
		public cliente (String nomeCliente, String email, String cpf)
		{
			this.nomeCliente = nomeCliente;
			this.email = email;
			this.cpf = cpf;
		}
		
		//declaração dos demais métodos da classe
		
		public void imprimirInfo()
		{
			System.out.println("Nome: "+ nomeCliente);
			System.out.println("Email: "+ email);
			System.out.println("CPF: "+ cpf);	
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		

}
