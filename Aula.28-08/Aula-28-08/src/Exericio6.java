import java.text.DecimalFormat;

public class Exericio6 {
    public static void main(String[] args) {

        DecimalFormat dolar = new DecimalFormat("R$###0.00");

        String[] products = new String[]{"Tororo", "Xuxa", "Ástron", "Zênite", "Roger"};
        double[][] prices = new double[5][4];
        double[][] pricesTaxes = new double[5][4];
        double[][] taxes = new double[5][4];
        double[] transport = new double[]{45.3, 56.3, 83.3, 46.9, 31.1};
        double finalprice = 0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                prices[i][j] = (Math.random() * 90);

                if (prices[i][j] <= 50) {
                    //jeito dois
                    taxes[i][j]= prices[i][j]*0.05;
                } else if (prices[i][j] <= 100) {
                    //jeito dois
                    taxes[i][j]= prices[i][j]*0.10;
                } else {
                    //jeito dois
                    taxes[i][j]= prices[i][j]*0.20;
                }
            }
        }

        //Jeito 1 de fazer e jeito 2 de fazer.
        for (int i = 0; i < 5; i++) {
            //ambos possuem isso
            System.out.println("Nome do produto " + products[i] + " - Custo do transporte: "+ dolar.format(transport[i]));
            System.out.println("=============================================");
            for (int j = 0; j < 4; j++) {
                System.out.println("------Loja " + (j + 1) + "------");

                //==================================================================

                //Jeito 2 de fazer

                finalprice = taxes[i][j]+prices[i][j]+transport[i];

                System.out.println("Jeito 2");
                if (prices[i][j] <= 50) {
                    System.out.println("Imposto: " + dolar.format(taxes[i][j]));
                } else if (prices[i][j] <= 100) {
                    System.out.println("Imposto: " + dolar.format(taxes[i][j]));
                } else {
                    System.out.println("Imposto: " + dolar.format(taxes[i][j]));
                }

                //==========================================================
                //AMBOS POSSUEM
                System.out.println("Preço: " + dolar.format(prices[i][j]));

                //==========================================================


                System.out.println("Preço Final: "+dolar.format(finalprice));

                System.out.println("===================================");

            }

        }








    }

}
