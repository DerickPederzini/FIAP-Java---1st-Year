import java.util.Scanner;

public class ex4_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0, n1=0, n2=0;

        while (opcao != 5){

            System.out.println("Digite 1 para adição");
            System.out.println("Digite 2 para subtração");
            System.out.println("Digite 3 para Multiplicar");
            System.out.println("Digite 4 para Dividir");
            System.out.println("Digite 5 para Sair");

            System.out.println("Escolha uma opção: ");
            opcao = in.nextInt();

            if (opcao > 0 && opcao < 5) {
                System.out.println("Digite o primeiro número: ");
                n1 = in.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = in.nextInt();
            }

            switch (opcao){
                case 1: adicao(n1,n2);//passando parametros reais
                    break;
                case 2: System.out.println(subtracao(n1,n2));//passando parametros reais
                    break;
                case 3: multiplicar(n1,n2);//passando parametros reais
                    break;
                case 4: divisao(n1,n2);//passando parametros reais
                    break;
                case 5: System.exit(0);//passando parametros reais
                    break;
                default: System.out.println("Opção Inválida- - digite novamente: ");

            }

        }

    }//fim main

    public static void adicao(int n1,int n2){//paramentros formais

        int resultado = 0;

        System.out.println("------ADIÇÃO-------");

        resultado = n1+n2;

        System.out.println(resultado);
    }//fim do adicao

    public static Integer subtracao(int n1,int n2){//paramentros formais

        int resultado = 0;

        System.out.println("------SUB-------");

        resultado = n1-n2;

        return resultado;

    }//fim do subtracao

    public static void multiplicar(int n1,int n2){//paramentros formais

        int resultado = 0;

        System.out.println("------MULT-------");

        resultado = n1*n2;

        System.out.println(resultado);

    }//fim do multiplicacao

    public static void divisao(int n1,int n2){//paramentros formais
        int resultado = 0;

        System.out.println("------DIV-------");

        resultado = n1/n2;

        System.out.println(resultado);

    }//fim do divisao
}
