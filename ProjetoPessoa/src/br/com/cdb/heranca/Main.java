package br.com.cdb.heranca;
import java.util.ArrayList;

import br.com.cdb.heranca.model.*;

public class Main {

	public static void main(String[] args) {
		
		Pessoa fulano = new Pessoa("Simei");     //como tem o metodo construtor na classe Pessoa, pessoa tem que ser contuáda já passando o nome
		
		// fulano.nome = "Simei"; ja foi passado o nome como parametro para o método construtor 
		fulano.cpf = 1234567891; 
		
		fulano.apresentacao();
		
		Aluno aluno1 = new Aluno("Kelly", 10100);
	    //	aluno1.nome = "Kelly";  Devido o metodo contrutor na classe pessoa tenho que passar por parâmetro
		aluno1.cpf = 1234567809;
		//aluno1.matricula = 10;    
		aluno1.apresentacao();
		
		Funcionario funcionario1 = new Funcionario("Funcionario1");
		funcionario1.nome = "Funcionario1"; // como temos o metoto construtor na classe pessoa temos que já passar o nome
		funcionario1.cpf = 1234567089;
		funcionario1.salario = 5000.00;
		funcionario1.apresentacao();
		
		Professor prof = new Professor("Adiel");
	//	prof.nome = "Adiel";         // erdou da classe Pessoa
		prof.cpf = 123459812;        // erdou da classe Pessoa
		prof.salario = 100000.00;    // erdou da classe funcionarios
		prof.numerosDeAula = 10;     // vem da classe Professor
		prof.novoSalario(2.0, 15);
		prof.apresentacao();
		
	    Faxineiro faxineiro1 = new Faxineiro("Ze das Cove");
	    faxineiro1.turno = "Noturno";
	    faxineiro1.apresentacao();
	    
	     System.out.println("Nome : " +faxineiro1.nome);
	     
	     ArrayList<Pessoa> listaDaEscola =  new ArrayList<>();	
	     
	     listaDaEscola.add(fulano);
	     listaDaEscola.add(faxineiro1);
	     listaDaEscola.add(aluno1);
	     listaDaEscola.add(prof);
	     
	     for (Pessoa p : listaDaEscola) {   
	 		p.apresentacao();              // para testa esse for devemos comentar todas as chamada do metodo de apresentação acima de cada classe
//	        p.novosalario() ----> observe que não da pra acessar os metodos da classe filho, isso por as classes filhas não são de pessoa, no caso do metodo de apresentação ele é de pessoa e esta sendo sobrescrito nas classe filha
	        if (p instanceof Professor) {          // esse if garante que vai pegar no DOWNCASTING da classe professor
	        	System.out.println(" e tenho " +
	        	((Professor)p).numerosDeAula + " numero de aulas."); //aqui esta fazendo um DOWNCASTING, onde pode ser acessado um atributo ou um método da classe filha
	        }
	        System.out.println(aluno1); // aqui ele vai imprimir o endereço de momeoria o objeto pessoa, para impirmir as instancia deve se usa o metodo ToString
	                                    //colocar o metodo to string na classe pesso                                                                       
	        System.out.println(fulano);
	     }  
	}
}
