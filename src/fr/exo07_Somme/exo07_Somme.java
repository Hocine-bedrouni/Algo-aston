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


        for (int i = 0 ; i <= nb; i++) {
             resultat += i;


            if (i == nb) {
                // dernier chiffre à afficher pas de "+" mais un "="
                System.out.print(i + "=");
            } else {
                // Pour afficher la liste de chiffres avec le "+"
                System.out.print(i +"+");
            }
        }
        System.out.print( resultat);
    }
}
