package edu.dio;

public class Main {
    public static void main(String[] args) {

/*  **Person Class**

        var male = new Person("Joao");
        male.incAge();
        var female =new Person("Maria");
        female.incAge();

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

 */

        var personRecord = new PersonRecord( "Rafael");
        System.out.println(personRecord.getInfo());
        System.out.println(personRecord.name());




    }
}