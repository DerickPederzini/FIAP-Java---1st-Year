package training.f1;

import java.util.Scanner;

public class trainingJava {

    static String[] racist = new String[]{"Max Verstappen", "Kimi Raikkonen", "Lewis Hamilton",
            "Nico Rosberg", "Sebastian Vettel"};
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] countries = new String[]{"Belgium", "Italy", "Singapore", "Malaysia", "Japan"};

        relatory(countries);

    }

    public static void relatory(String[] countries) {

        int[][] pointPerPilot = fillPointsOfRacers(countries);

        int [] pointsEachPilot = fillPointsEachPilot(pointPerPilot);
        System.out.println("+=============================================+");
        System.out.println("The total points of each pilot was");
        for (int i = 0; i < pointsEachPilot.length; i++) {
            System.out.println("Pilot "+racist[i]+" made "+pointsEachPilot[i]+" points!");
        }

        System.out.println("======================================================================");
        System.out.println("Throughout this year, our racist have competed to see who was the best");
        System.out.println("This 12 months have been incredible, below are this year's winners for every GP");
        int [] winnerEachRace = fillWinnerEachRace(pointPerPilot);
        for (int i = 0; i < winnerEachRace.length; i++) {
            int winner = winnerEachRace[i];
            System.out.println("The winner of the GP "+countries[i]+" was: "+racist[winner] );
        }

        System.out.println("======================================");
        showBiggestPoints(pointsEachPilot);

    }

    public static int[] []fillPointsOfRacers(String[] countries) {

        int[][] pointsPerPilot = new int[5][5];

        for (int i = 0; i < racist.length; i++) {
            System.out.println("Pilot " + racist[i]);
            for (int j = 0; j < racist.length; j++) {
                System.out.print("Pontuação GP " + countries[j] + " :");
                pointsPerPilot[i][j] = input.nextInt();
            }
        }

        return pointsPerPilot;
    }//linhas são pilotos,
    // colunas são paises

    //======================================================================
    public static int [] fillPointsEachPilot(int[][] pointPerPilot){

        int [] pointsEachPilot = new int[racist.length];

        for (int i = 0; i < pointPerPilot.length; i++) {
            for (int j = 0; j < pointPerPilot[i].length; j++) {
                pointsEachPilot[i] += pointPerPilot[i][j];
            }
        }

        return pointsEachPilot;
    }
    //======================================================================
    public static int [] fillWinnerEachRace(int[][] pointPerPilot){

        int [] winnerEachRace = new int[5];

        for (int i = 0; i < 5; i++) {
            int pivo =0;
            for (int j = i+1; j < 5; j++) {

                if (pivo < pointPerPilot[j][i]){
                    pivo = pointPerPilot[j][i];
                    winnerEachRace[i] = j;
                }

            }
        }
        return winnerEachRace;

    }
    //======================================================================
    public static void showBiggestPoints(int [] pointsEachPilot){

        int pivo=0;

        int pilotWithBiggestPoints = 0;

        for (int i = 0; i < pointsEachPilot.length; i++) {
            if (pivo < pointsEachPilot[i]){
                pivo = pointsEachPilot[i];
                 pilotWithBiggestPoints = i;
            }
        }

        System.out.println("The pilot with the most ammount of points was "+racist[pilotWithBiggestPoints]);
        System.out.println("Right Behind of\n MAX VERSTAPPEN DUDUDU");
    }
}
