
public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Simei Rodrigues Jeronimo 03 03";
		
		String[] ValoresArray = texto.split(" "); //SPLIT esta separando a string que esta na variavel texto por espaço encontrado e coloca no vetor
		
		
		for(int i=0; i<ValoresArray.length; i++) {   // LENGTH pega o tamanho do vetor
			System.out.println(ValoresArray[i]);
		}
		
		System.out.println("Chegou");
		System.out.println(ValoresArray[1]);
	}
}
