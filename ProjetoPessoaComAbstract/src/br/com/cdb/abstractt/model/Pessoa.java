package br.com.cdb.abstractt.model;

public class Pessoa {
	
	private String nome;
	private String cpf;
	

	public Pessoa(String nome) {     // observe que no construtor não temos o cpf, logo para acessar
		                             // o cpc tenho que criar uma instância de pessoa
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	
	public void apresentacao() {
		System.out.println("Ola, meu nome é "+nome+" e meu cpf é : "+cpf);
	}
	
}