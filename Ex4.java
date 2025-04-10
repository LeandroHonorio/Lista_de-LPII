import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double raio, perimetro, area ;
        double pi = 3.1416;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();

        perimetro = 2 * (raio * pi);
        area = pi * (raio * raio);

        System.out.println("Perimetro: " +  perimetro);
        System.out.println("Area:  " + area);


    }
}
