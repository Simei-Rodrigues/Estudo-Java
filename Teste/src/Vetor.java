
public class Vetor {

	 public static void main (String args[]) {
		 
     //String Curso[];
     int i;
     
     String Curso[] = new String[4]; //criado vetor objeto Curso 
     {
    	 Curso[0] = "Java";
    	 Curso[1] = "Linux";
    	 Curso[2] = "XML"; 
    	 Curso[3] = Curso[0] + " - " + Curso[1] + " - " + Curso[2];
    	 for(i=0; i<4; i++)
    		 System.out.println("Curso["+i+"]"+Curso[i]);
     }
	 }
}
