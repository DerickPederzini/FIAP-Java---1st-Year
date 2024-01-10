package derick.fiatEx;

import java.text.DecimalFormat;

public class fiatExercise {
    public static void main(String[] args) {



        String[] cars = new String[]{"Uno", "Palio", "Siena", "Bravo", "Strada", "Idea"};
        double[] prices = new double[]{25370, 26490, 30000, 56800, 36200, 43890};

        int[][] carSells = fillCarSells(cars);

        int [] sellsPerCar = fillSellsPerCar(carSells);

        double [] carSellsTotalValue = fillCarSellsTotalValue(carSells, prices);

        int [] carSellsTri = fillCarSellsTri(carSells);

        managementRelatory(cars,sellsPerCar, carSellsTotalValue, carSellsTri);

        carRanking(carSellsTotalValue, cars);

    }

    public static int[][] fillCarSells(String[] cars) {

        int[][] carSells = new int[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                carSells[i][j] = (int) (Math.random()*10);
            }
        }

        return carSells;
    }

    public static int [] fillSellsPerCar(int [][] carSells){

        int [] sellsPerCar = new int[6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                sellsPerCar[i]+=carSells[j][i];
            }
        }


        return sellsPerCar;
    }

    public static double [] fillCarSellsTotalValue(int [][] carSells, double [] prices){

        double [] sellsPerTri = new double[6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                sellsPerTri[i] += carSells[j][i] * prices[i];
            }
        }

        return sellsPerTri;
    }

    public static int [] fillCarSellsTri(int [] [] carSells){

        int [] sellsTri = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                sellsTri[i] += carSells[i][j];
            }
        }

        return sellsTri;
    }

    public static void managementRelatory(String[]cars, int [] sellsPerCar,
                                          double [] carSellsValueTri, int [] carSellsTri){

        double totalSells = 0;

        System.out.println("RELATÓRIO GERENCIAL FIAT");

        DecimalFormat df = new DecimalFormat("R$ #,###,###.00");

            for (int j = 0; j < 6; j++) {
                System.out.println("Carro:"+cars[j]+" \t Quantidade Geral:"+sellsPerCar[j]+" \t Total" +
                        ":"+df.format(carSellsValueTri[j]));

                totalSells += carSellsValueTri[j];

            }

        System.out.println("\nTotal Geral de Vendas 2014:"+df.format(totalSells));
        System.out.println("\nVendas Trimestrais");

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+"º Trimestre - Total de carros vendidos:"+carSellsTri[i]);
        }




    }

    public static void carRanking(double [] carsSellsTotalValue, String [] cars){

        int[]index = new int[6];

        System.out.println("\nRank de carros");

        for (int i = 0; i < 6; i++) {
            index[i] = i;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {

                if (carsSellsTotalValue[i] < carsSellsTotalValue[j]){
                    int pivo = index[i];
                    index[i] = index[j];
                    index[j] = pivo;

                    double pivoValor = carsSellsTotalValue[i];
                    carsSellsTotalValue[i] = carsSellsTotalValue[j];
                    carsSellsTotalValue[j] = pivoValor;
                }

            }
        }

        for (int i = 0; i < 6; i++) {

            int indexCars = index[i];

            System.out.println((i+1)+"º "+cars[indexCars]);
        }


        System.out.println();
    }
}
