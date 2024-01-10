import java.util.Scanner;

public class exerc05_metodos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int [] vetorOrd = vetor();

        ordVetor(vetorOrd);

        int [] vetorOrdenado = ordVetor(vetorOrd);

        for (int i = 0; i <5; i++) {
            System.out.println(vetorOrdenado[i]);
        }

    }

    public static int [] vetor(){

        int [] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*10);
        }

        return vetor;
    }

    public static int[] ordVetor(int [] vetorOrd){

        for (int i = 0; i <5; i++){
            for (int j = 0; j < 4; j++){

                if (vetorOrd[i] < vetorOrd[j]){
                    int pivoVetor = vetorOrd[i];
                    vetorOrd[i] = vetorOrd[j];
                    vetorOrd[j] = pivoVetor;
                }

            }
        }

        return vetorOrd;

    }

}
