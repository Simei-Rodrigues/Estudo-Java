import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		int[] notas = {5,2,8,1,4,10,5,21,6,7,6,9,15,1};
		
		int maior = notas[0];
		
	    for (int i=0; i<notas.length; i++) 
		{
			if (notas[i] > maior)
			{
				maior = notas[i];
			}
		} 
		
		System.out.println("maior nota: " + maior);
		
//LOGICA PARA ORNDENAÇÃO DO VETOR - LEMBRANDO QUE TEM UMA FUNÇÃO JA PRONTA DENTRO O ARRAYS PARA ORDENAR
		
		int menor = notas[0];
		for( int i=0; i<notas.length; i++)
		{
			
			for(int j=0; j<notas.length; j++) 
			{
								
				if (notas[j] <= notas[i]) 
				{
					menor = notas[i];
					notas[i] = notas[j];
					notas[j] = menor;
				}
			}
		}
		
		// IMPRIME VALORES ORDENADOS DO VETOR - COM A ORDENAÇÃO ESTA ASCENDENTE A IMPRESSÃO FOI DO MAIOR INDICE PARA O MENOR
		for(int i=(notas.length -1); i>=0; i--) {
			System.out.println(notas[i]);
		}
		//System.out.println(notas[i]);
		System.out.println(Arrays.toString(notas));
		
// SOMA DOS ELEMENTOS DO VETOR  
		
		int aux = 0, resultado = 0;
		for(int i=0; i<notas.length; i++) 
		{
			resultado = resultado + notas[i];
		}
		System.out.println("A somas do Elementos do vetor é: " + resultado);
	}
	
}






