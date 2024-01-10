package checkpoint;


import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;


public class check_3_A {

	static double total = 0;
	static String[] nomeRegioes = new String[]{"SP", "MG", "RJ", "ES"};
	static String[] nomeRevistas = new String[]{"Veja", "Quatro Rodas", "Você S/A"};
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat decimal = new DecimalFormat("#,##0.00");

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] nomeRevistas = new String[]{"Veja", "Quatro Rodas", "Você S/A"};
        String[] nomeRegioes = new String[]{"SP", "MG", "RJ", "ES"};

        relatorioGerencial();
    }

	public static void relatorioGerencial() {

        //CHAMADA VENDAS REVISTAS
        int[][] vendas = vendaRevistas();


        //CHAMADA PERCENTUAL REVISTAS
        double percentual[] = percentualRevistas(vendas);

        //EXIBIÇÃO
        for (int i = 0; i < 3; i++) {
            System.out.println(decimal.format(percentual[i]) + " % \t");

        }

		String [] maiorCiculacao = maiorCiruclacao(vendas);
		for (int i = 0; i < 4; i++) {
			System.out.println(nomeRegioes[i]+":"+maiorCiculacao[i]);
		}


    }

    public static int[][] vendaRevistas() {
        int[][] vendas = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                vendas[i][j] = sc.nextInt();
				total += vendas[j][i];
            }
        }

        return vendas;
    }

	public static double[] percentualRevistas(int[][] vendas) {
        double[] percentual = new double[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                percentual[i] += vendas[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            percentual[i] = (percentual[i] / total * 100);
        }

        return percentual;
    }

	public static String [] maiorCiruclacao(int[][] vendas){
		String [] circulacao = new String[4];
		int pivo = 0;

		for (int i = 0; i < 4; i++) {
			pivo = 0;
			for (int j = 0; j < 3; j++) {

				if (vendas[i][j] > pivo ){
					pivo = vendas[i][j];
					circulacao[i] = nomeRevistas[j];
				}

			}
		}

		return circulacao;
	}


}
