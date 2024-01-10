import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int initialmatrix[][] = new int[2][2];
        int resultantmatrix[][] = new int [2][2];
        int biggestValue = 0;

        for (int i = 0; i < 2; i++) {
            for (int j =0; j<2; j++){

            System.out.println("Digite a matrix: ");
            initialmatrix[i][j]=entry.nextInt();

                if (biggestValue < initialmatrix[i][j]) {
                    biggestValue = initialmatrix[i][j];
                }
            }
        }

        for (int i =0;i<2;i++){
            for (int j = 0; j<2;j++){
                resultantmatrix[i][j]=initialmatrix[i][j]*biggestValue;

                System.out.println("Resultado - R["+i+","+j+"] = "+resultantmatrix[i][j]);
            }
        }
    }
}
