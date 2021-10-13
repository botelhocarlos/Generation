package Aula0810.Exercício.Heranca;

public abstract class Animal {
	private String nome;
	private String idade;
	private String codigo;
	
	public Animal (String nome,String idade,String codigo)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.codigo = codigo;
	}
	
	abstract public void som ();
	
	public void validarCodigo()
	{
		if (getCodigo().length()!=6)
		{
			System.out.println("Código inválido");;
		}
		else
		{
			System.out.println("Código válido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
