package fr.exo16_RollerCoaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static fr.exo14_FizzBuzz.Exo14_FizzBuzz.demanderNombre;

public class Exo16_RollerCoaster {
    public static void main(String[] args) {

        int place = demanderNombre("Entrez nombre de place");
        int tour = demanderNombre("Entrez le nombre de tours");
//        List<Integer> file = Arrays.asList(2,3,5,4);
        List<Integer> file = new ArrayList<>(Arrays.asList(2, 3, 5, 4));
        int profit = 0;

        for (int i = 0; i < tour; i++) {
            int placeRestante = place;

            List<Integer> dansManege = new ArrayList<>();
            while (file.size() > 0 && placeRestante > 0) {

                dansManege.add(file.get(0));

                if (placeRestante >= file.get(0)) {
                    placeRestante -= file.get(0);
                    profit += file.get(0);
                    file.remove(0);
                    file.addAll(dansManege);
                } else {

                    System.out.println("pb de place");
                    break;

                }
                System.out.println("profit : " + profit);

            }
        }


    }
}