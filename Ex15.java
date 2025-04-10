import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        int quantidade_vogais = 0, quantidade_digitos = 0, quantiade_caracteres = 0;
        char palavra;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: (ou Digite . para sair");
        palavra = teclado.next().charAt(0);

        while ( palavra != '.'){
            if (palavra == 'a' || palavra == 'e' || palavra == 'i'  || palavra == 'o' ||palavra == 'u'){
                quantidade_vogais ++ ;
            } else if (palavra >= '0' && palavra <= '9'){
                quantidade_digitos ++ ;
            } else {
                quantiade_caracteres ++ ;
            }

            System.out.println("Digite uma palavra: (ou Digite . para sair");
            palavra = teclado.next().charAt(0);
        }
        System.out.println("A quantidade de Vogais:" + quantidade_vogais);
        System.out.println("A quantidade de Digitos:" + quantidade_digitos);
        System.out.println("A quantidade de Caracteres:" + quantiade_caracteres);
    }
}
