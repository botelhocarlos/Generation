package Aula0810.Exercício.Heranca;

public class Cavalo extends Animal {
	private String racaCavalo;
	private float pesoCavalo;
	
	public Cavalo (String nome,String idade,String codigo,String racaCavalo,float pesoCavalo)
	{
		super (nome,idade,codigo);
		this.racaCavalo = racaCavalo;
		this.pesoCavalo = pesoCavalo;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade:"+getIdade()+"\nCodigo: "+getCodigo()+"\nRaça: "+racaCavalo+"\nPeso: "+pesoCavalo);
	}
	
	@Override
	public void som ()
	{
		System.out.println("Hiin in in");
	}

	public String getRacaCavalo() {
		return racaCavalo;
	}

	public void setRacaCavalo(String racaCavalo) {
		this.racaCavalo = racaCavalo;
	}

	public float getPesoCavalo() {
		return pesoCavalo;
	}

	public void setPesoCavalo(float pesoCavalo) {
		this.pesoCavalo = pesoCavalo;
	}
}
