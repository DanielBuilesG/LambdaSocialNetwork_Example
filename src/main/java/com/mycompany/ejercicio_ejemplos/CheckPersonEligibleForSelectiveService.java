/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_ejemplos;

/**
 *
 * @author daniel.builes
 */
public class CheckPersonEligibleForSelectiveService implements CheckPerson{
    
    @Override
    public boolean test(Person p){
        return p.gender == Person.Sex.FEMALE && p.getAge() >= 18 && p.getAge() <= 25;
    }
    
}
