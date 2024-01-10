import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

         int cont = 0, lowDay = 0, bigDay = 0;
         double lowTemp = 0, bigTemp = 0;
         double temp []= new double[7];
         String week [] = new String[] {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

         //Carregar Vetores

        while( cont < 7){

            System.out.print("Digite a temperatura na "+week[cont]+": ");
            temp[cont] = entry.nextDouble();

            //Maior Temperatura

            if(temp[cont]>bigTemp){
                bigTemp = temp[cont];
                bigDay = cont;
            }

            //Menor Temp

            if(cont == 0){
                lowTemp = temp[cont];
                lowDay = cont;
            } else if (temp[cont] < lowTemp) {
                lowTemp = temp[cont];
                lowDay = cont;
            }
            cont++;
        }

        System.out.println("Maior temperatura: "+bigTemp+" Na "+week[bigDay]);
        System.out.println("Menor temperatura: "+lowTemp+" Na "+week[lowDay]);

    }
}