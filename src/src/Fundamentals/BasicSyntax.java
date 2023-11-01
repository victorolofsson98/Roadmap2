package Fundamentals;

import java.util.ArrayList;

public class BasicSyntax {
    public static void main(String[] args) {
        // this is a comment

        /*
         * this is a multiline comment
         * */

        /** Dcoumentation comment */

        int number = 0;
        float floatingnum = 0.0f;
        double doublenum = 0.0;
        // Strings are immutable
        String name = "Victor";
        char c = 'B';

        AddTwoWords("Victor", "Olofsson");
        System.out.println("\n");
        Animal a = new Animal("Dog", "Terry");

        System.out.printf(a.getName() + "\n");
        a.bark();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        System.out.println("\n");
        for (Integer i: numbers) {
            System.out.println(i);
        }
    }

    /**
     * What this method does
     *
     * What this method returns
     * */
    public static void AddTwoWords(String a, String b) {
        try {
            System.out.printf(a + " " + b);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
