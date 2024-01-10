import java.util.Scanner;

public class ex6_metodos {
    static Scanner in = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {

        double media = 0;

        System.out.println("Matricula");
        System.out.println("Digite o nome: ");
        nome=in.next();



        //chamada função

        media = notas();

        analise(media);

    }//main

    //analisa media

    public static void analise(double media){

        System.out.println("Procedimento Análise");
        System.out.println("Media: "+media);
        if (media >= 6){
            System.out.println(nome+" - Aprovado");
        }else if(media>=4){
            System.out.println(nome+" - Exame");
        }else {
            System.out.println(nome+" - DP");
        }

    }




    //criação da função
    //FUNCAO RETORNA UM DOUBLE A MEDIA DO ALUNO
    public static double notas(){
        double nota1 =0, nota2=0, media = 0;
        String nome;

        System.out.println("Função Notas");
        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1+nota2)/2;

        return media;
        }
    }

