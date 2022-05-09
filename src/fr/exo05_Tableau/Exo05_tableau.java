package fr.exo05_Tableau;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo05_tableau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notes = {15, 12, 16};
        int[] listes = new int[3];

       for (int j=0 ;j < listes.length; j++){
           System.out.println("Entrez une note");
        listes[j] = sc.nextInt();}

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 0 && notes[i] <= 4) {
                System.out.println(notes[i] + " -> Catastrophique");
            }
            if (notes[i] >= 5 && notes[i] <= 10) {
                System.out.println(notes[i] + " -> Insuffisant");
            }
            if (notes[i] >= 11 && notes[i] <= 14) {
                System.out.println(notes[i] + " -> Peut mieux faire");
            }
            if (notes[i] >= 15 && notes[i] <= 17) {
                System.out.println(notes[i] + " -> Bien");
            }
            if (notes[i] >= 18 && notes[i] <= 20) {
                System.out.println(notes[i] + " -> Excellent, bon travail");
            }
        }

            for (int j = 0; j < listes.length; j++) {
                if (listes[j] >=0 &&  listes[j] <= 4) {
                    System.out.println(listes[j] + " -> Catastrophique");
                }
                if (listes[j] >=5 && listes[j] <= 10) {
                    System.out.println(listes[j] + " -> Insuffisant");
                }
                if (listes[j] >=11 && listes[j] <= 14) {
                    System.out.println(listes[j] + " -> Peut mieux faire");
                }
                if (listes[j] >=15 && listes[j] <= 17) {
                    System.out.println(listes[j] + " -> Bien");
                }
                if (listes[j] >=18 && listes[j] <= 20) {
                    System.out.println(listes[j] + " -> Excellent, bon travail");
                }

        }
    }
}

