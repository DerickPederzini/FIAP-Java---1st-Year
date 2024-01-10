import java.util.Scanner;
public class check_correcao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		int idade, qtd1 = 0;
		double salario; 
		char sexo, ocupacao;
		String regiao;

		//idade
		for (int i = 0; i<6; i++){
			System.out.print("Digite sua idade: ");
			idade = e.nextInt();
			
		//salario	
			System.out.print("Digite seu sal�rio: ");
			salario = e.nextDouble();
			
		//sexo e validacao
			System.out.println("(M) = Masculino - (F) = Feminino");
			System.out.print("Digite seu Sexo: ");
			sexo = e.next().toUpperCase().charAt(0);
			
			while (sexo != 'M' && sexo!='F'){
				System.out.println("Digite 'M' ou 'F' para sexo: ");
				sexo = e.next().toUpperCase().charAt(0);
			}
		//ocupacao e validacao	
			System.out.print("Digite 'S' Para caso esteja sal�riado e 'N' para caso n�o esteja: ");
			ocupacao = e.next().toUpperCase().charAt(0);
			
			while (ocupacao != 'S' && ocupacao != 'N'){
				System.out.println("Digite corretamente sua situa��o sal�rial: ");
				ocupacao = e.next().toUpperCase().charAt(0);
			}
		// regiao e validacao	
			
			System.out.println("S = SUL - O = OESTE - N = NORTE - L = LESTE");
			System.out.print("Digite sua regi�o: ");
			regiao = e.next().toUpperCase();
			
			while (!regiao.equalsIgnoreCase("SUL") && !regiao.equalsIgnoreCase("NORTE")&&
					!regiao.equalsIgnoreCase("LESTE") && !regiao.equalsIgnoreCase("OESTE")){
				System.out.println("Digite a regi�o corretamente: ");
				regiao = e.next().toUpperCase();
			}
			
		//fim da entrada
		
		//inicio do processamento
			
			
		if (idade > 21 && salario > 2300){
			qtd1++;
		}
			
			
			
			
		}

	}

}
