package fr.exo12_temperature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exo12_Temperature {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        list.add(12);
        list.add(25);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);

        list.add(-3);

        list.add(-2);
        list.add(-4);


        int min = list.get(0);

        for (int temp : list) {
            if ((min > Math.abs(temp))) {
                min = temp;
            }
        }
        for (int temp : list) {
            if ((min == Math.abs(temp) && (-1 == Math.signum(temp)))) {
                min = temp;
            }
        }
        System.out.println(min);
    }

//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);

}

