import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner (System.in);
		
		String meses []= new String [] {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", 
				"Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		
		double[] temp = new double [12];
		double maior = 0, menor = 0;
		String maiorM = null, menorM = null ;
		//int indMaior= 0, indMenor = 0;
		
		
		for (int i =0; i <12; i++){
			
			System.out.println("Informe a temperatura do mês "+meses[i]+": ");
			temp [i] = e.nextDouble();
			
			if (i == 1){
				menor = temp [i];
				menorM = meses [i];	
				//indMenor = i/
			}		
			if (temp [i] > maior){
			maior = temp [i];
			maiorM = meses[i];
			//indMaior = i;
		} 
			if (temp [i] <= menor){
				menor = temp [i];
				menorM = meses [i];
				//indMenor = i/
		}

			
		//System.out.println("Maior Temperatura"+maior+" Mês "+ meses[indMaior]);
		//System.out.println("Menor Temperatura"+menor+" Mês "+ meses[indMenor]);
		
		System.out.println("MAIOR TEMPERATURA E MES");
		System.out.println(maior);
		System.out.println(maiorM);
		
		System.out.println("MENOR TEMPERATURA E MES");
		System.out.println(menor);
		System.out.println(menorM);
		}
	}
}
