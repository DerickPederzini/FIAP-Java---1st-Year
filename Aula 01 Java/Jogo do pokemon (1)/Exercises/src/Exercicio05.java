import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, numMa=0, numMe=0;
		
		Scanner e = new Scanner (System.in);
		
		
		for(int i=0; i<10; i++){
			System.out.print("Digite um número: ");
			num = e.nextInt();
			
			if (i==0){
				numMa=num;
				numMe=num;
			}
			
			if(num>numMa){
				numMa=num;
			}
			
			if(num<numMe){
				numMe=num;
				
			}
			
		}
		
		System.out.println("Número maior: "+numMa);
		System.out.println("Numero Menor: "+numMe);
	}

}
