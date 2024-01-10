import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#0.00");
		
		//System.out.print("Hello world");
		//sysout - ctrl + barra de espaço
		
		
	int idade = 0, cont=0, qtdIdade50= 0, qtdAlt=0;
	double altura=0, peso=0, somaAltura=0, pesoMenor=0, porc;	
	String nome;
	
	//variavel de controle
	//for(int i=0;i<20;i++){}
	
	while (cont<3){
		System.out.print("Digite o nome:");
		nome=entrada.next();
		
		System.out.print("Digite a idade:");
		idade=entrada.nextInt();
		
		System.out.print("Digite o peso:");
		peso=entrada.nextDouble();
		
		System.out.print("Digite a altura:");
		altura=entrada.nextDouble();
		
		//A
		
		if (idade > 50) {
			qtdIdade50++;
		}
		
		//B
		
		//&& = e || = ou
		
		if (idade > 10 && idade < 20) {
			//somaAltura<- somaAltura + altura
			somaAltura += altura;
			qtdAlt++;
		}
		
		if (peso < 40) {
			
			pesoMenor ++;
		
		}
		cont++;	
		
	}
	
	System.out.println("Idade superior 50 anos: "+ qtdIdade50);
	
	if (qtdAlt == 0){
		System.out.println("Médias das alturas: 0");
	} else {
		System.out.println("Média das alturas: "+ numFormatado.format(somaAltura/qtdAlt));
	}
	
	porc = (pesoMenor/3)*100;
	System.out.println("Porcentagem de pessoas"
			+ " com peso inferior a 40:"+porc+"%");
	
	
	
	
		
		
	}//static

}//p class