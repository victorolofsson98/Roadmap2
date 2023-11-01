package Functions;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(15, "Victor", "1998-02-12");
        Person person1 = new Person(25, "Peter", "1985-11-12");

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getBirthYear());

        person.setAge(12);
        person.setName("Olof");
        person.setBirthYear("1990-05-12");

        Main main = new Main();

        System.out.println(main.addition(12, 5));
        System.out.println(main.bigger(20, 25));
        System.out.println(main.smallest(50, 100));
        main.bigger(55, 100, 21);

        main.oddOrEven(12);
        main.oddOrEven(13);

        System.out.println(person.equals(person1));

        System.out.println(person.hashCode());

        // uses toString method automatically
        System.out.println(person);
    }
    public int bigger(int a, int b) {
        return Math.max(a, b);
    }

    // method overload
    public void bigger(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the biggest");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the biggest number");
        } else {
            System.out.println(c + " is the biggest number");
        }
    }

    private int smallest(int a, int b) {
        return Math.min(a, b);
    }

    protected void oddOrEven(int a) {
        if (a % 2 == 0) {
            System.out.println("The value is even");
        } else {
            System.out.println("The value is odd");
        }
    }

    // default
    int addition(int a, int b) {
        return a + b;
    }


}
