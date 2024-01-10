import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int sem1[][] = new int[5][3];
        int sem2[][] = new int[5][3];
        int anual[][] = new int[5][3];
        int qtdM[] = new int[5];
        int totM[] = new int[3];
        int qtdMuni[] = new int[3];
        int biggestM = 0;

        //carregando semestres
        for (int i =0; i<5; i++){
            System.out.println("curso: "+(i+1));
            for (int j =0; j<3; j++){
                System.out.println("Digite a quantidade de matrículas na unidade: "+(j+1));
                sem1[i][j] =(int) (Math.random()*10);
            }
        }
        for (int i=0; i<5;i++){
            System.out.println("curso: "+(i+1));
            for (int j = 0; j<3;j++){
                System.out.println("Digite a quantidade de matrículas na unidade "+(j+1)+":");
                sem2[i][j] = (int) (Math.random()*10);
            }
        }
        //fim do semestres
        System.out.println("=============================================");
        //carregando anual
        for (int i =0; i<5; i++){
            System.out.println("Curso "+(i+1));
            for (int j =0; j<3;j++){

                qtdMuni[j] = 0;
                anual[i][j]+=sem1[i][j]+sem2[i][j];
                qtdM[i]+= anual[i][j];
                totM[j] += anual[i][j];
                qtdMuni[j] += anual[i][j];

                if (qtdM[i] > biggestM){
                    biggestM = qtdM[i];
                }

                System.out.println("Quantidade de matrículas na unidade "+(j+1)+" :"+qtdMuni[j]);

            }
        }
        //fim do anual

        System.out.println("=============================================");

        for (int c = 0; c<3; c++){
            System.out.println("Total de matrículas por unidade do ano, Unidade "+(c+1)+" : "+totM[c]);
        }

        System.out.println("=============================================");

        for (int e = 0; e<5;e++){
            System.out.println("Quantidade de matriculas no "+(e+1)+"º curso do ano: "+qtdM[e]);
        }
        System.out.println("=============================================");

        System.out.println("Maior número de matrícula: "+biggestM);

    }
}