/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agudelor_grandap;

/**
 *
 * @author audoban
 */
public class DoublyLinkedList<E> implements List<E> {
    
    private DoublyLinkedNode<E> front;

    public DoublyLinkedList() {
    }
    
    @Override
    public void add(E target) throws NullPointerException {
        if ( target == null ) 
            throw new NullPointerException();
        
        DoublyLinkedNode<E> node = front; 
        while (front.getNext() != null) {
            front = front.getNext();
        }
        
        DoublyLinkedNode<E> next = new DoublyLinkedNode<>(target);
        next.setPrevius(node);
        node.setNext(next);
    }

    @Override
    public boolean contains(E target) {
    }

    @Override
    public E get(int index) {
    }

    @Override
    public boolean isEmpty() {
    }

    @Override
    public E remove(int index) {
    }

    @Override
    public boolean remove(E target) {
    }

    @Override
    public void set(int index, E target) {
    }

    @Override
    public int size() {
    }
    
    
}
