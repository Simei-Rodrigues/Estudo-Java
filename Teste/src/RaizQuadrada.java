import java.util.Scanner;
import java.lang.Math;
public class RaizQuadrada {
	
	public static void main(String[] args) {
		
		Double num, resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número para saber a raiz quadrada: ");
		num = input.nextDouble();
		
		resultado = Math.sqrt(num);

		System.out.println("raiz quadra de "+ num + " = "+ resultado );
	}

}