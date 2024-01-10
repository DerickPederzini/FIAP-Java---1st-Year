import java.util.Scanner;

public class exerc06_metodos {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int [] agePerson = agePeople();
        char [] sexPerson = sexPeople();
        char [] colorEyes =eyesColor();
        char [] colorHair = hairColor();

        System.out.println(idadeMedia(agePerson, colorEyes, colorHair));

        System.out.println(biggestAge(agePerson));

        System.out.println(specificFem(agePerson, colorEyes, colorHair, sexPerson));


    }

    public static char [] sexPeople(){
        char [] sexPeople = new char[]{'F', 'F', 'M', 'F', 'F'};
        //int i =0;


        //System.out.println("Digite o sexo: ");
        //sexPeople[i] = in.next().charAt(0);

        //i++;}
        //while (sexPeople[i] != 'M' && sexPeople[i] != 'F' ){
            //System.out.println("Digite algo válido");

           // i++;
        //}

        return sexPeople;
    }

    public static int [] agePeople(){
        int [] agePeople = new int[]{18,19,20,22,34};

        return agePeople;
    }

    public static char [] eyesColor(){
        char [] eyesColor = new char[]{'A', 'C', 'A', 'C', 'C'};
        //int i =0;

        //System.out.println("Digite a col do olho: ");
        //eyesColor[i] = in.next().charAt(0);
        //while (eyesColor[i] != 'C' && eyesColor[i] != 'L' ){
            //System.out.println("Digite algo válido");
            //eyesColor[i] = in.next().charAt(0);

             //i++;}

        return eyesColor;
    }

    public static char [] hairColor(){
        char [] colorHair = new char[]{'L','P', 'C', 'L', 'P'};

        //int i =0;

        //System.out.println("Digite a col do cabelo: ");
        //colorHair[i] = in.next().charAt(0);
        //while (colorHair[i] != 'P' && colorHair[i] != 'L' && colorHair[i] != 'C'){
        //System.out.println("Digite algo válido");
        //colorHair[i] = in.next().charAt(0);

        //i++;}

        return colorHair;
    }

    public static double idadeMedia(int [] agePerson, char [] colorEyes, char [] colorHair){

        double idadeMedia = 0;
        int control = 0;

        for (int i = 0; i <5; i++){
            if (colorEyes[i] == 'C' && colorHair[i] == 'P'){
                idadeMedia += agePerson[i];
                control++;
            }
        }

        return (idadeMedia/control);
    }

    public static int biggestAge(int [] agePerson){
        int biggestAge = 0;

        for (int i =0; i < 5; i++){
            if (biggestAge < agePerson[i]){
                biggestAge = agePerson[i];
            }
        }


        return biggestAge;
    }

    public static int specificFem(int [] agePeople, char [] colorEyes, char [] colorHair, char [] sexPerson){
        int quantityFem = 0;

        for (int i =0; i < 5; i++){
            if (sexPerson[i] == 'F' && agePeople[i]>=18 && agePeople[i] <= 35
                    && colorHair[i] == 'L' && colorEyes[i] == 'A'){

                quantityFem++;

            }
        }

        return quantityFem;
    }



}
