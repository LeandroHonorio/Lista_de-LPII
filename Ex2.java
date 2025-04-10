import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        float a, b, soma, sub, mult, div;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = teclado.nextFloat();
        System.out.println("Digite um numero: ");
        b = teclado.nextFloat();

        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a/b;

        System.out.printf("a soma eh: %f \n" , soma);
        System.out.printf("a sub eh: %f \n" , sub);
        System.out.printf("a multi eh: %f \n" , mult);
        System.out.printf("a div eh: %f \n" , div);


    }
}
