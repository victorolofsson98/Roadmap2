package DataTypesAndVariables;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int age = 18;
        double pi = 3.14;
        boolean yes = false;
        String myName = "Victor";
        char firstLetter = 'V';

        ArrayList<Integer> myIntegers = new ArrayList<>();

        myIntegers.add(age);

        for (Integer i : myIntegers) {
            System.out.println(i);
            int x = 5;
            for (int j = 0; j < 5; j++) {
                System.out.println("This will now run " + x + " times");
                Thread.sleep(1000);
                x -= 1;
            }
        }
    }
}
