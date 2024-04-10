
public class Conta {
	
	private int numeroDaConta;
	private String agencia;
	
	public Conta(int numeroDaConta, String agencia) 
	{
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta( int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	

}
