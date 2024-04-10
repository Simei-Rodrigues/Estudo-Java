
public class Main {

	
	public static void main(String [] args) {
		
		for (TipoConta c: TipoConta.values()) {
			System.out.println("Tipo de contgas: " + c);
		}
		
	    TipoConta conta = TipoConta.CONTA_COMUM;
	    System.out.println("A Sigla da conta Comum é : " + conta.getSigla()
	                       +" com taxa de : " + conta.getTaxa());
	    Double result = 100 * conta.getTaxa();
	    System.out.println("A taxa da conta comum aplicada a 100 é = " + result);
//		Conta conta1 = new Conta(123, "bradesco");
		
	}
}
