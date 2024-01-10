import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int matricula, c = 1, freq, reprovado = 0, aprovado = 0, reprovadoF = 0;
        double avrg = 0;
        double[] nota = new double[4];

        for (int i = 0; i < 3; i++) {
            avrg = 0;

            System.out.print("Digite o número da matricula: ");
            matricula = e.nextInt();

            System.out.println("Digite a nota dos bimestres");

            for (c = 0;c < 3; c++) {
                System.out.print(c+"º Bimestre: ");
                nota[c] = e.nextDouble();
            }

            System.out.println("Digite a frequência do aluno: ");
            freq = e.nextInt();

            for (c = 0;c <3; c++) {
                avrg += nota[c];
            }
            //COMEÇO DO OUTPUT
            //COMEÇO DO OUTPUT
            if (avrg < 6 && freq < 40){
                System.out.println("Aluno reprovado");
                reprovado++;
            }else if(freq < 40){
                System.out.println("Aluno reprovado");
                reprovadoF++;
            }else{
                System.out.println("Aluno Aprovado");
                aprovado++;
            }
            System.out.println("Número da matricula do aluno: "+matricula);
            System.out.println("Nota média: "+avrg/3);

        }
        System.out.println("Número de alunos aprovados: "+aprovado);
        System.out.println("Número de alunos reprovados: "+reprovado);
        System.out.println("Número de alunos reprovados por falta: "+reprovadoF);
    }
}