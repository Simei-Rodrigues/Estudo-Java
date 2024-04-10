package br.com.cdb.heranca.model;

public class Professor extends Funcionario {
	
	public int numerosDeAula;
	
	public Professor(String nome) {
		
		super(nome);
	}
	
	//METODOS SALARIO
	public void novoSalario(Double novoSalario) {
		this.salario = novoSalario;			
	}
    //BOBRECARGA DO MÉTODO NOVO SALARIO
	//VEJA QUE O NOME DO METODO É O MESMO, MUDOU APENAS A QUANTIDADE DE PARÂMETRO, PODERIA SER TAMBEM UM SÓ PARÂMETROS DE TIPO DIFERENTE
	public void novoSalario(Double novoSalario, int numAulasAdic) {
		
		this.salario = novoSalario;
		this.numerosDeAula += numAulasAdic;
		
	}
}
