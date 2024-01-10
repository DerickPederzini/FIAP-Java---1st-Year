import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String founded = null;
        String names [] = new String[10];
        int i;



        for(i = 0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"º nome: ");
            names[i] = entry.next();

        }
        System.out.println("Digite o nome de checagem: ");
        founded = entry.next();

        for (i = 0; i<10; i++ ){
            if (founded.equalsIgnoreCase(names[i])){
                System.out.println("ACHEI na posição: "+i);
            }
            else {
                System.out.println("NÃO ACHEI");
            }
        }
    }
}