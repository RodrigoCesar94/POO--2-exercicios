package Exercicio1;

public class Cliente {
	
	
	//atributos da classe cliente.
	private String nome;
	private int   idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	private String genero;
	
	
	//metodos da classe cliente
	void comprar() {
	System.out.println("Cliente comprou");		
	}
	void pagar () {
	System.out.println("Cliente pagou");	
	}
	void avaliar() {
	System.out.println("Cliente avaliou");	
	}
	

}
