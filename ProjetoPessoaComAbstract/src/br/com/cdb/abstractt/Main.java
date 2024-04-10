package br.com.cdb.abstractt;

import br.com.cdb.abstractt.model.Pessoa;

public class Main {
	
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Simei");
	//	String cpf = "123456789";
		pessoa1.setCpf("123456789");        // Com o atributo da classe pessoa como private, a alteração deve ser feita pelo método setter
		pessoa1.apresentacao();
		
		System.out.println("Simei tem o cpf :" +pessoa1.getCpf()); // para imprimir comente o cpf, dever ser pelo método getter, pois está como privado na classe Pessoa
		
		//Pessoa pessao2 = new Pessoa("Kelly", "21802693811");
		//pessao2.apresentacao();
	}

}
