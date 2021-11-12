package Exercicios2;

public class Avião {

	//atributos
  
   private String cor, tipo;
   private int capassag; //capacidade de passageiros)
   private int altitude; //
   
   //método
   
   void voar () {
	 System.out.println("altitude é :"+altitude+" metros");  
}
  public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public int getCapassag() {
	return capassag;
}
public void setCapassag(int capassag) {
	this.capassag = capassag;
}
public int getAltitude() {
	return altitude;
}
public void setAltitude(int altitude) {
	this.altitude = altitude;
}
void pousar() {
	 System.out.println("Avião pousou");   
  }
   

}
