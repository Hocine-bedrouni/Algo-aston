package fr.exo09_Pyra_Mirroir;

import java.util.Scanner;


public class exo09_Pyra_mirroir {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nb = sc.nextInt();
        String pyr = "";


        for (int i = 0; i <= nb; i++) {
            pyr += "*";
            System.out.println(pyr);
        }


        for (int j = nb; j > 0 ; j--) {

            System.out.println(pyr.substring(0,j));

        }










       /* System.out.println(test.substring(2,13));
        System.out.println(lon);

        System.out.println("gjhggogu".substring(2, 5)); //returns "urge"
        System.out.println("smiles".substring(1, 5)); //returns "mile"*/
    }
}