/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author daniel.builes
 */
public class LambdaSocialNetwork {
    
    public static void main(String[] args){
        List<Person> personas = new ArrayList<Person>();
        personas.add(new Person("Daniel",Person.Sex.MALE, "daniel.buiQ@edu.com", 23) );
        personas.add(new Person("Jimmy",Person.Sex.MALE, "jimy@edu.com", 20) );
        personas.add(new Person("Luisa",Person.Sex.FEMALE, "luisa@edu.com", 19) );
        printPersonsOlderThan(personas,20);
        
        System.out.println("-------------Sol-2-------------");
        
        printPersonsWithinAgeRange(personas, 19, 25);
        
        System.out.println("-------------Sol-3-------------");
        
        printPersons(personas, new CheckPersonEligibleForSelectiveService());
        
        System.out.println("-------------Sol-4-------------");
        
        printPersons(personas, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
            }
        });
        
        System.out.println("-------------Sol-5-------------");
        
        printPersons(personas,(Person p) -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 29);
        
        System.out.println("-------------Sol-6-------------");
        
        printPersonsWithPredicate(personas, (p) -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 29);
        
        System.out.println("-------------Sol-7-------------");
        
        processPersons(personas, p -> p.gender == Person.Sex.FEMALE, 
                        p -> System.out.println(p.name + " " + p.age ));
        
        System.out.println("-------------Sol-7.2-------------");
        
        processPersonsWithFunction(personas, p -> p.getAge() >= 18 && p.getAge() <= 29, p -> p.emailAddress, email -> System.out.println(email) );
        
        
        
        System.out.println("-------------Sol-8-------------");
        
        processElements(
                personas,
                p -> p.gender == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25,
                p -> p.emailAddress,
                email -> System.out.println(email)
        );
        
        
        System.out.println("-------------Sol-9-------------");
        
        personas.stream().filter(
                        p -> p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 40).map(p -> p.emailAddress).forEach(email -> System.out.println(email));
    }
    
    
    public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper, Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
    
    
    public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
    
    
    public static void processPersons(List<Person> lista, Predicate<Person> tester, Consumer<Person> block) {
        for (Person p : lista) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    
    public static void printPersonsWithPredicate(List<Person> lista, Predicate<Person> tester) {
        for (Person p : lista) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    
    public static void printPersonsOlderThan(List<Person> lista, int age) {
        
        for (Person p : lista) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
    
    public static void printPersonsWithinAgeRange(List<Person> lista, int low, int high) {
        for (Person p : lista) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
    
    
    
}

