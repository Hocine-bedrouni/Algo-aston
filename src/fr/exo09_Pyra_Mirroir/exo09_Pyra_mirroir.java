package fr.exo09_Pyra_Mirroir;

import java.util.Scanner;


public class exo09_Pyra_mirroir {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nb = sc.nextInt();
        String pyr = "";


        for (int i = 0; i <= nb; i++) {
            System.out.println(pyr);
            pyr += "*";
        }

        for (int j = nb; j >= 0; j--) {
            System.out.println(pyr.substring(0,j));

        }
    }
}