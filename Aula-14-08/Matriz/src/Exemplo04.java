import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        DecimalFormat dcf = new DecimalFormat("R$ #,##0.00");

        int code [][] = new int[5][2];
        double value[][] = new double[5][2];
        double totG = 0;

        for (int i = 0; i<5; i++){

            System.out.println("Produto"+(i+1));

            System.out.println("Digite o código: ");
            code[i][0]= entry.nextInt();

            System.out.println("Digite o preço: ");
            value[i][0]=entry.nextDouble();

            System.out.println("Digite a quantidade: ");
            code[i][1]=entry.nextInt();

            value[i][1]=value[i][0]*code[i][1];

            totG +=value[i][1];
        }

        for (int i=0;i<5;i++){
            System.out.println("Código "+code[i][0]+" Preço "+value[i][0]+" qtd "+code[i][1]+" Total "+dcf.format(value[i][1]));
        }
        System.out.println(dcf.format(totG));


    }
}
