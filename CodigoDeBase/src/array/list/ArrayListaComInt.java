package array.list;
import java.util.List;
import java.util.ArrayList;

public class ArrayListaComInt{
	
	public static void main(String[] args) {

		ArrayList<Integer> ListaDeNotas = new ArrayList<>();
		
		Integer numero;
		ListaDeNotas.add(10);
		ListaDeNotas.add(9);
		ListaDeNotas.add(5);
		ListaDeNotas.add(8);
		ListaDeNotas.add(7);
		
		System.out.println(ListaDeNotas.get(1));
		
		// IMPRIME TODA LISTA - CRIA A VARIAVEL, NO CASO FOI NOTA PARA RECUPERAR POR ELA
		for (Integer nota : ListaDeNotas) 
		{
			System.out.println(nota); //
		}
		System.out.println("tamano da lista: "+ListaDeNotas.size());
		
	}
}




