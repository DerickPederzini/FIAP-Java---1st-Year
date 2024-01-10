import java.util.Scanner;

public class ex2_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        while (opcao != 5){

            System.out.println("Digite 1 para adição");
            System.out.println("Digite 2 para subtração");
            System.out.println("Digite 3 para Multiplicar");
            System.out.println("Digite 4 para Dividir");
            System.out.println("Digite 5 para Sair");

            System.out.println("Escolha uma opção: ");
            opcao = in.nextInt();

            switch (opcao){
                case 1: adicao();
                    break;
                case 2: System.out.println(subtracao());
                    break;
                case 3: multiplicar();
                    break;
                case 4: divisao();
                    break;
                case 5: System.exit(0);
                    break;
                default: System.out.println("Opção Inválida- - digite novamente: ");

            }

        }

    }//fim main

    public static void adicao(){
        int n1=0, n2=0, resultado=0;

        System.out.println("------ADIÇÃO-------");
        System.out.println("Digite o primeiro número: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextInt();

        resultado = n1+n2;

        System.out.println(resultado);
    }//fim do adicao

    public static Integer subtracao(){
        int n1=0, n2=0, resultado=0;

        System.out.println("------SUBTRACAO-------");
        System.out.println("Digite o primeiro número: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextInt();

        resultado = n1-n2;

        return resultado;

    }//fim do subtracao

    public static void multiplicar(){
        int n1, n2, resultado;

        System.out.println("------MULTIPLICAÇÃO-------");
        System.out.println("Digite o primeiro número: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextInt();

        resultado = n1*n2;

        System.out.println(resultado);

    }//fim do multiplicacao

    public static void divisao(){
        int n1=0, n2=0, resultado=0;

        System.out.println("------DIVISÃO-------");
        System.out.println("Digite o primeiro número: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = in.nextInt();

        resultado = n1/n2;

        System.out.println(resultado);

    }//fim do divisao


}
