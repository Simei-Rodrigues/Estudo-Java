
public class Main {
	
	public static void main(String[] args) 
	{
		//COMO A CLASSE PESSOA ESTAR COMO ABTRATIC NÃO POSSO INSTANCIAR ELA DIRETAMENTE		
//		Pessoa pessoa1 = new Pessoa();    
//		pessoa1.setNome("Pessoa");        // PARA INSTANCIAR DEVE-SE TIRAR O ABSTRACT DA CLASSE PESSOA 
//		pessoa1.setIdade(40);
		
//		System.out.println(pessoa1);
		
		//ABAIXO É POSSÍVEL ACESSAR AS PROPRIEDADES DA CLASSE PESSOA PELA INSTÂNCIA DA CLASSE FILHA FUNCIONARIO
		Funcionario func1 = new Funcionario();
		func1.setCargo("Programador");
		func1.setSalario(6000.00);
		func1.setNome("Simei");   // CONSIGO USAR OS ATRIBUTOS DA CLASSE PESSOA APENAS NAS SUBCLASSE
		func1.setIdade(42);
		
		System.out.println("Nome: "+func1.getNome()+" -Idade: "+func1.getIdade()+
				" - Cargo: "+func1.getCargo()+" Salário: "+func1.getSalario());
		
		func1.apresentacao();
		
	}
}
