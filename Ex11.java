import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        double a, b, num;
        String operador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o operador:");
        operador = teclado.nextLine();

        System.out.println("Digite o valor de a:");
        a = teclado.nextDouble();

        System.out.println("Digite o valor de b:");
        b = teclado.nextDouble();

        switch (operador) {
            case "+":

                num = a + b;
                System.out.println("A+B = " + num);
                break;

            case "-":
                num = a - b;
                System.out.println("A-B = " + num);
                break;

            case "*":
                num = a * b;
                System.out.println("A*B = " + num);
                break;


            case "/":
                if (b == 0) {
                    System.out.println("erro: Divisão por zero");
                }
                num = a / b;
                System.out.println("A/B = " + num);
                break;


            default:
                System.out.println("Operador Inválido");

        }
    }
}
