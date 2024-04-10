import java.util.Scanner;
public class Array3 {

	 public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 
		 String[] aluno = new String[4];
		 
		 //ENTRADA DE DADOS PELO CONSOLE USANDO SCANNER
		 for(int i=0; i<4; i++) {
			 System.out.println("Digite o nome do aluno "+(i+1)+ ":");
			 aluno[i] = input.nextLine();
		 }
		 
		 for(int i=0; i<4; i++) {
			 System.out.println("Aluno "+i+ ": " + aluno[i]);
		 }
	 }
	 
}
