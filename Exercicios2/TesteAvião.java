package Exercicios2;

public class TesteAvi�o {

	public static void main(String[] args) {
		
		Avi�o nave1 = new Avi�o();
		
		
		nave1.setCor("Branco");
		nave1.setAltitude(7000);
		nave1.setCapassag(178);
		nave1.setTipo("Boeing");
		
		System.out.println("Avi�o modelo "+nave1.getTipo()+" cor "+nave1.getCor()+" tem capacidade para "+nave1.getCapassag()+"passageiros");
		
	    System.out.println("Altitude do avi�o: ");
	    nave1.voar();
	    System.out.println("Ap�s voar a "+nave1.getAltitude()+"metros");
	    nave1.pousar();
	    
	}

}
