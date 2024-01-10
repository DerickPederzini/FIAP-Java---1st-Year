import java.util.Scanner;

public class exerc04_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] employeeIdent = employeeIdent();

        relatory(employeeIdent);

        int[] controlCalling = criteria(employeeIdent);

        System.out.println("===========RELATORIO DE CHAMADAS POR CRITERIO ------------------");
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                System.out.println("Número de chamadas - Sistema parado: " + controlCalling[i]);
            } else if (i == 1) {
                System.out.println("Número de chamadas - Grave: " + controlCalling[i]);
            } else if (i == 2) {
                System.out.println("Número de chamadas - Não grave: " + controlCalling[i]);
            } else {
                System.out.println("Número de chamadas - Dúvida: " + controlCalling[i]);
            }
        }

    }

    public static int[][] employeeIdent() {

        int[][] employeeIdent = new int[3][3];
        for (int line = 0; line < 3; line++) {

            System.out.println("Digite a identificação do funcionário: ");
            employeeIdent[line][0] = in.nextInt();

            System.out.println("Digite o código de erro: ");
            employeeIdent[line][1] = in.nextInt();

            while (employeeIdent[line][1] < 1 || employeeIdent[line][1] > 3) {
                System.out.println("Digite um código de erro válido: ");
                employeeIdent[line][1] = in.nextInt();
            }

            System.out.println("Digite o critério do chamado: ");
            employeeIdent[line][2] = in.nextInt();

        }
        return employeeIdent;
    }

    public static void relatory(int[][] employeeIdent) {
        System.out.println("-----------RELATORIO DE CHAMADOS POR ERRO -----------------");

        int[] control = new int[3];

        for (int i = 0; i < 3; i++) {

            if (employeeIdent[i][0] == 1) {
                control[0]++;
            } else if (employeeIdent[i][1] == 2) {
                control[1]++;
            } else if (employeeIdent[i][2] == 3) {
                control[2]++;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Números de chamados com o código do erro " + (i + 1) + " :" + control[i]);
        }

    }

    public static int[] criteria(int[][] employeeIdent) {

        int[] control = new int[4];

        for (int i = 0; i < 3; i++) {
            if (employeeIdent[i][0] == 1) {
                control[0]++;
            } else if (employeeIdent[i][1] == 2) {
                control[1]++;
            } else if (employeeIdent[i][2] == 3) {
                control[2]++;
            } else {
                control[3]++;
            }
        }
        return control;
    }
}
