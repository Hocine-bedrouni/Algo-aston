package fr.exo02;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez Le premier chiffre ");
        int a = scan.nextInt();

        System.out.println("Entrez Le second chiffre ");
        int b = scan.nextInt();


// System.out.println("La somme de " + a + " + " + b +" = "+ (a+b));
        System.out.printf("la somme de %d + %d = %d", a,b,a+b);

        ;



    }


}
