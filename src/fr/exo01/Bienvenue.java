package fr.exo01;

import java.util.Scanner;

public class Bienvenue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre nom");


        String name = scan.nextLine();

        System.out.println("Bienvenue " + name);

    }

}
