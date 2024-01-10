import java.util.Scanner;

public class exerc03_metodos {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    String [] nameEmployee = new String[] {"Derick", "Nicolas", "Edu", "Evelyn"};
    double [] salaryEmployee = new double[] {500, 699, 1720, 300};
    int [] workTimeEmployee = new int[] {1, 4, 10, 7};

    boolean [] raiseAble = calculusForRaise(salaryEmployee, workTimeEmployee);

    relatory(raiseAble, nameEmployee);
    
    }

    public static boolean [] calculusForRaise(double [] salaryEmployee, int [] workTimeEmployee){
        boolean [] raiseAble = new boolean[4];

        for (int i = 0; i <4; i++) {
            if (workTimeEmployee[i] > 3 && salaryEmployee[i] < 700) {
                raiseAble[i] = true;
            } else {
                raiseAble[i] = false;
            }
        }

        return raiseAble;
    }

    public static void relatory(boolean [] raiseAble, String [] nameEmployee){

        for (int i = 0; i < 4; i++) {

            if (raiseAble[i]){
                System.out.println("Parabéns "+nameEmployee[i]+" Você está elegivel a um aumento");
            }else{
                System.out.println("Olá "+nameEmployee[i]+" Você não está elegível a um aumento");
            }

        }
    }


}
