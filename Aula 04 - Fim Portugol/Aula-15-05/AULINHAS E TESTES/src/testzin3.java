import java.util.Scanner;

public class testzin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		double peso, altura = 0; 
		int idade, idadeS, qtd50, qtdId, qtdA, qtdR, idades = 0;
		char olho, cabelo;
		String alturas;

			
		System.out.println("Digite a idade ");
		idade = e.nextInt();
		System.out.println("Digite altura: ");
		altura = e.nextDouble();
		System.out.println("Digite peso: ");
		peso = e.nextDouble();
		
		idades = (idade>40) ? idade += idade: idade+5;
			
		System.out.println(idades);
		
		alturas = (altura > 1.85) ? "Derick é lindo" : "Derick é demais";
		
		System.out.println(alturas);
	}

}
