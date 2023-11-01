package OOP;

public class Cat extends Animal implements AnimalStuff{

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void bark() {
        System.out.println("Woff!");
    }
}
