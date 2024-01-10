import java.util.Scanner;

public class exerc08 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String[] products = new String[]{"Notebook", "Computadores", "Tablets", "Servidores"};
        int[] salesGoal = new int[]{100, 150, 200, 250};

        //Chamada productSell
        int[][] amountSell = productSell(products);

        int[] salesProduct = fillSalesProduct(amountSell);

        int[] salesTrimestre = fillSalesTrimestre(amountSell);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(amountSell[i][j] + "\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Vendas das linha de " + products[i] + ": " + salesProduct[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Vendas no trimestre " + (i + 1) + ": " + salesTrimestre[i]);
        }

        boolean [] goalReached = reachGoal(salesProduct, salesGoal);

        for (int i = 0; i < goalReached.length; i++) {
            System.out.println("A linha de produtos "+(products[i])+": "+goalReached[i]);
        }
    }

    public static int[][] productSell(String[] products) {

        int[][] productsSell = new int[4][3];//3 == trimestre

        for (int i = 0; i < productsSell.length; i++) {
            for (int j = 0; j < 3; j++) {
                productsSell[i][j] = (int) (Math.random() * 120);
            }
        }

        return productsSell;
    }

    public static int[] fillSalesProduct(int[][] amountSell) {

        int[] salesProduct = new int[4];

        for (int j = 0; j < salesProduct.length; j++) {
            for (int i = 0; i < 3; i++) {
                salesProduct[j] += amountSell[j][i];
            }
        }
        return salesProduct;

    }

    public static int[] fillSalesTrimestre(int[][] amountSell) {
        int[] salesTrimestre = new int[3];

        for (int j = 0; j < salesTrimestre.length; j++) {
            for (int i = 0; i < 4; i++) {
                salesTrimestre[j] += amountSell[i][j];
            }
        }
        return salesTrimestre;
    }

    public static boolean[] reachGoal(int[] salesProducts, int[] salesGoal) {

        boolean[] goalReached = new boolean[4];

        for (int i = 0; i < goalReached.length; i++) {

            if (salesProducts[i] >= salesGoal[i]) {
                goalReached[i] = true;
                continue;
            }
            goalReached[i] = false;
        }

        return goalReached;
    }

}
