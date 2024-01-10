import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int table [][] = new int[4][5];

        for (int i =0; i<4; i++){
            System.out.println("Digite o código do cliente: ");
            table[i][0]=entry.nextInt();

            System.out.println("Digite a quantidade de milhagem: ");
            table[i][1]=entry.nextInt();

            System.out.println("Digite a categoria: ");
            table[i][2]=entry.nextInt();

            while (table[i][2]>3 || table[i][2]<1){
                System.out.println("Digite uma categoria correta: ");
                table[i][2]=entry.nextInt();
            }

            if (table[i][2] == 1){
                table[i][3] = 10000;
            } else if (table[i][2]==2) {
                table[i][3] = 5000;
            } else {
                table[i][3] = 0;
            }

            table[i][4]= table[i][1]+table[i][3];

        }

        for (int i=0;i<4;i++){

            System.out.println("Código do cliente: "+table[i][0]+"\t Quantidade de milhagem" +
                    ": "+table[i][1]+"\t Categoria: "+table[i][2]+"\t Bônus: "+table[i][3]+"\t Milhagem Atual: "+table[i][4]);

        }




    }
}
