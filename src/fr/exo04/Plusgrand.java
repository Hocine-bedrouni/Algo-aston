package fr.exo04;

import java.util.Scanner;

public class Plusgrand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Veuillez entrez le premier chiffre");
        int nb1 = scan.nextInt();

        System.out.println("Veuillez entrez le second chiffre");
        int nb2 = scan.nextInt();

        System.out.println("Veuillez entrez le troisième chiffre");
        int nb3 = scan.nextInt();

        int max;

        if (nb1>nb2 && nb1>nb3)
             max = nb1;
        if (nb1>nb2 && nb3>nb1)
             max = nb3;
        if (nb2>nb1 && nb2>nb3)
            max = nb2;
        if (nb2>nb1 && nb3>nb2);
        max = nb3;

        System.out.printf("[%d %d %d] --> %d", nb1, nb2, nb3, max);

       /* if (nb1 > nb2) {
            if (nb2 > nb3) {
                System.out.printf("[%d %d %d] --> %d", nb1, nb2, nb3, nb1);
            }
        } else {
            if (nb1 > nb3) {
                System.out.printf("[%d %d %d] --> %d", nb1, nb2, nb3, nb2);
            }
        }
        if (nb3 > nb1) {
            System.out.printf("[%d %d %d] --> %d", nb1, nb2, nb3, nb3);
        } else {
            if (nb2 > nb1) {
                System.out.printf("[%d %d %d] --> %d", nb1, nb2, nb3, nb2);
            }
        }*/
    }
}