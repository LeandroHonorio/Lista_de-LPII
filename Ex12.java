import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int a = 0 , b = 0, soma = 0, par = 0, aux = 0;
        double media = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero a : ");
        a = teclado.nextInt();
        System.out.println("Digite um numero b : ");
        b = teclado.nextInt();

        if ( b > a) {
            for (int i = a; i <= b ; i++)
            {
                if ( i % 2 == 0 ){
                    soma += i;
                    aux++;
                    System.out.println(i);
                }
            }
            media = (double) soma / aux;
            System.out.println(" A SOMA é:" + soma);
            System.out.println("a media é:" + media);
        }
        else {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    soma += i;
                    aux++;
                    System.out.println(i);

                }
            }
            System.out.println(" A SOMA é:" + soma);
            System.out.println("a media é:" + media);
        }

    }
}
