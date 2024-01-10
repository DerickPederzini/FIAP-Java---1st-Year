package checkpoint;

import java.util.Scanner;

public class LastCheckpoint {

    static String [] brazilianStates = new String[]{"SP","MG","RJ"};
    static String [] magazines = new String[]{"Super", "Quatro Rodas", "VC S/A"};
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //PREENCHE OS PREÇOS
        double [] priceMagazines = fillPriceMagazines(magazines);

        relatorioGerencial(priceMagazines);

    }

    public static void relatorioGerencial(double [] priceMagazines){

        //PREENCHE A QUANTIA DE VENDAS
        int [] [] quantitySales = fillQuantitySales();
        double [] totalValueOfSales = fillTotalValueOfSales(quantitySales, priceMagazines);

        showSalesPerState(totalValueOfSales);

        rankingOfSalesPerState(quantitySales);

    }
    //=========================================================================
    public static double [] fillPriceMagazines(String [] magazines){

        double[] priceMagazines = new double[3];

        for (int i = 0; i < magazines.length; i++) {
            System.out.print("Digite os preço da revista "+(magazines[i])+":");
            priceMagazines[i] = input.nextDouble();
        }
        return priceMagazines;
    }
    //=========================================================================
    public static int [] [] fillQuantitySales(){
        int [] [] quantitySales = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("=================================================");
            System.out.println("Quantidade de Vendas da revista "+(magazines[i]));
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe a quantidade de vendas no estado de "+(brazilianStates[j])+": ");
                quantitySales[i][j] = input.nextInt();
            }
        }

        return quantitySales;
    }
    //=========================================================================
    public static double [] fillTotalValueOfSales(int [] [] quantitySales, double [] priceMagazines){
        double [] valueOfSales = new double[3];

        for (int i = 0; i < priceMagazines.length; i++) {
            for (int j = 0; j < priceMagazines.length; j++) {
                valueOfSales[i] += priceMagazines[i]*quantitySales[j][i];
            }
        }

        return valueOfSales;
    }
    //=========================================================================
    public static void showSalesPerState(double [] totalValueOfSales){

        System.out.println("Vendas por estado");
        for (int i = 0; i < magazines.length; i++) {
            System.out.println(brazilianStates[i]+"\t R$"+totalValueOfSales[i]);
        }

    }
    //=========================================================================
    public static void rankingOfSalesPerState(int [] [] quantitySales){

        int [] indexOfRanking = fillIndexOfRanking(quantitySales);

        System.out.println("Por estado a revista de menor circulação");
        for (int i = 0; i < indexOfRanking.length; i++) {

            int j = indexOfRanking[i];

            System.out.println(brazilianStates[i]+"\t"+magazines[j]);
        }

    }
    //=========================================================================
    public static int[] fillIndexOfRanking(int [] [] quantitySales){

        int [] indexOfRanking = new int[3];


        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {

                if (quantitySales[i][j]>quantitySales[j][i]){

                    int pivo = quantitySales[i][j];
                    quantitySales[i][j] = quantitySales[j][i];
                    quantitySales[j][i] = pivo;

                    int indexPivo = i;
                    i = j;
                    j= indexPivo;

                    indexOfRanking[j] = i;

                }

            }
        }

        return indexOfRanking;
    }
    //=====================================================

}
