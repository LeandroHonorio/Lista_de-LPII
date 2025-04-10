import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        float nota_aluno = 0, media = 0, maior_nota =0  , menor_nota = 0, total_notas = 0;
        int quantidade_alunos = 0 ;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quer parar? Digite -1");
        System.out.println("Digite a nota:");
        nota_aluno = teclado.nextFloat();

        while (nota_aluno != -1 )
        {
            if ( menor_nota == 0 ){
                menor_nota = nota_aluno;
            }
            if (nota_aluno < menor_nota) {
               menor_nota = nota_aluno;
           }
            if (nota_aluno > maior_nota) {
               maior_nota = nota_aluno;
           }
           total_notas += nota_aluno;
           quantidade_alunos++ ;

           System.out.println("Quer parar? Digite -1");
           System.out.println("Digite a nota:");
           nota_aluno = teclado.nextFloat();
        }
        if (quantidade_alunos > 0 ) {
            media = total_notas / quantidade_alunos;
        }

        System.out.println(quantidade_alunos);
        System.out.println(total_notas);
        System.out.println(media);
        System.out.println(menor_nota);
        System.out.println(maior_nota);
    }
}
