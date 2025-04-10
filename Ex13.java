import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int quantidade = 0, aux;
        float notas = 0, total = 0, media = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        quantidade = teclado.nextInt();
        aux = quantidade;

        while (quantidade > 0 ){
            System.out.print("Digite as notas: ");
            notas = teclado.nextFloat();
            total += notas ;
            media =  total/aux;

            quantidade--;



        }
        System.out.println("Media: " + media);
    }

}
