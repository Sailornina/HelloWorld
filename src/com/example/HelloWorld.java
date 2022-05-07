package com.example;

import com.example.animals.Animal;
import com.example.animals.Cat;
import com.example.animals.Dog;
import com.example.console.Console;
import com.example.console.ConsoleFactory;

public class HelloWorld {
    public static void main(String[] args) {
        String.valueOf(1); // Metodo "static" o de clase
        "Hello World".length(); // Metodo de "instancia"

        System.out.println("Hello World!");

        // Definiste una variable "greeter" del tipo "Greeter" llamando al constructor
        // que espera un string "message"
        Greeter greeter = new Greeter("Hello world from Greeter!");
        greeter.greet(); // Llamaste al metodo "greet()" de greeter

        // Ejemplo herencia con interfaces
        Console console = ConsoleFactory.create();
        console.log("Logged message!");

        // Ejemplo herencia con classes
        Animal animal;
        Cat cat = new Cat("Milo");
        cat.meow();
        Dog dog = new Dog("Pachu");
        dog.bark();

        animal = cat;
        animal.walk();

        Animal nina = new Cat("Nina");
        nina.walk();
        Cat ninaAsACat = (Cat) nina;
        ninaAsACat.meow();
    }
}
