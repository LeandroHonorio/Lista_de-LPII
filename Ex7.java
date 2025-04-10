import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int num;
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = Teclado.nextInt();

        if ( num % 2 == 0 ) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");

        }

    }
}
