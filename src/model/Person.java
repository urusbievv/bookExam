package model;

public class Person {

    private double id;
    private String name;
    private int age;

    public void setId(double id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(double id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
