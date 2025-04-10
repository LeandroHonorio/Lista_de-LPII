import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int dist, quant_gaso;
        double t, vm, consumo ;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a distancia Percorrida: ");
        dist = teclado.nextInt();
        System.out.println("Digite o tempo gasto : ");
        t = teclado.nextDouble();
        System.out.println("Digite a quantidade de gasolina gasta: ");
        quant_gaso = teclado.nextInt();

        vm =  (double) dist / t ;
        System.out.printf("A velocidade média foi: %.2f km/h \n", vm );
        consumo = (double) dist / quant_gaso;
        System.out.println("O consumo de Combustivel foi: " + consumo);





    }
}
