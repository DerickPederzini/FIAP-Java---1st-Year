import java.util.Scanner;

public class ex1_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        verificar();

        System.out.println(inte());

    }//fecha main

    //procedimento - VOID NAO TEM RETORNO
    public static void verificar(){

        int num = 0;

        System.out.println("Digite um número: ");
        num = in.nextInt();

        if (num % 2 == 0 ){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

    }
    public static Integer inte(){

        int j = 0;

        j = j+5;

        return j ;

    }
}
