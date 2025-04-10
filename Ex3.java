import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        float salario, percentual;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Salário:");
        salario = teclado.nextFloat();
        System.out.println("Digite o Percentual:");
        percentual = teclado.nextFloat();

        salario = salario + (salario * percentual / 100 );
        System.out.printf( "%f ", salario ) ;

    }
}
