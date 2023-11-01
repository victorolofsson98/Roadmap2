package Conditionals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        int[] myArray = new int[10];

        // add stuff to arraylist
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }

        System.out.println("My arraylist: ");
        // print arraylist out
        for (Integer x: myArrayList) {
            System.out.print(x + " ");
        }
        Collections.reverse(myArrayList);
        System.out.println();
        for (Integer x: myArrayList) {
            System.out.print(x + " ");
        }

        // add loop values to list and print them out
        System.out.println("\nMy array: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.print(myArray[i] + " ");
        }


        int min = myArrayList.get(0);
        int max = myArrayList.get(0);

        int size = myArrayList.size();

        for (int i = 0; i < size; i++) {
            if (myArrayList.get(i) < min) {
                min = myArrayList.get(i);
            }
        }

        for (int i = 0; i < size; i++) {
            if (myArrayList.get(i) > max) {
                max = myArrayList.get(i);
            }
        }

        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);

        System.out.println("\nMax: " + Collections.max(myArrayList));
        System.out.println("Min: " + Collections.min(myArrayList));


    }
}
