import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int numeros [] [] = new int[3][3];

        //linha
        for (int linha = 0; linha < 3; linha++){
            //coluna
            for (int col = 0; col < 3; col++){

                System.out.println("Digite um valor para números da matriz ["+linha+","+col+"]: ");
                numeros[linha][col] =entry.nextInt();


            }
        }

        //exibir matriz

        for (int linha = 0; linha<3; linha++){
            for ( int col = 0; col <3; col++){

                System.out.print(numeros[linha][col]+"\t");
            }

            System.out.println("");

        }



    }
}