import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String shops [] = new String[]{"LojaA","LojaB","LojaC","LojaD","LojaE","LojaF"};
        String products [] = new String[]{"A","B","C","D","E","F","G","H","I","J","K","M"};
        double pricesMatrix [][] = new double[12][5];
        double biggestValue = 0, lowestValue = 0;
        int biggestShop =0, lowestShop = 0, biggestProduct = 0, lowestProduct = 0;

        for (int i =0; i<12; i++){

            System.out.println("-------- Produto: "+products[i]+" ---------");

            for (int j =0;j<5;j++){

                System.out.println("Informe o preço na "+shops[j]);
                pricesMatrix[i][j]=entry.nextDouble();

                lowestValue = pricesMatrix[i][j];

                if (biggestValue<pricesMatrix[i][j]){
                    biggestValue = pricesMatrix[i][j];
                    biggestProduct = j;
                    biggestShop = i;

                } else if (lowestValue>pricesMatrix[i][j]) {
                    lowestValue = pricesMatrix[i][j];
                    lowestProduct = j;
                    lowestShop = i;
                }
            }
        }



        System.out.println("Produto mais caro: "+products[biggestProduct]);
        System.out.println("Loja: "+shops[biggestShop]);
        System.out.println("Preço: "+biggestValue);
        System.out.println("Produto mais barato: "+products[lowestProduct]);
        System.out.println("Loja: "+shops[lowestShop]);
        System.out.println("Preço: "+lowestValue);

    }
}
