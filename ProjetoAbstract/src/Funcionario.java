
public class Funcionario extends Pessoa{
	
	private String cargo;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	// OBRIGATORIAMENTE DEVE-SE TER O METRO APRESENTACAO() IMPLEMENTADO NAS CLASSE FILHA DE PESSOA
	//POR CONTA DESSE METODO ESTAR COMO ASTRACT NA CLASSE PESSOA
	public void apresentacao() {
		System.out.println("Esse método teve que ser implementado obrigatoriamente por conta "
				+ "ter ele como subtract na classe Pessoa");
	}
	
}
