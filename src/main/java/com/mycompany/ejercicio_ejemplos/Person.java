/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_ejemplos;

/**
 *
 * @author daniel.builes
 */
public class Person{
    
    public enum Sex {
        MALE, FEMALE
    }
    
    String name;
    int age;
    Sex gender;
    String emailAddress;
    
    
    public Person(String name, Sex gender, String email, int age){
        this.name = name;
        this.gender = gender;
        this.emailAddress = email;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public void printPerson() {
        System.out.println(name + " " + emailAddress);
    }
    
    
}
