
public abstract class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "nome : "+nome+" - Idade: "+idade;
	}
	
	//QUANDO EU CRIO UM MÉTODO ABSTRACT EM UMA CLASSE PAI, QUALQUER CLASSE FILHA OBRIGATORIAMENTE 
	//DEVE IMPREMENTAR ESSE MÉTODO, SERVE AXATAMENTE PARA QUANDO SE TEM NESSECIDADE DE TER AQUELE MÉTODO IMPLEMENTADOS NA CLASSE FILHA
	public abstract void apresentacao();

}
