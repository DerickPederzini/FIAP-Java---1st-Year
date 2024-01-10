import java.text.DecimalFormat;

public class exercicio3 {
    public static void main(String[] args) {

        DecimalFormat dform = new DecimalFormat("R$##0.00");

        String []stores = new String[]{"A","B","C","D","E","F","G","H"};
        String [] product  = new String[]{"W","X","Z","Y"};
        double [][] prices = new double[4][8];

        for (int i =0; i<4;i++){
            System.out.println("---------------------------");
            System.out.println("O PRODUTO ATUAL É: "+product[i]);

            for (int j = 0; j<8;j++){
                System.out.println("Informe o preço do produto "+product[i]+" na Loja: "+stores[j]);
                prices[i][j]=(double)(Math.random()*190);
            }

        }//fim do carregamento matrix

        for (int i =0; i<4;i++){
            System.out.println("----------------");
            System.out.println("----PRODUTO: "+product[i]);

            for (int j = 0; j<8;j++){

                if (prices[i][j] <= 120){
                    System.out.println("---- Loja "+stores[j]+" Preço: "+dform.format(prices[i][j]));

                }

            }
        }




    }
}
