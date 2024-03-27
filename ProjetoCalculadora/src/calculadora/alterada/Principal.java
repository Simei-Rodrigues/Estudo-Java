package calculadora.alterada;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	
		double num1, num2;
		char operador, encerrar = 'n';
		int controle;
		
		Scanner input = new Scanner(System.in);
		do {
		do {
		    System.out.println("Digite '+' para Soma");
		    System.out.println("Digite '-' para Subtação");
		    System.out.println("Digite '*' para Multiplicação");
		    System.out.println("Digite '/' para Divisão");
		    System.out.println("Digite '^' para potenciação");
		    System.out.println("Digite '%' para percentual");
		    System.out.println("Digite o operação desejada: ");
	        operador = input.next().charAt(0);
		    }while(operador != '+' && operador!= '-' && operador!= '*' 
		    		&& operador!= '/' && operador!= '^' && operador!= '%' );
		
		System.out.println("Digite o primeito numero: ");
	    num1 = input.nextDouble();

		if(operador != '+' && operador!= '-' && operador!= '*' && operador!= '/' && operador!= '^' && operador!= '%' );
             System.out.println("operador doferente");
             CalculadoraAlterada calcularNumero = new CalculadoraAlterada(num1, operador);  
		
		
		
	    
	    System.out.println("Digite o segundo numero: ");
	    num2 = input.nextDouble();
	    
	    
	    CalculadoraAlterada calcularNumero1 = new CalculadoraAlterada(num1, num2, operador);
		calcularNumero.calcule();
		
		if(calcularNumero.getResultado() == 0 && operador == '/') {
			System.out.println("Não se faz divisão por zero");
	    	}
			else {		
			System.out.println("Resultado da Operação");
			System.out.println(calcularNumero.getNum1() +" "+ operador +" "+
					           calcularNumero.getNum2() + " = " + calcularNumero.getResultado());
			} 
		
		}while(encerrar != 's' );
				
    }

}