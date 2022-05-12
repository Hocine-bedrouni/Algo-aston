package fr.exo13_JustePrix;


import java.util.Random;
import java.util.Scanner;

public class JustePrix {
    public static void main(String[] args) {

        System.out.println("Bienvenu au juste prix");

        double vie = demanderNombre("Entrez votre nb de vie");

        int maxAleat = demanderNombre("Entrez votre prix max");

        Random max = new Random();
        int ale = max.nextInt(maxAleat);


        System.out.println(ale);
//
        for (int i = 0 ; i != vie; i++){
          int prix = demanderNombre("Entre votre enchère");
          if (prix == ale) {
              System.out.println("Bravo tu as trouver le juste prix");
              break;
          }
          if (prix > ale) {
              System.out.println("Non c'est moin");
          } else {
              System.out.println("Nonn c'est plus");
          }
          if (i == vie){
              System.out.println("dommage tu as perdu");
              break;
          }
        }
        System.out.println("Merci d'avoir jouer");

        }

    public static int demanderNombre(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        int ch = sc.nextInt();
        return ch;
    }

}
