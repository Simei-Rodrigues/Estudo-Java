package br.com.cdb.heranca.model;

public class Pessoa {
	
	//PROPRIEDADES
	public String nome;
	public long cpf;
	
	//METODO CONSTRUTOR DE PESSOA
	public Pessoa( String nome) {
		this.nome = nome;
	}
	
	//METODOS
	public void apresentacao() {
		System.out.println("Ola, meu nome é "+nome);
	}
    @Override
	public String toString() {
		
		return this.nome+ " - " + this.cpf;   // Na classe principa temo a impresão do objeto, e vai apracer 
		                                      // e vai aprecer o nome e o cpf por causa desse método, se tiremos esse metodo irá imprimir o endereço de memoria
	}
}
