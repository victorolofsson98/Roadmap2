package Fundamentals;

public class Animal {
    private String animal;
    private String name;

    public Animal(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.printf("WOOF");
    }
}
