
public enum DiaDaSemanaEnum {
	
	DOMINGO("Domingo","DOM", 1),
	SEGUNDA_FEIRA("Segunda-feira ", "SEG", 2),
	TERCA_FEIRA("Terça-feira", "TER", 3),
	QUARTA_FEIRA("Quarta-feira", "QUA", 4),
	QUINTA_FEIRA("Quinta-feira", "QUI", 5),
	SEXTA_FEIRA("Sexta-feira", "SEX", 6),
	SABADO("Sabado", "SAB", 7);
		
	private String diaDaSemana;
	private String sigla;
	private int numeroDoDia;
	
	private DiaDaSemanaEnum(String diaDaSemana, String sigla, int numeroDoDia) {
		this.diaDaSemana = diaDaSemana;
		this.sigla = sigla;
		this.numeroDoDia = numeroDoDia;
	}
	
	
	public String getDiaDaSemana() {
		return diaDaSemana;
	}


	public String getSigla() {
		return sigla;
	}


	public int getNumeroDoDia() {
		return numeroDoDia;
	}

    //METODO PARA RETONAR A SIGLA DO DIA DA SEMANA PASSANDO DIGITANDO O DIA DA SEMANA
	public static String getDiaDaSemanaPeloNome(String diaDaSemana) {   //METODO CRIADO PARA RECEBER O DIA DA SEMANA PASSADO PELA CLASSE PRINCIPAL
		for (DiaDaSemanaEnum dia: values()) {  //FOR APRIMORADO PARA VARER A LISTA ATÉ ENCOTRAR DIA DASEMANA PASSADO E RETORNAR A SIGLA REFERENTE AO DIA
			if(dia.getDiaDaSemana().equalsIgnoreCase(diaDaSemana)) { //COMPARA O DIA PASSADO PELO USUARIO COM O QUE ESTA AQUI NA CLASSE ENUM PELO METODO GETTER
				return dia.getSigla();  // RETORNA USASNDO O GETTER
			}
		}
		return null; //RETORNA NULO SE DIA DA SEMANA NÃO FOR ENCONTRADO
	}
	
	public static String getSigla(String sigla) {
		for (DiaDaSemanaEnum dia: values()) {
			if (dia.getSigla().equalsIgnoreCase(sigla)) {
				return dia.getDiaDaSemana();
			}
		}
		return null;
    }
	
	public static String getNumeroDoDia(int numeroDoDia) {
		for (DiaDaSemanaEnum dia: values()) {
		    if(dia.numeroDoDia == numeroDoDia){
		    	return dia.diaDaSemana;
		    }
		}
		return null;
	}
}
