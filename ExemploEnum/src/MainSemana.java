import java.util.Scanner;
public class MainSemana {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//USUARIO DIGIRA O DIA DA SEMANA POR EXTENSO E RETORNA A SIGLA
		System.out.println("Digite o nome do dia da semana que deseja busca a sigla - EX: segunda-feira : ");
		String diaSemana = input.nextLine();
		DiaDaSemanaEnum semana = null;
		System.out.println(semana.getDiaDaSemanaPeloNome(diaSemana));
		
		//USUARIO DIGITA O NÚMERO CORRESPONDENTE AO DIA DA SEMANA E RETORNA O DIA POR EXTENSO
		System.out.println("Digite o dia da semana numério para retornar o nome : ");
		int diaString = input.nextInt();
		System.out.println(semana.getNumeroDoDia(diaString));
		
	}
	
}
