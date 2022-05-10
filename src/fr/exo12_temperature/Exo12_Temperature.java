package fr.exo12_temperature;

import java.util.ArrayList;

public class Exo12_Temperature {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        list.add(12);
        list.add(25);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(-3);
        list.add(2);
        list.add(-2);


        int min = list.get(0);

        for (int temp : list) {
            if (min > Math.abs(temp) && ((min >= Math.signum(temp) || min < 0 )) ){
                min = temp;
            }
        }
        System.out.println(min);
    }
}
