import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ArrayListNumero {
	
	public static void main(String[] args) { 
	
		
		List<Double> notas1 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //Obs: d é usado para decimal ex; 
		List<Double> notas2 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		
		System.out.println(notas1.get(6)); //imprime a posição 6
		
		System.out.println("Exiba a posição da nota 5.0: " + notas1.indexOf(5d)); //Como Exibir a Posição de um Elemento
		
		//Adicionar um valor em uma posição já existente
		//No método add() serão passados 2 parâmetros, a posição desejável e o valor que será
		//adicionado nela add(posição, valor do elemento).
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		//notas1.add(4, 8d);
		
		//Conferir se algum valor está na lista
		System.out.println("Confira se a nota 5.0 está na lista: " + notas1.contains(5d));
		
		//Para imprimir o ArrayList linha a linha, pode ser utilizado o forEach():
		for (Double nota : notas1) 
			System.out.println(nota);
		
		
		//  Fazer a soma dos elementos de dentro da minha lista (Iterator
		//  Para que eu possa fazer a soma dos elementos de dentro da minha lista, preciso chamar 
		//  o método iterator e ir iterando dentro da minha list.
		
		notas1.iterator();                    //  Como criar uma variável do padrão iterator:
		
		Iterator<Double> iterator = notas1.iterator();        //  passando a lista para variável    
		Double soma = 0d;                                     // inicializando a variável soma com 0.0
		while (iterator.hasNext()) {          // pergunta se há um proximo elemento na lista, caso true entra no loop, caso falso sai do loop                             
			Double next = iterator.next();    // pega o valor do próximo elemento da lista e coloca na variavel next
			soma += next;                     // soma o valor que esta em soma + next
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		// AS LINHAS COMENTADAS ABAIXA É O PORQUE NESSE EXEMPLO DA ERRO, POIS O TAMANHO DO ARRAY É FIXO E NÃO PODE SER DELETADO NENHUM MEMBRO
		
/*		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas1.iterator();
		while (iterator1.hasNext()){
		  Double next = iterator1.next();
		  if (next < 7) {
			  iterator1.remove();
		  }
		}
		System.out.println(notas1);   */
		
		//   Remoção do elemento da lista
		
	/*	System.out.println("Remova a nota 0: ");
		notas1.remove(0d);
		System.out.println(notas1);   */
		
		
		//   Remoção do elemento de uma posição específica da lista
		
/*		System.out.println("Remova o elemento da posição 0: ");
		notas1.remove(0);
		System.out.println(notas1);
		
		//   Apagar toda a lista
		System.out.println("Apague toda a lista");
		notas1.clear();
		System.out.println(notas1);   */
		
		//   isEmpty()
		//   É um booleam, por exemplo, se a lista de notas3 estiver vazia, ele voltará um true, se não, voltará um false.
		System.out.println("Confira se sua lista está vazia: " + notas1.isEmpty());   
		
	}

}
