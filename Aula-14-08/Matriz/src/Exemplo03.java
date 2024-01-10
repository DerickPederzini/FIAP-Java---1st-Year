import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        double matriz[][] = new double[3][4];
        double mediaNota [] = new double[3];


        for(int aluno = 0; aluno <3; aluno++){
            for (int notas = 0; notas<3;notas++){
                System.out.println("Aluno "+(aluno+1));
                System.out.println("Informe a nota da "+(aluno+1)+"º Prova: ");
                matriz[aluno][notas]= entry.nextInt();
                matriz[aluno][3]+=matriz[aluno][notas];
            }
            matriz[aluno][3] += matriz[aluno][3]/3;
        }

        for (int aluno = 0; aluno<3; aluno++){
            for (int notas =0; notas<3; notas++){
                System.out.println(matriz[aluno][notas]);


                System.out.println((matriz[aluno][3])+"\t");
            }
        }
        System.out.println("");



    }
}
