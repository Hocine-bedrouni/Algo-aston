package fr.exo14_FizzBuzz;

import java.util.Scanner;

public class Exo14_FizzBuzz {
    public static void main(String[] args) {

        int nombre = demanderNombre();

        for (int i = 0; i <= nombre; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Fizz");
            }
        }

        for (int i = 0; i <= nombre; i++) {
            System.out.println(i % 15 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : i);
            }
        }

    private static int demanderNombre() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        return scan.nextInt();
    }
    }
