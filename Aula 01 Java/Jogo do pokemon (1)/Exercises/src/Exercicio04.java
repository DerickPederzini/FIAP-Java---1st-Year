import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso=0, altura=0, idadeM, porc ;
		int idade=0, idadeQ=0, idadeQ2=0, qtdR=0, qtdO=0, i, idadeC = 0 ;
		char olhos, cabelo;
		
		Scanner e = new Scanner(System.in);
		
		for (i=0; i<10; i++){
			
			System.out.print("Digite a idade: ");
			idade=e.nextInt();
			
			System.out.print("Digite o peso: ");
			altura=e.nextDouble();
			
			System.out.print("Digite a altura: ");
			peso=e.nextDouble();
			
			System.out.print("A = AZUL - P = PRETO - C = CASTANHO - V = VERDE");
			
			System.out.println("Digite a cor do olho: ");
			olhos=e.next().toUpperCase().charAt(0);
			
			System.out.print("L = LOIRO - P = PRETO - C = CASTANHO - R = RUIVO");
			
			System.out.println("Digite a cor do cabelo: ");
			cabelo=e.next().toUpperCase().charAt(0);
			
			
			if (idade>50 && peso<60){
				idadeQ++;	
			}
			
			if (cabelo=='R' && olhos!='A') {
				qtdR++;	
			}

			if (olhos=='A'){
				qtdO++;
			}
			
			if (altura < 1.50){
				idadeQ2++;
				idadeC =+ idade;
			}
			
			idadeM = (idadeC / idadeQ2);
			porc= (qtdO * 100)/ i;
			
			System.out.println("Quantia de pessoas acima"
					+ " de 50 anos e menos de 60kg: "+idadeQ);
			
			System.out.println("Médias das pessoas com menos de 1.50m: "+idadeM);
			
			System.out.println("Porcentagem de olhos azuis: "+porc+"%");
			
			System.out.println("Quantidade de ruivas sem olhos azuis: "+qtdR);
			
		}
	}

}
