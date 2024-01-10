import java.util.Scanner;

public class ex3_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int tempoEmpresa = 0;
        String nome;
        double salario=0;

        System.out.println("Digite o nome: ");
        nome = in.next();
        System.out.println("Digite o tempo empresa: ");
        tempoEmpresa = in.nextInt();
        System.out.println("Digite o salário: ");
        salario = in.nextDouble();

        //chamada de procedimento com parametro

        analise(tempoEmpresa,salario);//parametros reais

    }

    public static void analise(int tempoEmpresa, double salario){//parametro formal

        if (salario < 5000 && tempoEmpresa > 10){
            System.out.println("Tem direito ao aumento");
        }else {
            System.out.println("Não tem direito ao aumento");
        }

    }


}
