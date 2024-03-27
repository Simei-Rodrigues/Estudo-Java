package calculadora.alterada;

public class CalculadoraAlterada {
	
	//PROPRIEDADES DA CLASSE
	private double num1, num2, resultado = 0;
	private char operador;
	
	//METODO CONSTRUTOR
	public CalculadoraAlterada(double num1, double num2, char operador) {
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
    }
	public CalculadoraAlterada() {}
	public CalculadoraAlterada(double num1, char operador){
	  	this.num1 = num1;
	    this.operador = operador;
	}
	
	
	//METODOS GATTER E SETTER 
	
	public double getNum1() {
		return num1;
	}
//	public void setNum1(double num1) {
//		this.num1 = num1;
//	}
	
	public double getNum2() {
		return num2;
	}
	
	public char getOperador() {
		return operador;
	}

	public double getResultado() {
		return resultado;
	}
	
 	public void setResultado(double resultado) {
		this.resultado = resultado;
	} 
	
 	//METODO PARA CHAMADA DA OPERAÇÃO ESCOLHIDA
	
    public void calcule() {
		
		switch (operador) {
		case '+':
		   soma();
		break ;
		case '-':
		   subtracao();	
		break;	
	    case '*':
			multiplicacao();
		break;	
		case '/':
			divisao();
	    break;	
		case '^':
		    potenciacao();
		break;  
		case '%':
			percentual();
	    break;		
		}  
	}
	
    //METODOS QUE RAALIZA A OPERAÇÃO
    
    //usei as duas maneira para fazer os calculos, queria saber qual a mais indicada
    // ou se derrepente uma das duas é mais recomenrada ou não pode usar.
   
	private void soma() {
		//this.resultado = (num1 + num2);
		setResultado(getNum1() + getNum2());
		}
	
	private void subtracao() {
		setResultado(getNum1() - getNum2());
	}
	
	private void multiplicacao() {
		this.resultado = num1 * num2;
	}
	
	private void divisao() {
		if (num2 == 0) {
		   this.resultado = 0;
		}
		else {
		   this.resultado = num1 / num2;	
		}
		
	}
	
	private void potenciacao() {
		int i;
		if (num2==0)
			resultado = 1;
		else
		    resultado = num1;
			for (i=1; i<num2; i++) {
				resultado = resultado * num1;
	        	}
	}
    
	private void percentual() {
		double i;
		i = num1/100;
		resultado = num2*i;
	}
	
}













