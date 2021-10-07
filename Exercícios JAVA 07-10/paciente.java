package Aula0710.Exercicios.Classes;

public class paciente {
	
	private String nomePaciente;
	private String codigoProntuario;
	private String status;
	
	public paciente (String nomePaciente, String codigoProntuario, String status)
	{
		this.nomePaciente = nomePaciente;
		this.codigoProntuario = codigoProntuario;
		this.status = status;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+ nomePaciente);
		System.out.println("\nCódigo: "+ codigoProntuario);
		if (status == "1")
		{
			System.out.println("\nPaciente permance na internação");
		}
		else if (status == "2")
		{
			System.out.println("\nPaciente ganhou alta");
		}
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getCodigoProntuario() {
		return codigoProntuario;
	}

	public void setCodigoProntuario(String codigoProntuario) {
		this.codigoProntuario = codigoProntuario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
