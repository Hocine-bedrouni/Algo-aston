package fr.exo08_Pyramide;

import java.util.Scanner;

public class exo08_Pyramid {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nb = sc.nextInt();
        String pyr = "";

        for (int i = 0; i < nb; i++) {
            pyr += "*";
            System.out.println(pyr);
        }

    }
}


