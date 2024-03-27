import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	
		double num1, num2;
		char operador;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeito numero: ");
	    num1 = input.nextDouble();
	    
	    System.out.println("Digite o segundo numero: ");
	    num2 = input.nextDouble();
	    
	    System.out.println("Digite '+' para Soma");
	    System.out.println("Digite '-' para Subtação");
	    System.out.println("Digite '*' para Multiplicação");
	    System.out.println("Digite '/' para Divisão");
	    System.out.println("Digite o operação desejada: ");
	    operador = input.next().charAt(0);
	    
	   		
		Calculadora calcularNumero = new Calculadora(num1, num2, operador);
		calcularNumero.calcule();
		
		
		System.out.println("Resultado da Operação");
		System.out.println(calcularNumero.getNum1() +" "+ operador +" "+
				           calcularNumero.getNum2() + " = " + calcularNumero.getResultado());
			
	}

}
