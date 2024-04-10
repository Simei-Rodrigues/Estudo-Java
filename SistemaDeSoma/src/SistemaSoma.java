import java.util.Scanner;

public class SistemaSoma {

	public static void main(String[] args) {
		
		// ENTRADA DE DADOS
		
		Scanner input = new Scanner(System.in);
		
		int valor1, valor2;
	
		System.out.println("Insira o primeiro numero inteiro: ");
		valor1 = input.nextInt();
		
		System.out.println("Insira o segundo numero inteiro: ");
		valor2 = input.nextInt();
			
		//PROCESSAMENTO
		int resultado = valor1 + valor2;
		
		//SAIDA
		System.out.println("O Resultado da soma dos números "
		                   + valor1 + " e " + valor2 + " é igual a " + resultado);
		
		//AULA 6 - SISTEMA DE COMPARAÇÃO - IF ELSE
		// USAREMOS A MESMA ENTRADA DE DOIS NUMEROS E DIZER SE QUAL É MAIOR, MENOR OU IGUAIS
		
		if (valor1 > valor2) {
			System.out.println(valor1 + " é maior que " + valor2);
			}
		else{
			if (valor1 < valor2){
				    System.out.println(valor1 + " é menor que " + valor2);
			    }
			else{
				    System.out.println(valor1 + " é igual ao " + valor2);
				    }
			}            		
	}

}
