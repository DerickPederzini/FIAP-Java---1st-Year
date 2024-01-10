public class Exericio7 {
    public static void main(String[] args) {

        String cities[] = new String[]{"BangKoK", "Madrid", "Paris", "São Paulo", "Los Angeles"};
        int distance [][] = new int[5][5];
        double liter = 10;

        for (int i = 0; i<5; i++){
            for (int j=0; j<5; j++){

                if (i == j){
                    distance[i][j]= 0;
                } else {
                    distance[i][j]= (int) (Math.random()*500);
                }

            }
        }

        System.out.println("--------- PERCURSOS INFERIORES A 250 -------------");
        for (int i =0; i<5; i++){
            for (int j =0; j<5; j++){
                if (distance[i][j]<250 && distance[i][j] != 0){
                    System.out.println("--- Distância: "+distance[i][j]+"\t km entre a cidade "+cities[i]+" e "+cities[j]);
                }
            }
        }
        System.out.println("\n");
        System.out.println("-------- CONSUMOS POR PERCRUSO ----------");
        System.out.println("\n");

        for (int i =0; i< 5; i++){
            for (int j = 0; j<5; j++){
                
                if (distance[i][j]<250 && distance[i][j]!=0){
                    System.out.println("Consumo entre a cidade "+cities[i]+" e "+cities[j]+" é: \t"+(distance[i][j]/liter)+" KM");
                }

            }
        }


    }
}
