package Aprendendo;

import java.util.Scanner;

public class media {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    /*
    variaveis:  int    -> 1, 2, 3,...
                double -> -1, 2.2, 3.25...
                String -> Carlos, Jorge, mesa
                boolean-> true, false
    */

    // Lista de variaveis do código //
        String nome;
        double n1,n2,n3,n4,media;

    // Comandos de entrada de danos //
        System.out.println("Informe seu nome: ");
        nome = scan.next();

        System.out.println("sua primeira nota: ");
        n1 = scan.nextDouble();

    // Comando de repetição para checagem de notas válidas //
    /*
     || = ou
     && = e
     */
            while ((n1 < 0) || (n1 > 10))
            {
            System.out.println("esta nota é invalida, digite uma nota valida: ");
            n1 = scan.nextDouble();
            }

        System.out.println("sua segunda nota: ");
        n2 = scan.nextDouble();
            while ((n2 < 0) || (n2 > 10))
            {
            System.out.println("esta nota é invalida, digite uma nota valida: ");
            n2 = scan.nextDouble();
            }
        System.out.println("sua terceira nota: ");
        n3 = scan.nextDouble();
            while ((n3 < 0) || (n3 > 10))
            {
            System.out.println("esta nota é invalida, digite uma nota valida: ");
            n3 = scan.nextDouble();
            }
        System.out.println("sua quarta nota: ");
        n4 = scan.nextDouble();
            while ((n4 < 0) || (n4 > 10))
            {
            System.out.println("esta nota é invalida, digite uma nota valida: ");
            n4 = scan.nextDouble();
            }

    //Calculo da média //
        media = ((n1+n2+n3+n4)/4);

    // Comando de analise de média e condição para respostas //
            if (media <= 5)
            {
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            System.out.println("Você esta reprovado.");
            }
            else if (media > 5 && media < 7)
            {
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            System.out.println("você esta de recuperação.");
            }
            else
            {
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            System.out.println("você esta aprovado.");
            }
    }
}
