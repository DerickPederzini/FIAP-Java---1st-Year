import java.util.Scanner;

public class Vetores5 {
    public static void main(String[] args) {

    Scanner entry = new Scanner(System.in);

    char answers [] = new char[8];
    int nStudent [] = new int[10];
    char aStudent [] = new char[8];
    int i, cont = 0;
    double nota=0, porcAprov = 0, aprov = 0;

        System.out.println("--------GABARITO-----------");

        for (i = 0; i<8; i++){
            System.out.println("Digite a resposta da "+(i+1)+"º questão: ");
            answers[i] = entry.next().toUpperCase().charAt(0);
        }
        do{
            nota = 0;

            System.out.println("-----------ALUNO"+(cont+1)+"------------");

            System.out.println("Digite o número do "+(cont+1)+"º Aluno");
            nStudent[cont] = entry.nextInt();

            System.out.println("---------------------------------------");

            for(i = 0; i< 8; i++){
                System.out.println("Digite a resposta dada pelo Aluno "+nStudent[cont]+" à "+(i+1)+" Questão");
                aStudent[i] = entry.next().toUpperCase().charAt(0);
            }

            for (i=0;i<8;i++){
                if (aStudent[i] == (answers[i])){
                    nota++;
                }
            }
            System.out.println("A nota do aluno foi "+nota);

            if (nota >= 6){
                aprov++;
            }

            cont++;
        }while(cont < 10);

        System.out.println("Total de aprovados: "+aprov);
        porcAprov = ((aprov*100)/10);

        System.out.println("Percentual de aprovados"+porcAprov);

    }
}
