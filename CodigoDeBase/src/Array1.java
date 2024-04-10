public class Array1 {

	public static void main(String[] args) {
		
		String[] nome = new String[4]; // apenas declarei o meu vetor e aloquei espaço para ele
		
		// carrendo o vetor após declaração
		nome[0] = "Simei";
		nome[1] = "Girleande";
		nome[2] = "Natalia";
		nome[3] = "Kelly";
		
		//saida: imprimindo os valores do vetor pelo indice
		for(int i=0; i<4; i++)
		    System.out.println("Nome "+i+": " + nome[i]);
			
		}
		
	}
		
