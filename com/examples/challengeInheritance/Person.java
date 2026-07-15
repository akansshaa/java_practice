package com.examples.challengeInheritance;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) return false;
        else{
            Person per = (Person)obj;
            return this.name.equals(per.name) &&
                   this.age == per.age;
        }
    }
    @Override
    public int hashCode() {
        return this.name.hashCode() + age;
    }
}
