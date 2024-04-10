//NESSE PROJETO DA PRA ENTERDER CLARAMENTE O USO DOS METODOS SETTER E GETTER E DE TOSTRING
public class Main {
	
	public static void main(String[] args)
	{
		//INSTANCIANDO UM FUNCIONARO
		Funcionario func1 = new Funcionario("Simei", 42);
		func1.setCargo("Programador"); //VEJA QUE PARA PASSAR O CARGO FOI USADO O MÉTODO SETTER DA CLASSE FUNCIONARIOS, POIS OS ATRIBUTOS SÃO PRIVADOS
		func1.setSalario(6000.00);
		
		// PARA EXIBIR OS VALORES NA SYSOUT TEVE-SE QUE USAR O MÉTODO GETTER PARA RETORNAR O VALOR INSTANCIADO
		System.out.println("Nome do Funcionario: "+func1.getNome()+" com Idade de " +
		      func1.getIdade()+ " com o cargo de "+ func1.getCargo()+ " e salario de "+ func1.getSalario());
	    
		Funcionario func2 = new Funcionario("Kelly", 40);
		func2.setCargo("Analista de Produção");
		func2.setSalario(3500.00);
		
		System.out.println("O nome do funcinário é "+ func2.getNome()+" de "+func2.getIdade()+ 
				" de idade, com cargo de "+func2.getCargo()+ " e salário de "+ func2.getSalario());
		//ABAIXO A SYSTOUT EXIBE OS VALORES CONFORME DEFINIDO NO MÉTODO TOSTRING DA CLASSE FUNCIONARIO
		System.out.println(func1);
	
	}
}
