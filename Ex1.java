import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int a, b, soma, sub, mult, div;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = teclado.nextInt();
        System.out.println("Digite um numero: ");
        b = teclado.nextInt();

        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a/b;

        System.out.printf("a soma eh: %d \n" , soma);
        System.out.printf("a sub eh: %d \n" , sub);
        System.out.printf("a multi eh: %d \n" , mult);
        System.out.printf("a div eh: %d \n" , div);


    }
}
