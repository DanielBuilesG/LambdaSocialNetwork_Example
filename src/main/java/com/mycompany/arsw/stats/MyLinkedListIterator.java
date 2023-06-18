/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arsw.stats;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author danie
 */
public class MyLinkedListIterator<T> implements Iterator<T>{
    
    private Node<T> iterator;
    
    public MyLinkedListIterator(Node<T> firstNode){
        iterator = firstNode;
    }
    
    @Override
    public boolean hasNext() {
        return iterator != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T value = iterator.getValue();
        iterator = iterator.getNext();
        return value;
    }
    
}
