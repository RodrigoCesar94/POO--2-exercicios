package Exercicio1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Amelia");
		c1.setIdade(44);
		c1.setGenero("Feminino");
		
	
		
		
		System.out.println("Nome do(a) cliente: "+c1.getNome());
		System.out.println("Idade do(a) cliente: "+c1.getIdade());
		System.out.println("Genero do(a) cliente: "+c1.getGenero());

		
		System.out.print("M�todo comprar: ");
		c1.comprar();
		System.out.print("M�todo pagar: ");
		c1.pagar();
		System.out.print("M�todo avaliar: ");
		c1.avaliar();
		
		

	
	}

}
