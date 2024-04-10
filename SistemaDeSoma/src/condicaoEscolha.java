import java.util.Scanner;

public class condicaoEscolha {
	
    public static void main(String[] args) {
    	
    //AULA 7 SWITCH - DIGITAR NUMERO CORRESPONDENTE AO DIA DA SEMANA E RETORNAR O DIA POR EXTENSO 
    	    	
    	Scanner input = new Scanner(System.in);
    	
    	int numDiaSemana;
    	
    	System.out.println("Digite o numero correspondente ao dia da semana: ");
    	numDiaSemana = input.nextInt();
    	
    	switch(numDiaSemana) {
    	case 1:
    		System.out.println("Domingo");
    	    break;
    	case 2:
    		System.out.println("Segunda");
    		break;
    	case 3:
        	System.out.println("Terça");
        	break;
    	case 4:
    	    System.out.println("Quarta");
    	    break;
    	case 5:
    		System.out.println("Quinta");
    		break;
    	case 6:
    		System.out.println("Sexta");
    		break;
    	case 7:
    		System.out.println("Sabado");
    		break;
        default:
        	System.out.println("Opção digitada de ser de 1 a 7");
    	 
    	}
    }
}
