import java.util.Scanner;

public class BreakContinue {
	
	// Break deve estar dentro de um switch, while, so while ou for para terminar a iteração
	public static void main(String[] args) {
		
		//BREAK
		// fpr com o comando break parando a iteração
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i==8) {       //quando i for igual a 8 ira entra no if e para a iteração
				break;
			}
		}
		
		System.out.println("Exempo do continue");
		//CONTINUE
		// fpr com o comando continue salta uma iteração
	    for(int i=1; i<=10; i++) {
			
			if(i==8) {       //quando i for igual a 8 entrara no if e continuara sem imprimir o 8 e continuará a partir do 9
			   continue;
			}
			System.out.println(i);
	    }	
	}

}
