package fr.exo06_Calculatrice;

import java.util.Scanner;

public class calulatrice {
    public static void main(String[] args) {

        System.out.println("Pour quitter tapez 0 comme premier chiffre");

        float nb1 = 1;
        while (nb1 >= 0) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez le premier chiffre");
            nb1 = sc.nextInt();

            if (nb1 == 0) {
                System.out.println("Merci d'avoir utiliser la calculatrice");
                break;
            }

            System.out.println("Entrez le second chiffre");
            float nb2 = sc.nextInt();

            System.out.println("Entrez l'operateur ( +, - , * , / )");
            String op = sc.next();


            switch (op) {

                case ("+"):
                    System.out.printf("%f %s %f = %f %n", nb1, op, nb2, nb1 + nb2);
                    break;
                case ("-"):
                    System.out.printf("%f %s %f = %f %n", nb1, op, nb2, nb1 - nb2);
                    break;
                case ("*"):
                    System.out.printf("%f %s %f = %f %n", nb1, op, nb2, nb1 * nb2);
                    break;
                case ("/"):
                    if (nb2 == 0) {
                        System.out.printf("Operation impossible %n");
                    } else {
                        System.out.printf("%f %s %f = %f %n", nb1, op, nb2, nb1 / nb2);
                    }
                    break;
                default:
                    System.out.printf("Mauvais operateur choisi %n");

            }
        }

    }
}


