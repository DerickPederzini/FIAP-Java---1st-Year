import java.text.DecimalFormat;
import java.util.Scanner;

public class teste_sla {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        DecimalFormat decif = new DecimalFormat("##00,##");

        double divida, dividaJ, juros = 0.05;
        int qtdP = 0;


        System.out.println("Informe o valor inicial da dívida: ");
        divida = e.nextDouble();

        System.out.println("Total: "+decif.format(divida)+" Juros: 0 Número de Parcelas: "+qtdP+" Valor de parcelas: "+divida);

       for (qtdP = 3; qtdP < 15; qtdP+=3){
           juros += 0.05;

           dividaJ = (divida*juros)+divida;

           System.out.println("Total: "+decif.format(dividaJ)+" Juros: "+decif.format(juros*100)+" Número de Parcelas: "+qtdP+" Valor de parcelas: "+decif.format(dividaJ/qtdP));
        }




    }
}
