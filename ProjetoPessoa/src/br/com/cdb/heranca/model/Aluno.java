package br.com.cdb.heranca.model;

public class Aluno extends Pessoa  {
   
	public int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		
		super(nome); // aqui no caso esta chamando o método construtor da classe Pessoa e passando como parâmetro o nome
	    this.numeroMatricula = numeroMatricula;
	}
	
	@Override //indica que o metodo abaixo ja existe na classe pessoa mas que será sobrescrito 
	public void apresentacao(){    // 
		
		  System.out.println("Ola. eu sou o aluno " +nome+   // Quando eu chamar esse metodo apresentacao() na classe main ele 
				           " e minha matrícula é " + numeroMatricula);  // exibira essa sysout e não a do metodo pessoa da classe pai, por aqui ele foi sobrescrito
	}

}
