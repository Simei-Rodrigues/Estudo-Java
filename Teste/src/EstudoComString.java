
public class EstudoComString {
	
	public static void main(String[] args) {
		
		//MOSTRA O TAMANHO DA STRING CONTANDO COM OS ESPAÇOS
		String string1 = "Simei Rodrigues Jeronimo";
		int tamanho = string1.length();
		
		//MOSTRA O TAMANHO DA ESTRING SEM OS ESPAÇOS
		System.out.println("Tamanho da String é com espaços: " + tamanho);
		tamanho = string1.replace(" ","").length();
		System.out.println("O tamanho da string1 sem espaços é :" +tamanho);
		
		//CONTANDO UM DETERMINADO CARACTER DENTRO DE UMA STRING
		int totalCaracter = 0;
		char variavelProcurada;
		for (int i=0; i<string1.length();i++) {
			variavelProcurada = string1.charAt(i); // CONTANDO A QUANTIDADE DE i DENTRO DA STRING
			if (variavelProcurada == 'i')
				totalCaracter++;
		}
		System.out.println("Total de caracteres procurado é : "+totalCaracter);
		
		
	    //SEPARANDO A STRING PO ESPAÇO E COLOCANDO NUMM VETOR
		String[] array = string1.split(" ");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);			
		}
		
		String[] array1 = string1.split(" ", 2 );
		for (int i=0; i<array1.length; i++) {
			System.out.println(array[i]);			
		}
		
		System.out.println("Remove espaço da string : "+ string1 );
		
		String string2 = " Kelly Rodrigues Jeronimo ";
		string2 = string2.replace(" ","");   // TIRA OS ESPAÇOS DA STRING, TAMBÉM PODE-SE FAZER UMA SUBISTIUIÇÃO DO QUE FOR COLOCADO NO PRIMEIRO PARÂMETRO E TEM NA STRING PELO QUE ESTÁ NO SEGUNDO PARÂMETRO 
		System.out.println("Remove espaço da string : "+ string2 );
		
		//TESTANDO SE A STRING É SOMENTE DE LETRAS MAISCULAS, MINUSCULAS E ESPAÇOS
		String string3 = "Kelly Rodrigues Jeronimo9";
		boolean valido = true;
		if(!string3.substring(0).matches("[a-zA-Z' ']*")){ //EXPRESSÃO REGULAR, A STRING SO PODER CONTER CARACTERES DE A até Z, a até Z e espaços.
			valido = false;
			System.out.println("Entrou");
		}
		System.out.println("Nome é válido: " + valido);
		
		
	}
}
