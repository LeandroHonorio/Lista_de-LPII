import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int num, sup, inf;

        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o numero:");
        num = teclado.nextInt();
        System.out.println("Digite o numero Inferior:");
        inf = teclado.nextInt();
        System.out.println("Digite o numero Superior:");
        sup = teclado.nextInt();



        if (num >= inf && num <= sup) {
            System.out.println("O numero digitado está dentro!");
        } else if (num < inf) {
            System.out.println("O numero digitado está antes!");
        } else {
            System.out.println("O numero está depois!");
        }
    }
}
