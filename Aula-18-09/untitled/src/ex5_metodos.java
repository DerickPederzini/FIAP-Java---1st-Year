import java.util.Scanner;

public class ex5_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    double nota1 =0, nota2=0, media = 0;
    String nome;

        System.out.println("Digite o nome: ");
        nome = in.next();
        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = calculoMedia(nota1, nota2);
        System.out.println(media);

        //System.out.println(calculoMedia((nota1, nota2));

    }

    public static double calculoMedia(double nota1, double nota2){

        double media = (nota1+nota2)/2;

        return media;
    }


}
