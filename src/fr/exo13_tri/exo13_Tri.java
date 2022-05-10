package fr.exo13_tri;

import java.util.ArrayList;
import java.util.Arrays;

public class exo13_Tri {
    public static void main(String[] args) {


        int[] tab = {12, 25, 5, 7, 6, -5};
      int[] tab2 = new int [6];

      for (int num : tab) {
          for (int i = 0; i < tab.length-1; i++) {
              if (tab[i] > tab[i+1]) {
                  int temp =tab[i];
                  tab[i] =tab[i+1];
                  tab[i+1] = temp;
              }
      }
            System.out.println(Arrays.toString(tab));
            }
        }
    }
