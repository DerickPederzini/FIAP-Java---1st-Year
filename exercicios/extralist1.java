import java.util.Scanner;

public class extralist1 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int price [] = new int[10];
        int quantity [] = new int[10];
        int tot = 0;

        for (int i = 0; i<10; i++){
            System.out.println("------------PRODUCT: "+(i+1)+"-----------------");

            System.out.println("Informe o preço unitário de cada objeto: ");
            price[i] = entry.nextInt();

            System.out.println("Informe a quantidade vendida: ");
            quantity[i] = entry.nextInt();

            tot += price[i]*quantity[i];
        }

        System.out.println("-------------RELATÓRIO DE VENDAS-----------------");

        for (int i =0; i<10; i++){
            System.out.println("Qtde: "+quantity[i]+"       Preço: R$"+price[i]+"          Total: "+(quantity[i]*price[i]));
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Total Geral: R$"+tot);
        System.out.println("-----------COMISSION-----------------------");


    }
}
