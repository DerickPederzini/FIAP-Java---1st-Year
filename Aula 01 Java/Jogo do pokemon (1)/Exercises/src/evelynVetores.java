import java.util.Scanner;

public class evelynVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
			
		  int cont = 0;
		  String [] atletas = new String[5];
		  int [] idades = new int [5];
		
		  for (int i = 0; i < 5; i++){
			  System.out.print("Digite um atleta["+i+"]: ");
			  atletas [i] = e.next();
			  System.out.print("Digite a idade["+i+"]: ");
			  idades [i] = e.nextInt();
		  }
		  
		  System.out.println("Exibir vetor");
		  while (cont < 5){
			  
			  System.out.println(atletas[cont]);
			  System.out.println(idades [cont]);
			  cont++;
		  }
		  
		 int c = 0;
		 
		 while ( c < 5){
			 
			 System.out.println("Idade dos atletas com menos de 21 anos");
			 
			 if (idades [c] < 21){
				 
			 System.out.println(atletas [c]);
			 }
			 c++;
		 }
		  
	}

}
