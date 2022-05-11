package fr.exo10_Sapin;

import java.util.Scanner;

public class exo10_Sapin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int ch = sc.nextInt();



        for (int i = 0; i < ch; i++) {
            String etoile = "";
            String espace = "";

            // Compter les espaces
            for (int j = 0; j < ch-i; j++) {
                espace += "-";
//                System.out.println(espace);
//                System.out.println("space"+espace.length());
            }
            for (int k = 0; k < i*2-1; k++) {
            etoile += "*";
//            System.out.println(etoile);
//            System.out.println("etoile"+etoile.length());
            }
            System.out.println(espace + etoile);
        }
    }
}
