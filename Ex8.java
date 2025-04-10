import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int quant_kwh;
        double valor_kwh, desconto, pagar;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite a Quantidade de kWh: ");
        quant_kwh = teclado.nextInt();

        System.out.println("Digite o valor do kWh: ");
        valor_kwh = teclado.nextDouble();

        if (quant_kwh < 150) {
           desconto = (valor_kwh * quant_kwh)*0.1;
           System.out.println("Desconto é: " + desconto);
           pagar = (valor_kwh * quant_kwh) - desconto;
        } else {
            pagar = valor_kwh * quant_kwh;
        }
        System.out.printf("O valor da Fatura é: %.2f" , pagar);
    }
}
