package Conditionals;

public class StarSystem {
    public static void main(String[] args) throws InterruptedException {
        // star system
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
