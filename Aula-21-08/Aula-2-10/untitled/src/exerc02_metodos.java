import java.util.Scanner;

public class exerc02_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int truckCode = 0, truckTon = 0, stateCode = 0;

        System.out.println("Digite o código do caminhão");
        truckCode = in.nextInt();

        System.out.println("Digite a carga do caminhão em toneladas: ");
        truckTon = in.nextInt();

        double priceTruck = priceTruckCalculus(truckCode, truckTon);

        System.out.println("Digite o código de estado");
        stateCode = in.nextInt();

        while (stateCode < 1 ||  stateCode > 4 ){
            System.out.println("Digite um código válido: ");
            stateCode = in.nextInt();
        }

        double truckTaxes = priceTruckTaxes(priceTruck, stateCode);

        System.out.println("Valor total transportado pelo caminhão ["+(truckCode)+" ] : "+truckTaxes);

    }

    public static double priceTruckCalculus(int truckCode, int truckTon) {
        double priceTruck = 0;

        if (truckCode < 11) {
            priceTruck = 120 * (truckTon * 1000);
        } else if (truckCode < 21) {
            priceTruck = 200 * (truckTon * 1000);
        } else if (truckCode < 31) {
            priceTruck = 280 * (truckTon * 1000);
        }

        return priceTruck;
    }

    public static double priceTruckTaxes(double priceTruck, int stateCode) {

        double truckWithTaxes = 0;

        switch (stateCode) {
            case 1:
                truckWithTaxes = priceTruck + (priceTruck * 0.25);
                break;
            case 2:
                truckWithTaxes = priceTruck + (priceTruck * 0.20);
                break;
            case 3:
                truckWithTaxes = priceTruck + (priceTruck * 0.15);
                break;
            case 4:
                truckWithTaxes = priceTruck;
                break;
        }
        return truckWithTaxes;
    }


}
