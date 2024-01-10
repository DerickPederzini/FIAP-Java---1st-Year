import java.util.Locale;
import java.util.Scanner;

public class exerc01 {
    static Scanner in = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {
        double calculoMedia = 0;

        System.out.println("Digite seu nome: ");
        nome = in.next();

        calculoMedia = calculoEstadia();

        payment(calculoMedia);

    }

    public static double calculoEstadia(){
        int acomodacao = 0, dias= 0, valordiaria =0 ;
        double calculoEstadia = 0;

        System.out.println("1 = R$380\n 2 = R$450 \n 3 = R$560");
        System.out.println("Olá "+nome+" Digite sua acomodação: ");
        acomodacao = in.nextInt();
        System.out.println("Digite o tempo que irá ficar na acomodação");
        dias = in.nextInt();

        switch (acomodacao) {
            case 1: valordiaria = 380;
            break;
            case 2: valordiaria = 450;
            break;
            case 3: valordiaria = 560;
            break;
            default: System.out.println("Opção Inválida, digite de novo");
            System.exit(0);
            break;
        }

        calculoEstadia = valordiaria*dias;

        return calculoEstadia;
    }

    public static void payment(double calculoMedia){
        char typePay ;

        System.out.println("Digite o tipo de pagamento preferido ");
        typePay = in.next().toUpperCase().charAt(0);

        while (typePay!= 'V' && typePay != 'P'){
            System.out.println("Digite novamente: ");
            typePay = in.next().toUpperCase().charAt(0);
        }

        if (typePay == 'V'){
            System.out.println("Parabéns "+nome);
            System.out.println("Valor final do pagamento: "+(calculoMedia-(calculoMedia*0.1)));
        }

    }

}
