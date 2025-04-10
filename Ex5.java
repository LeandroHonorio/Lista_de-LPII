import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int tempo, seg, min, hora;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o tempo: ");
        tempo = teclado.nextInt();

        hora = tempo / 3600 ;
        min = tempo % 3600 / 60 ;
        seg = tempo % 60 ;

        System.out.printf("%d horas, %d minutos %d segundos\n", hora, min, seg);
    }
}
