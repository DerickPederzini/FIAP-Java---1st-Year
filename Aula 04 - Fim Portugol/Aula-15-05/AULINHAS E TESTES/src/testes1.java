import java.util.Scanner;

public class testes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
	
		String repeticao = "SIM";
		do{
		
		double preco = 0, totalP = 0;
		int condicao = 0;
		
		System.out.println("Digite o pre�o do item: ");
		preco = e.nextDouble();
		totalP += preco;
		
		while (preco != 0){
			System.out.println("Digite o pre�o de outro item desejado: ");
			preco = e.nextDouble();
			totalP += preco;
		}
		System.out.println("Digite a condi��o de pagamento: ");
		condicao = e.nextInt();
		
		switch (condicao){
		case 1:
			System.out.println("� vista, dinheiro ou cheque com 10% de desc: "+totalP*0.9);
		break;
		
		case 2:
			System.out.println("� vista, cart�o de cr�dito com 5% desc: "+totalP*0.95);
		break;
			
		case 3:
			System.out.println("Em 2x, pre�o normal: "+totalP);
		break;
			
		case 4:
			System.out.println("Em 3x, pre�o com acr�scimo de 10%: "+totalP*1.1);
		break;
		}
		
		System.out.println("Deseja digitar nova compra? ");
		repeticao = e.next();
		
		}while(repeticao.equalsIgnoreCase("SIM") || repeticao.equalsIgnoreCase("S"));
	}

}
