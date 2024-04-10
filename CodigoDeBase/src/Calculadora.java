import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, resultado;
		char operador;
		
        System.out.println("Calculadora para somar dois números inteiros");
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo número");
        num2 = input.nextInt();
        
        System.out.println("Digite\n '+' para Soma\n '-' para Subtração\n "
        		+ "'*' para Multiplicação\n '/' para Divisão");
        operador = input.next().charAt(0);
        
        switch (operador)
        {
        case '+':
            resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);
            break;
        case '-':
            resultado = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + resultado);
            break;
        case '*':
        	resultado = num1 * num2;
        	System.out.println(num1 + " * " + num2 + " = " + resultado); 
        	break;
        case '/':
        	resultado = num1 / num2;
        	System.out.println(num1 + " / " + num2 + " = " + resultado);
        	break;
        default:
        	System.out.println("Operador inválido");
        }
      
    }

}
