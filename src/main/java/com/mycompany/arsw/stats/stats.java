/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arsw.stats;


import java.util.List;

/**
 *
 * @author daniel.builes
 */
public class stats {
    
    public static void main(String[] args){
        List<Double> numbers = new MyLinkedList();
        numbers.add(12.0);
        numbers.add(1.50);
        numbers.add(15.0);
        numbers.add(12.0);
        
        System.out.println("avg: " + avg(numbers));
        System.out.println("devstd: " + devstd(numbers));
        
    }
    
    public static double avg (List<Double> dl){
        return 0.0;
    }
    
    public static double devstd(List<Double> dl){
        return 0.0;
    }
    
    
}
