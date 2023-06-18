/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_ejemplos;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author daniel.builes
 */
public class Generics {

    public static void main(String[] args) {
        
        Integer[] areglo = {1,2,3,4,5};
        Collection<Integer> coleccion = new LinkedList<Integer>();
        fromArrayToCollection(areglo, coleccion);
        
        System.out.println("Colecion" + coleccion);
    }
    
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
}
