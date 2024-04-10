
public class Main {

	public static void main(String[] args) {
		
		//Lampada() É MÉTODO CONTRUTOR - USADO PARA CONSTRUIR OU CRIAR O OBJETO - EQUIVALE A ALOCAR UM
		// ESPAÇO DE MEMÓRIA PARA AQUELA FUNCINALIDADE
		Lampada minhaLampada = new Lampada(60);
		Lampada minhaLampada1 = new Lampada(100);
		//Lampada outraLampada = new Lampada();
		
		//minhaLampada.potencia = 60; 
	    minhaLampada1.ligada = true;
		
	    //outraLampada.potencia = 100;
	    //outraLampada.ligada = false; 
	    
		System.out.println("Minha Lampada de "+minhaLampada1.getPotencia() + " está ligada? " 
		                   + minhaLampada1.ligada);
		
//		System.out.println("Minha Lampada de "+outraLampada.potencia + " está ligada? " 
//                + outraLampada.ligada);
	}

}
