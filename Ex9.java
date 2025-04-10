import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        double real, aux;
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        real = teclado.nextDouble();

        num = (int) real;
        aux = real - num;


        if (aux >= 0.5 ) {
            num++;
            System.out.println(num);
        } else {
            System.out.println(num);
        }


    }
}
