package fr.exo13_tri;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exo13_tri_list {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 25, 5, 7, 6, -5);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}


