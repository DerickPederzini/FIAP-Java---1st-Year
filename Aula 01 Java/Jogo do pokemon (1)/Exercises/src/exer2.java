import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner (System.in);
		
		String [] nomes = new String [3];
		String nome ;
		
		for (int i = 0; i < 4; i++){
			
			System.out.println("Digite o seu nome: ");
			nomes [i] = e.next();
		}
		System.out.println("Digite um nome para saber se est� na lista: ");
		nome  = e.next();
		
		if (nome == nomes [10]){
			System.out.println("ACHEI");
		}
		
		
		
	}

}
