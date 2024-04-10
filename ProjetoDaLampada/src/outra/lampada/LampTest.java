package outra.lampada;

public class LampTest {
	
	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		System.out.println("Lampada Criada(Acesa = "+lamp.acesa+")");
		
		// METODO SETA O ATRIBUTO ACESO PARA TRUE - LAMPARADA LIGARA
		lamp.ligar();
		System.out.println("lampada Acesa(Acesa = "+lamp.acesa+")");
		
		//METODO SETA O ATRIBUTO ACESO PARA FALSE - LAMPADA DESLIGADA
		lamp.desligar();
		System.out.println("Lampada Desligada (Acesa = "+lamp.acesa+")");
	}
}
