package Aula0810.Exercício.Heranca;

public class Preguica extends Animal {
	private String tipoPelo;
	private float comprimento;
	
	public Preguica (String nome,String idade,String codigo,String tipoPelo,float comprimento)
	{
		super (nome,idade,codigo);
		this.tipoPelo = tipoPelo;
		this.comprimento = comprimento;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade:"+getIdade()+"\nCodigo: "+getCodigo()+"\nTipo de pêlo: "+tipoPelo+"\nCompriemnto: "+comprimento);
	}
	
	@Override
	public void som ()
	{
		System.out.println("A Aaaaah A Aaaaaah");
	}

	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
}
