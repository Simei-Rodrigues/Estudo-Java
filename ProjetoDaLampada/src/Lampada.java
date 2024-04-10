  
public class Lampada {
	
	//PROPRIEDADES = PEDEMOS DIZER QUE SÃO AS VARIAVEIS 
	private int potencia;   
	boolean ligada, desligada;
	   
	// METODOS CONTRUTOR
	
	public Lampada(int potencia) {   // ESSA VARIAVEL potencia não é mesma que esta declarada e sim o valor a ser passado através do método
		this.potencia = potencia;  // a potencia antes do =  é declarada na classe recebe a potencia vinda do metodo
		//this para refenciar as coisas da própria classe, ou seja, esta dizendo que a potencia é a declarada na classe
		this.ligada =  false; // toda lampada começa deslidada - pode se assim tambem -->> this.desligar();
	}
	
	//METODOS GETTER AND SETTERS
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		// INSTRUÇÕES -  AQUI VÃO AS REGRAS OU CÓDIGO PARA ALTERAÇÃO 
		this.potencia = potencia;
	}
	
	
	// METODOS 
    public void ligar()
    { 
        ligada = true;
    }
    
    public void desligado() {
    	desligada = false;
    }
}
