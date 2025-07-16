package edu.dio;

import org.w3c.dom.ls.LSOutput;

public record PersonRecord(String name, int age) {

    // construtor Compacto
        public PersonRecord{

        }

        //construtor secundario
    public PersonRecord(String name){
            this(name, 2);
    }

        public String getInfo(){
            return "Name: " + name + " age: " + age;
        }
}
