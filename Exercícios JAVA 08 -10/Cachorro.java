package Aula0810.Exercício.Heranca;

public class Cachorro extends Animal {
	private String racaCachorro;
	private String porteCachorro;
	
	public Cachorro (String nome,String idade,String codigo,String racaCachorro,String porteCachorro)
	{
		super (nome,idade,codigo);
		this.racaCachorro = racaCachorro;
		this.porteCachorro = porteCachorro;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade:"+getIdade()+"\nCodigo: "+getCodigo()+"\nRaça: "+racaCachorro+"\nPorte: "+porteCachorro);
	}

	public String getRacaCachorro() {
		return racaCachorro;
	}

	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}

	public String getPorteCachorro() {
		return porteCachorro;
	}

	public void setPorteCachorro(String porteCachorro) {
		this.porteCachorro = porteCachorro;
	}
	
	


}
