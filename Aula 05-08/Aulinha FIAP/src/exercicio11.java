import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner (System.in);
	
		
		char repeticao;
		char repeticao1;
		do {
		char pagamento = 0;
		String nome, modelo = " "; 
		int tipo, quantidade = 0, precoi3;
		double valori3 = 0 , valori5 = 0, valori7 = 0, valorF = 0;
		
		
		//atribui��o inicial de vari�vel	
		//inicio while	
		
		
		System.out.println("Digite o nome do cliente: ");
		nome = e.next();
		
		System.out.println("1 = DeskTops - 2 = NoteBooks");
		System.out.println("Digite o tipo do computador");
		tipo = e.nextInt();
		
		//comeco while
		while (tipo != 0){
			
		while (tipo != 1 && tipo !=2){
		System.out.println("Digite o tipo indicado: ");
		tipo = e.nextInt();
		} // fim while tipo 1
		
		//continua��o das entradas	
		System.out.println(" 'I3' = PROCESSADOR I3 - 'I5' = PROCESSADOR I5 - 'I7' = PROCESSADOR I7");
		System.out.println("Digite o modelo do computador: ");	
		modelo = e.next();
		
		
		//verificacao
		while (! modelo.equalsIgnoreCase("i3")&& ! modelo.equalsIgnoreCase("i5") && !modelo.equalsIgnoreCase("i7")) {
			System.out.println("Digite o modelo correto: ");
			modelo = e.next();
		}
		
		System.out.println("Digite a quantidade de computadores desejados: ");
		quantidade += e.nextInt();
		
		//fim das entradas de dados 
		//come�o do processamento e contas
		
		if (tipo == 1 && modelo.equalsIgnoreCase("i3")){
			valori3 = 1801;
		}else {
			if (tipo == 1 && modelo.equalsIgnoreCase("i5")){
				valori5 = 2429;
			}else {
				if (tipo==1 && modelo.equalsIgnoreCase("i7")){
					valori7 = 3150;
					
			} else {
				if (modelo.equalsIgnoreCase("i3")){
					valori3 = 1899;
				}else {
					if (modelo.equalsIgnoreCase("i5")){
						valori5 = 2799;
			}else {
				valori7 = 3199;
			}
			}
			}
			}
			}
		valorF = valori3 + valori5 + valori7;
		
		System.out.println("Digite 'V' para pagar a vista ou 'P' para pagar a prazo: ");
		pagamento = e.next().toUpperCase().charAt(0);
		
		System.out.println("-----------NOVO-CLIENTE--------------");
				
				System.out.println("1 = DeskTops - 2 = NoteBooks");
				System.out.println("Digite o tipo do computador");
				tipo = e.nextInt();
		//come�o da sa�da		
				
				if (pagamento =='V' && quantidade > 2 ){
					System.out.println("Valor da quantia de computadores comprados: "+(valorF * quantidade));
					System.out.println("Forma de pagamento: "+ pagamento);
					System.out.println("quantia de computadores comprados: "+quantidade);
					System.out.println("Valor da quantia de computadores comprados com 20% desconto: "+(valorF * quantidade)*0.8);
				} else {
					System.out.println("Valor da quantia de computadores comprados: "+(valorF * quantidade));
					System.out.println("Forma de pagamento: "+ pagamento);
					System.out.println("quantia de computadores comprados: "+quantidade);
					System.out.println("Valor da quantia de computadores comprados com 10% desconto: "+(valorF * quantidade)*0.9);
				} if (pagamento =='P'){
					System.out.println("Valor da quantia de computadores comprados: "+(valorF * quantidade));
					System.out.println("Forma de pagamento: "+ pagamento);
					System.out.println("quantia de computadores comprados: "+quantidade);
					System.out.println("Valor da quantia de computadores comprados com 10% de acr�scimo: "+(valorF * quantidade)*1.1);
					System.out.println("Deseja parcelar em quantas vezes? ");
					
				}
		}//fim do while loop
		
		//continua��o
		
		System.out.println("Deseja fazer nova compra? ");
		repeticao1 = e.next().toUpperCase().charAt(0);
		
		}while (repeticao1 == 'S');
	}
}
