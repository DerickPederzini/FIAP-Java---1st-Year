import java.util.Scanner;

public class ex8_metodos {
    static Scanner in = new Scanner(System.in);
    static String [] linhaProdutos = new String[] {"Computador", "Notebook", "Tablet"};

    public static void main(String[] args) {
        //vetor local
        String [] meses = new String[]{"Jan", "Fev", "Mar"};

        int [][] produtos = carregaMatrix(meses);

        int [] sumProducts = somaLinhaProduto(produtos);

        int [] sumMonth = somaColProduto(produtos);

        relatorio(sumProducts, sumMonth, meses);

     }

    public static int [][] carregaMatrix(String [] meses){

        int[][]produtos = new int[3][3];

        for (int line  =0; line < 3; line++){
            System.out.println(linhaProdutos[line]);
            for (int col = 0; col <3 ; col++){
                System.out.println("Quantidade Mês de "+meses[col]+" : ");
                produtos[line][col] = in.nextInt();
            }
        }

        return produtos;
    }

    public static int [] somaLinhaProduto(int [][]produtos){

        int [] sumProdutos = new int[3];

                for (int line =0; line <3 ; line++){
                    for (int col = 0; col < 3; col++){
                        sumProdutos[line] += produtos[line][col];
                    }
                }

        return sumProdutos;

    }

    public static int [] somaColProduto(int [][]produtos){

        int [] sumMonth = new int[3];

        for (int line = 0; line < 3; line++) {
            for (int col = 0; col < 3; col++){
                sumMonth[line] += produtos[col][line];
            }
        }

        return sumMonth;
    }

    public static void relatorio(int [] sumProdutcs, int [] sumMonth, String [] meses){

        System.out.println("Soma dos produtos no Trimestre: ");
        for (int i = 0; i <3; i ++){
            System.out.println("Linha dos produtos "+(linhaProdutos[i])+" - "+sumProdutcs[i]);
            System.out.println("Mês de "+(meses[i])+": "+(sumMonth[i]));
        }

    }
}
