
public class Matriz {

	public static void main (String args[]) {
		int i,j;
		
		String Quadrada[][] = new String[2][2];
		{
			Quadrada[0][0] = "Simei rodrigues";
			Quadrada[0][1] = "Quelita Rodrigues";
			Quadrada[1][0] = "Natalia Rodrigues";
			Quadrada[1][1] = "Idair Geraldo";
			for (i=0; i<2; i++)
				for(j=0; j<2; j++)
					System.out.println("Quadrada["+i+"]["+i+"] = " + Quadrada[i][j]);
					
		}
	}
}
