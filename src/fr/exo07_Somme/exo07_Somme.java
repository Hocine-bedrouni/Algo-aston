package fr.exo07_Somme;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class exo07_Somme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un chiffre");
        int nb = sc.nextInt();
        int resultat = 0;
        int ch ;

        for (int i = 0 ; i <= nb; i++) {
             resultat += i;
             ch = i;

            if (i == nb) {
                System.out.print(ch);
            } else {
                System.out.print(ch +"+");
            }
        }
        System.out.print(" = " +resultat);
    }
}
