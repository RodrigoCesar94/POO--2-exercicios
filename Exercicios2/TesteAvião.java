package Exercicios2;

public class TesteAvião {

	public static void main(String[] args) {
		
		Avião nave1 = new Avião();
		
		
		nave1.setCor("Branco");
		nave1.setAltitude(7000);
		nave1.setCapassag(178);
		nave1.setTipo("Boeing");
		
		System.out.println("Avião modelo "+nave1.getTipo()+" cor "+nave1.getCor()+" tem capacidade para "+nave1.getCapassag()+"passageiros");
		
	    System.out.println("Altitude do avião: ");
	    nave1.voar();
	    System.out.println("Após voar a "+nave1.getAltitude()+"metros");
	    nave1.pousar();
	    
	}

}
