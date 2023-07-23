package org.example.uml;

public class Dog extends Animal {

    public String breed;

    Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void Bark() {
        System.out.println(this.name + " says Woof Woof.");
    }
}
