import java.util.Scanner;

public class ex7_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String [] nomeAlunos = carregaNome();

        listaAlunos(nomeAlunos);

    }

    public static String[] carregaNome(){

        System.out.println("Função - Carrega Nomes");

        String [] nomeAlunos = new String[4];

        for (int i =0; i <4 ; i++) {
            System.out.println("Digite "+(i+1)+" nome: ");
            nomeAlunos[i] = in.next();
        }

            return nomeAlunos;


    }

    public static void listaAlunos(String [] nomeAlunos){

        System.out.println("Procedimento - Lista de alunos");
        for (int i =0; i <4; i++){
            System.out.println("Nome do aluno "+(i+1)+": "+nomeAlunos[i]);
        }

    }


}
