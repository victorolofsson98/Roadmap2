package Functions;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    private String birthYear;

    public Person(int age, String name, String birthYear) {
        this.age = age;
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(birthYear, person.birthYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
