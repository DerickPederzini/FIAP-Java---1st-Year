import java.util.Scanner;

public class testezin10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner (System.in);
		
		double valorI, juros = 0, valorP, valorI2 = 0, valorJuros;
		int parcelas = 1;
		
		
		System.out.println("Valor da d�vida: ");
		valorI = e.nextDouble();
		
		valorP = valorI;
		
		System.out.println("TOTAL: "+valorI+" Juros: "+juros+" Parcelas: "+parcelas+""
				+ "Valor da parcela: "+valorP);
		
		juros = 10;
		
		parcelas += 2;
		
		for (int i = 1; i < 5; i++){
		
			valorJuros = (valorI)+valorI*(juros/100);
			
			valorI2 = valorJuros;
			
			System.out.println("Total: "+valorI2+"JUROS: "+juros
					+ "Parcelas: "+parcelas+" Valor da parcela: "+valorI2/parcelas);
			
			juros += 5;
			parcelas += 3;
		}
		
	}	

}
