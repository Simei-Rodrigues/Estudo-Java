import java.util.List;
import java.util.ArrayList;
public class ArrayLista {
	
	private static ArrayList<String> NomeDaTarefa = new ArrayList<>();
	
	
    public ArrayLista(ArrayList<String> nomeDaTarefa) {
		super();
		NomeDaTarefa = nomeDaTarefa;
	}

	public ArrayList<String> getNomeDaTarefa() {
		return NomeDaTarefa;
	}

	public void setNomeDaTarefa(ArrayList<String> nomeDaTarefa) {
		NomeDaTarefa = nomeDaTarefa;
	}
	
	public static void main(String[] args) {
	    NomeDaTarefa.add("Simei");
	    
	    System.out.println("NOme: " + NomeDaTarefa );
    }
}