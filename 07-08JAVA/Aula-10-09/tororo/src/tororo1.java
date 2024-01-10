import java.util.Scanner;

public class tororo1 {
    static Scanner e = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdEquipes = 0;

        System.out.println("Informe a quantidade de equipes: ");
        qtdEquipes = e.nextInt();

        while (qtdEquipes < 3) {
            System.out.println("Informe uma quantidade de no mínimo 3 equipes: ");
            qtdEquipes = e.nextInt();
        }

        //CHAMADA DO CARREGAMENTO DOS NOMES
        int[] numEquipes = carregaNomes(qtdEquipes);

        //CHAMADA DA NOTA DE DESIGN
        double[] notaEquipes = carregaNotas(qtdEquipes, numEquipes);

        //CHAMADA FUNÇÃO DOS PONTOS
        int[] pontos = carregaPontos(qtdEquipes, numEquipes, notaEquipes);

        // CHAMADA DO RANKING (MÉTODO)
        ranking(qtdEquipes, numEquipes, notaEquipes, pontos);

    }

    public static int[] carregaNomes(int qtdEquipes) {

        int[] nomes = new int[qtdEquipes];

        for (int i = 0; i < qtdEquipes; i++) {

            System.out.println("Digite o número da equipe da equipe [" + (i + 1) + "]: ");
            nomes[i] = e.nextInt();

            for (int j = 0; j < qtdEquipes; j++) {

                while (nomes[i] == nomes[j] && i != j) {

                    System.out.println("Digite um outro número para a equipe");
                    nomes[i] = e.nextInt();
                }
            }
        }

        return nomes;
    }

    public static double[] carregaNotas(int qtdEquipes, int[] numEquipes) {

        double[] notas = new double[qtdEquipes];

        for (int i = 0; i < qtdEquipes; i++) {

            System.out.println("Digite a nota da equipe da equipe [" + numEquipes[i] + "]: ");
            notas[i] = e.nextDouble();

            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Digite uma nota válida, de 0 até 10: ");
                notas[i] = e.nextDouble();
            }
        }

        return notas;
    }

    public static int[] carregaPontos(int qtdEquipes, int[] numEquipes, double[] notaEquipes) {

        int [] pontos = new int[qtdEquipes];
        int equipeAPontos = 0, equipeBPontos = 0, imparOuPar = 0;

        System.out.println("Vitória:1 ponto Derrota:0 pontos");

        for (int i = 0; i < qtdEquipes - 1; i++) {
            System.out.println("------ LUTAS DA EQUIPE " + (i + 1) + " ------");
            for (int j = (i + 1); j < qtdEquipes; j++) {

                if (i != j) {

                    System.out.println("Equipe [" + numEquipes[i] + "] X Equipe [" + numEquipes[j] + "]");

                    equipeAPontos = (int) (Math.random() * 10);
                    equipeBPontos = (int) (Math.random() * 10);

                    System.out.println("Equipe [" + numEquipes[i] + "] marcou: " + equipeAPontos + " pontos!");
                    System.out.println("Equipe [" + numEquipes[j] + "] marcou: " + equipeBPontos + " pontos!");

                    if (equipeAPontos > equipeBPontos) {
                        System.out.println("A equipe vencedora dessa batalha é [" + numEquipes[i] + "]!");
                        pontos[i] += 1;
                    } else if (equipeBPontos > equipeAPontos) {
                        System.out.println("A equipe vencedora dessa batalha é [" + numEquipes[j] + "]!");
                        pontos[j] += 1;
                    } else if (notaEquipes[i] > notaEquipes[j]) {
                        System.out.println("A equipe vencedora dessa batalha, por desempate de pontos, é ["
                                + numEquipes[i] + "]!");
                        pontos[i] += 1;
                    } else if (notaEquipes[i] < notaEquipes[j]) {
                        System.out.println("A equipe vencedora dessa batalha, por desempate de notas, é ["
                                + numEquipes[j] + "]!");
                        pontos[j] += 1;
                    } else {
                        imparOuPar=(int) (Math.random()*10);
                        if (imparOuPar % 2 == 1) {
                            System.out.println("A equipe vencedora dessa batalha, por desempate de ímpar ou par, é ["
                                    + numEquipes[i] + "]!");
                            pontos[i] += 1;
                        } else {
                            System.out.println("A equipe vencedora dessa batalha, por desempate de ímpar ou par, é ["
                                    + numEquipes[j] + "]!");
                            pontos[j] += 1;
                        }
                    }

                }
            }
        }
        return pontos;
    }

    public static void ranking(int qtdEquipes, int [] numEquipes, double [] notaEquipes, int [] pontos){

    }

}
