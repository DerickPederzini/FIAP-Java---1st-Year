import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner (System.in);
		
		DecimalFormat nF = new DecimalFormat("###0.00");
		
		int numParc = 0;
		double valInicial , juros = 0, valParc = 0, total = 0, valJuros;
		
		System.out.println("Digite o valor d�vida: ");
		valInicial = e.nextDouble();
		
		
		numParc = 1;
		total = valInicial;
		valParc = valInicial;
		
		
		System.out.println("Total"+total+"Juros"+juros+"N�mero parcelados"+valParc);
		
		juros = 10;
		numParc+=2;
		
		for (int cont = 1; cont < 5; cont++){
			
			valJuros =(valInicial*100)/100;
			total = valInicial + valJuros;
			valParc = total/numParc;
			
			System.out.println("Total: "+nF.format(total)+"- Juros: "+nF.format(juros)+"- N�mero parcelados: "+nF.format(valParc));
		}	
	}

}
