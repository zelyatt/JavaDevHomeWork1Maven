package org.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Vlad", "Kovalskyi");
        Gson gson = new Gson();
        System.out.println(gson.toJson(person));
    }
}

class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
