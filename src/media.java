package Aprendendo;

import java.util.Scanner;

public class media {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double n1,n2,n3,n4,media;

        System.out.println("sua primeira nota: ");
        n1 = scan.nextDouble();
        System.out.println("sua segunda nota: ");
        n2 = scan.nextDouble();
        System.out.println("sua terceira nota: ");
        n3 = scan.nextDouble();
        System.out.println("sua quarta nota: ");
        n4 = scan.nextDouble();
        media = ((n1+n2+n3+n4)/4);

            if (media <= 5)
            {
            System.out.println("a sua média é: " + media);
            System.out.println("você esta reprovado.");
            }
            else if (media < 7)
            {
            System.out.println("a sua média é: " + media);
            System.out.println("você esta de recuperação.");
            }
            else
            {
            System.out.println("a sua média é: " + media);
            System.out.println("você esta aprovado.");
            }
    }
}
