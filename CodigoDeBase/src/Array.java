import java.util.Arrays; // parra usar a classe Arrays

public class Array {

	public static void main(String[] args) {
		
		String[] aluno = {"Simei","Girleande","Natalia","Kelly"}; // apenas declarei o meu vetor e aloquei espaço para ele
	
    	System.out.println("Nome1: " + aluno[0]);
    	System.out.println("Nome2: " + aluno[1]);
    	System.out.println("Nome3: " + aluno[2]);
    	System.out.println("Nome4: " + aluno[3]);
    
    	System.out.println(Arrays.toString(aluno)); // imprime o conteúdo de todas posições do array
    	
	}
		
}
