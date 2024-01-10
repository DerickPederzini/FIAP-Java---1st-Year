import java.io.ObjectInputStream;

public class exericio_lista_3 {
    public static void main(String[] args) {

        int [][] matrix = new int[5][3];
        int [] amountarmz = new int[4];
        int [] biggestArmz2 = new int [4];
        int [] custotproduct = new int[3];
        int [] custotarmz= new int[4];
        int comparator = Integer.MAX_VALUE, comparatorarmz2= 0 ,lowestarmz = 0, biggestarmz2 = 0;

        for ( int armz = 0; armz <4; armz++){
            for (int product = 0; product <3; product++){

               matrix[armz][product]= (int) (Math.random()*10);

               matrix[4][product] = (int) (Math.random()*20);

                amountarmz[armz] += matrix[armz][product];

                System.out.println((matrix[armz][product])+"\t");

                biggestArmz2[armz] += matrix[armz][1];

                custotproduct[product] += matrix[armz][product];

                if (comparatorarmz2 < biggestArmz2[armz]){
                    biggestarmz2 = armz;
                    comparatorarmz2 = biggestArmz2[armz];
                }


            }
            System.out.println(" ");

            if (comparator > amountarmz[armz]){
                lowestarmz = armz;
                comparator = amountarmz[armz];
            }

        }

        System.out.println("O armazem com maior quantidade do estoque dois foi o :"+biggestarmz2);
        System.out.println("O ármazem com menor estoque foi o ( "+lowestarmz+" ) com total de : "+amountarmz[lowestarmz]);

        for (int i =0; i <3; i++){
            System.out.println((custotproduct[i]*matrix[4][i]));
        }
        System.out.println("+=========================================");


        for (int i = 0; i<4;i++){
            for (int j =0; j<3; j++){
                custotarmz[i] += (matrix[4][j]*matrix[i][j]);
            }
            System.out.println(custotarmz[i]);
        }


    }
}
