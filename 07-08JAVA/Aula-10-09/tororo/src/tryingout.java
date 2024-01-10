import java.util.Scanner;

public class tryingout {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o número de equipes: ");
        int numeroEquipes = input.nextInt();

        int numeroRobo, pontos;
        double nota;

        for (int i = 0; i < numeroEquipes ; i++) {

            numeroRobo = input.nextInt();
            nota = input.nextDouble();

            Equipes robo = new Equipes(numeroRobo, nota);
        }



    }
}

class Equipes{
    int numero;
    double notaDesign;
    int pontos;



    Equipes(int numeroRobo, double notaDesign){
        this.numero = numeroRobo;
        this.notaDesign = notaDesign;
    }

}