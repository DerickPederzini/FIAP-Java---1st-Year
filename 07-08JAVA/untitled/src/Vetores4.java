import java.util.Scanner;

public class Vetores4 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        String names[] = new String[5];
        double salary[] = new double[5];
        double time [] = new double[5];
        int i ;

        for(i=0; i<2; i++){
            System.out.println("Digite o nome do usuário: ");
            names[i] = entry.next();

            System.out.println("Digite o salário do usuário: ");
            salary[i] = entry.nextDouble();

            System.out.println("Digite o tempo de serviço em anos");
            time[i] = entry.nextDouble();

        }
        System.out.println("------FUNCIONARIOS QUE NÃO TERÃO AUMENTO------");
        for(i=0; i<2; i++) {

            if (time[i] < 5 && salary[i] > 780) {
                System.out.println(names[i]);
            }

        }
        System.out.println("------Funcionários que terão aumento-------");

            for(i=0; i<2; i++) {

            if (salary[i] < 780 && time[i] < 5) {
                System.out.println("Nome:"+names[i]+" Novo salário: " + (salary[i] + (salary[i] * 0.15)));
            } else if (salary[i] < 780 && time[i] > 5) {
                System.out.println("Nome:"+names[i]+" Novo salário: " + (salary[i] + (salary[i] * 0.35)));
            } else if (salary[i] > 780 && time[i] > 5){
                System.out.println("Nome:"+names[i]+" Novo salário: " + (salary[i] + (salary[i] * 0.25)));
            }
        }


    }
}
