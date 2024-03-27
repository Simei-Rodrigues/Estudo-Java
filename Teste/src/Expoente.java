import java.util.Scanner;

public class Expoente {
	
	public static void main(String[] args) {
		
		int num1, num2, resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número base: ");
		num1 = input.nextInt();
		
		System.out.println("Digite o numero exponencial: ");
		num2 =  input.nextInt();
		
		int i;
		resultado = num1;
		for (i=1; i<num2; i++) {
			resultado = resultado * num1;
		}

		System.out.println(num1 +" ^ "+ num2 +" = " + resultado );
	}

}
