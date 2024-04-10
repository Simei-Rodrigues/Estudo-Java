package array.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayLista {
	
	public static void main(String[] args) {
		
//DECLARAÇÃO DA LISTA QUE SE CHAMA listaDeCompras		
		ArrayList<String> listaDeCompras = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		

		String  str = "x";
	    boolean opcao = true;
 		while (opcao == true) 
 		{
			System.out.println("Digite um item ou 'x' para terminar a lista : ");
			String item = input.next();
			
			//verifia se o valor ou nome informado esta na lista, CONTAINS é boolean
			if (listaDeCompras.contains(item))
	        	System.out.println("Item já está na lista");
	        else
	        	
		        if (item.equals(str)){
					opcao = false;
				}else {
				listaDeCompras.add(item);
				}
 		}	
	
			
		//ADICIONANDO ELEMENTOS NA LISTA DE COMPRAS
	/*	listaDeCompras.add("Arroz");
		listaDeCompras.add("Feijão");
		listaDeCompras.add("Farinha");
		listaDeCompras.add("Ovo");
*/
		
		//MOSTRANDO ELEMENTO DA LISTA ATRAVES DO INDICE
		System.out.println(listaDeCompras.get(0));
		
		if (listaDeCompras.get(0) == "Feijão") {
			//REMOVE ELEMENTO DA LISTA DE COMPRA PELO INDICE
			listaDeCompras.remove(0);
		}
		
		// IMPRESSÃO DE TODOD DO DADOS DO LISTARRAY
		//OBSERVE QUE SERÁ IMPRESSO FARINHA E NÃO FEIÃO PARA O ELEMENTOS NA MESMA OPÇÃO 1
		
		//System.out.println(listaDeCompras.get(0)); // essa linha imprime o conteúdo da posição 0 da lista
		
		for(int i=0; i<listaDeCompras.size(); i++) 
		{
			System.out.println("Item "+i+" : "+listaDeCompras.get(i));
		}
		
		//ADICIONAR ITEM NA LISTA POR POSIÇÃO 
//No método add() serão passados 2 parâmetros, a posição desejável e o valor que será adicionado 
//		nela add(posição, valor do elemento).		
		System.out.println("Escolher a posição entre 0 e " +(listaDeCompras.size()-1)+ " que sera adicionado o item : ");
		int i = input.nextInt();
		System.out.println("Digite novo item para Compra: ");
		String item = input.next();
		listaDeCompras.add(i, item);

//No ArrayList ele já vai imprimir automaticamente na ordem em que os elementos foram adicionados.
		//Para imprimir o ArrayList linha a linha, pode ser utilizado o forEach():
		for(String s: listaDeCompras) {
			System.out.println(s);
		}
		
		System.out.println("Digite o nome do intem para retornar a posição dele na lista: ");
		item = input.next();
		System.out.println("Lista posição: " +listaDeCompras.indexOf(item));

		
//		Neste caso será utilizado o método set() e dentro dele será passado como parâmetro o 
//		método indexOf() e o novo valor desejado. Pelo indexOf() será possível acessar a posição 
//		do elemento com o valor antigo e fazer a troca para o novo valor através do set().		
	
		System.out.println("Digite o item a ser trocado: ");
		item = input.next();
		System.out.println("Digite o novo item: ");
		String novoItem = input.next(); 
		
		listaDeCompras.set(listaDeCompras.indexOf(item), novoItem); //AQUI METETO SET USANDO O METODO INDEXOF PARA TROCAR
		
		for(i=0; i<listaDeCompras.size()-1; i++) {
			System.out.println("Item " + i + ": " + listaDeCompras.get(i));
		}
		
		//  ORDENAR A LISTA 
		Collections.sort(listaDeCompras);      
		
		//PERCORRENDO A LISTA DE OUTRA FORMA - 
		listaDeCompras.forEach(produto -> {
		
		    System.out.println("Item " + produto);       
		});
		
	}
}
