
public enum TipoConta {
	
	CONTA_COMUM("CC", 0.03),
	CONTA_SUPER("CS", 0.02),
	CONTA_PREMIUM("CP", 0.01);

	private final String sigla;
	private final Double taxa;

	TipoConta(String sigla, double taxa) {
		this.sigla = sigla;
		this.taxa = taxa;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public Double getTaxa(){
		return taxa;
	}
	
}	
