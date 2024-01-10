import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc09 {

    static String[][] clientInfo = new String[5][2];//guarda nome e tipo de acomodação
    static int[][] roomInfo = new int[5][2];// guarda quarto e quantidade de diarias

    static Scanner input = new Scanner(System.in);

    static DecimalFormat dformat = new DecimalFormat("R$ ###,###.00");

    public static void main(String[] args) {

        String[] nameProduct = new String[]{"Refrigerante Lata", "Água sem gás", "Água com gás", "Suco de Laranja", "Barra de Chocolate"};
        double[] priceProduct = new double[]{2.80, 1.90, 2.10, 2.30, 4.90};
        String[] nameService = new String[]{"Lavanderia", "Sauna", "Almoço", "Café da Manhã", "Jantar"};
        double[] priceService = new double[]{10.50, 60.80, 42.90, 35.60, 60.40};


        for (int i = 0; i < nameProduct.length; i++) {

            System.out.println("Digite o nome do cliente " + (i + 1) + ":");
            clientInfo[i][0] = input.next();
            System.out.println("Tipo de acomodação S (Single) - D (Double) - SL (Suite Luxo) - SR" +
                    "Suite Presencial");
            System.out.println("Digite o tipo da hospedagem: ");
            clientInfo[i][1] = input.next();

            while (!clientInfo[i][1].equalsIgnoreCase("S") && !clientInfo[i][1].equalsIgnoreCase("D") &&
                    !clientInfo[i][1].equalsIgnoreCase("SL") && !clientInfo[i][1].equalsIgnoreCase("SR")) {

                System.out.println("Digite um tipo da hospedagem válido: ");
                clientInfo[i][1] = input.next();
            }

            //----------------------------------------------
            //TROCA DE MATRIZES, INICIO MATRIZES INT
            //----------------------------------------------


            System.out.println("Digite o número do quarto: ");
            roomInfo[i][0] = input.nextInt();

            while (roomInfo[i][0] < 0 || roomInfo[i][0] > 5) {
                System.out.println("Digite um número válido: ");
                roomInfo[i][0] = input.nextInt();
            }

            System.out.println("Digite a quantidade de diárias:  ");
            roomInfo[i][1] = input.nextInt();
            System.out.println("==============================");

        }


        //----------------------------------------------
        //CHAMADA FUNCOES

        int[][] quantityProducts = fillQuantityProducts();

        int[][] quantityServices = fillQuantityServices();

        generateGeneralRelatory(roomInfo, clientInfo, quantityServices, priceService, quantityProducts, priceProduct);

    }

    //----------------------------------------------------------
    public static int[][] fillQuantityProducts() {
        int[][] quantityProducts = new int[5][5];

        for (int i = 0; i < quantityProducts.length; i++) {
            for (int j = 0; j < quantityProducts.length; j++) {
                quantityProducts[i][j] = (int) (Math.random() * 5);
            }
        }

        return quantityProducts;
    }

    //----------------------------------------------------------
    public static int[][] fillQuantityServices() {
        int[][] quantityServices = new int[5][5];

        for (int i = 0; i < quantityServices.length; i++) {
            for (int j = 0; j < quantityServices.length; j++) {
                quantityServices[i][j] = (int) (Math.random() * 5);
            }
        }

        return quantityServices;
    }

    //----------------------------------------------------------
    public static double[] calculateAdobePrice(int[][] roomInfo, String[][] clientInfo) {
        double[] adobePrice = new double[5];

        for (int i = 0; i < roomInfo.length; i++) {
            if (clientInfo[i][1].equalsIgnoreCase("S")) {
                adobePrice[i] = 245;
            } else if (clientInfo[i][1].equalsIgnoreCase("D")) {
                adobePrice[i] = 280;
            } else if (clientInfo[i][1].equalsIgnoreCase("SL")) {
                adobePrice[i] = 310;
            } else {
                adobePrice[i] = 400;
            }
        }


        return adobePrice;
    }

    //---------------------------------------------------------
    public static void generateGeneralRelatory(int[][] roomInfo, String[][] clientInfo, int[][]
            quantityServices, double[] priceService, int[][] quantityProducts,
                                               double[] priceProducts) {
        double[] adobePrice = calculateAdobePrice(roomInfo, clientInfo);


        System.out.println("Relatório Gerencial Díárias Hotel Boa Viagem");
        for (int i = 0; i < roomInfo.length; i++) {
            System.out.println("-------------------------");
            System.out.println("Número do quarto: " + roomInfo[i][0]);
            System.out.println("Nome do cliente: " + clientInfo[i][0]);
            System.out.println("Tipo de acomodação: " + clientInfo[i][1]);
            System.out.println("Quantidade de diárias: " + roomInfo[i][1]);
            System.out.println("Valor total de diárias: " + (adobePrice[i]*roomInfo[i][1]));
        }


        System.out.println("----------------------------------------");
        System.out.println("Relatório Gerencial Hotel Boa Viagem");
        double [] priceServiceTot = new double[5];
        double [] priceProductsTot = new double[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                priceServiceTot[i] += (priceService[i]*quantityServices[i][j]);
                priceProductsTot[i] += (priceProducts[i]*quantityProducts[i][j]);
            }

        }

        for (int i = 0; i < 5; i++) {

            System.out.println("----------------------------------------" +
                    "-------------------------------------" +
                    "----------------------");
            System.out.println("QUARTO " + (roomInfo[i][0]) + " \t | \t CLIENTE " + (clientInfo[i][0]) + "\t | \t TOTAL DIÁRIAS " + dformat.format((adobePrice[i]*roomInfo[i][1])) + "\t | \t " +
                    "TOTAL SERVIÇO " +dformat.format(priceServiceTot[i]) + "\t | \t TOTAL PRODUTO " +dformat.format(priceProductsTot[i]) + " \t | \t TOTAL GERAL "
                    + dformat.format((priceProductsTot[i] + priceServiceTot[i] + (adobePrice[i]*roomInfo[i][1]))));

        }

    }

}
