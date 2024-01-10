import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int matriz [][] = new int[4][4];
        int result [] = new int[4];
        int somalinha =0, totgeral = 0;
        int somalinhaV[]= new int[4];
        int somacoluna[] = new int [4];

        for(int i = 0; i<4;i++){
            for (int j =0; j<4;j++){

                System.out.println("Digite para a matriz ["+i+","+j+"]");
                matriz[i][j] = entry.nextInt();
                totgeral += matriz[i][j];
            }
        }

        //somar mtrz
        for(int i =0; i<4; i++){
            somalinha=0;
            for (int j =0; j<4; j++){

                somalinha += matriz[i][j];

            }
            System.out.println("Soma linha "+i+": "+somalinha );
        }

        System.out.println("+===================================+1");

        //somar mtrz com vetor
                for(int i =0; i<4; i++){
                    for (int j =0; j<4; j++){
                        somalinhaV[i] += matriz[i][j];
                    }
                    System.out.println(somalinhaV[i] );
                    System.out.println(somalinhaV[2]);
                }

                for(int i=0; i<4; i++){
                    for (int j =0; j<4; j++){
                        somacoluna[i]+= matriz[j][i];
                    }
                    System.out.println(somacoluna[i]);
                    System.out.println(totgeral);
                }

    }
}
