/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arsw.stats;

/**
 *
 * @author daniel.builes
 */
class Node <T>{
    T data;
    Node<T> next ;
    
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    
    public Node<T> getNext(){
        return next;
    }
    
    public void set(T e){
        data=e;
    }
    
    public void setNext(Node<T> n){
        this.next = n;
    }
    
    public T getValue(){
        return data;
    }
    
    
}
