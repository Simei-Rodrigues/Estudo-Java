
public class Funcionario extends Pessoa {
	
	private String cargo;
	private Double salario;
	
	
	public Funcionario(String nome, int idade) 
    {
	    super(nome, idade);
	}
	
	//GETTER E SETTER DEFINIDOS PARA MA NIPULAÇÃO DAS PROPRIEDADES PRIVADAS
	
	//GETTER PARA LEITURA DOS PARÂMETROS
	public String getCargo() 
	{
		return cargo;
	}
	//SETTER PARA PASSAGEM DOS PARÂMETROS 
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Double getSalario() 
	{
		return salario;
	}
	
    public void setSalario(Double salario)
	{
		this.salario = salario;
	}
    
    //OVIRRIDE PARA IMPRIMIR PELA INSTANCIA NA CLASSE PRINCIPAL
	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", salario=" + salario + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + "]";
	}
    
    
    
}
