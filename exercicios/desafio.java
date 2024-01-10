public class desafio {
    public static void main(String[] args) {

        String products []= new String[]{"NoteBook", "Computadores", "Tablet", "Servidores"};
        int productsMatrix [] [] = new int[7][4];
        int biggestProduct = 0, biggestProductIndex = 0, lowestProduct = 0, lowestProductIndex= 0;

        for (int i=0; i<4;i++){
            for (int j =0; j<4; j++){

                productsMatrix[i][j] = (int) (Math.random()*5);

                productsMatrix[6][j] = (int) (Math.random()*10);

                productsMatrix[4][j] += productsMatrix[i][j];
                productsMatrix[5][i] += productsMatrix[i][j];

                System.out.print(productsMatrix[i][j]+"\t");

            }
            System.out.println("");

        }

        for (int i =0; i<4; i++){
            System.out.println("Total de produtos vendidos por linha "+(i+1)+": "+productsMatrix[5][i]);
            System.out.println("Total de produtos vendidos por trimestre "+(i+1)+": "+productsMatrix[4][i]);
            System.out.println("================================================");

            lowestProduct = productsMatrix[4][i];
        }


            for (int j =0; j<4; j++){

                if (biggestProduct < productsMatrix[4][j]){

                    biggestProductIndex = j;
                    biggestProduct = productsMatrix[4][j];
                }
                if (lowestProduct > productsMatrix[4][j]){

                    lowestProductIndex = j;
                    lowestProduct = productsMatrix[4][j];
                }
            }

        System.out.println("Melhor linha de produto: "+products[biggestProductIndex]);
        System.out.println("Pior linha de produto: "+products[lowestProductIndex]);

        for (int j = 0; j<4;j++){

            if (productsMatrix[4][j] > productsMatrix[6][j]){
                int i = j;

                System.out.println("O produto "+products[i]+" Atingiu sua meta de "+productsMatrix[4][j]+" No trimestre");
            }
        }


    }
}
