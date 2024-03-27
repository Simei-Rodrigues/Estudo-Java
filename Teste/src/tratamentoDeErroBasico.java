import java.util.InputMismatchException;
import java.util.Scanner;

public class tratamentoDeErroBasico {
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 10;
		
		try {
			int resultado = num/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); // SERÁ EXIBIDO A MENSAGEM LANÇADA DO ERRO 
		}
		
		//TRATAMENTO ESPECÍFICO
		
		try {
			int resultado1 = num/0;
		}
		catch(ArithmeticException e ){  // TRATA EM ESPECÍFICO A DIVISÃO POR ZERO, POIS QUANDO TENTAMOS DIVIDIR POR ZERO DA ArithmeticException
			System.out.println("Não pode dividir por zero");
		}
		
		//TRATAMENTO AO DIGITAR UMA LETRA QUANDO SE ESTA ESPERANDO NÚMERO
		try {
		    System.out.println("Digite uma letra para dar erro, pois esta esperando"
				+ " um número inteiro: ");
	     	int valor = input.nextInt();
	    	num =100;
	    	int resultado = num / valor;
	    	System.out.println("Resultado da Divisão: " + resultado);
		}
		catch(InputMismatchException e){
			System.out.println("Não se pode dividir por letra, digite um número 2 para teste");
		}
	}
}


