
import java.util.Scanner;
public class TesteEnquato {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);	
	
    System.out.println("Qual o seu nome: ");
    String nome = input.nextLine();  //TECLA ENTER SEM INSERIR DADOS 
	
    //NO CASO DESSA COMPARÇÃO TEMOS QUE USAR EQUALS, PORQUE A VARIAVEL NOME É UM OBJETO DA CLASSE STRING
	while (nome.equals("")) {        // SE NÃO FOI DIGITADO NADA ESTA VAZIO E ENTRA NO LOOP
		System.out.println("Insira novamente seu nome: ");
		nome = input.nextLine();
	}
	
	int contador = 1;
	
	while (contador <= 10) {
		System.out.println(contador);
		contador++;
	}
	 
	// mesma estrutura do while usanco FOR
	
	System.out.print("Usando for para imprimir números de 1 a 10\n");
	int i;
	for(i=1; i<=10; i++ ) {
	    System.out.println(i);
	}
  }
}



