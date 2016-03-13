/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agudelor_grandap;

import javax.naming.SizeLimitExceededException;

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
        
        if ( front == null ) {
            front = new DoublyLinkedNode<>(target);
            return;
        }
        
        DoublyLinkedNode<E> last = front; 
        while (last.getNext() != null) {
            last = last.getNext();
        }
        
        // Ligo, El nuevo nodo con el ultimo de la lista
        //                                          [target, next, prev]
        DoublyLinkedNode<E> next = new DoublyLinkedNode<>(target, null, last);
        // Ahora el penultimo nodo apuntara al nuevo nodo
        // que sera el ultimo
        last.setNext(next);
    }

    @Override
    public boolean contains(E target) {
        for ( DoublyLinkedNode<E> node = front
                ; node != null 
                ; node = node.getNext() )
        {
            if ( node.getItem().equals(target) ) 
                return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        DoublyLinkedNode<E> node = front;
        
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public E remove(int index) {
        
    }

    @Override
    public boolean remove(E target) {
        for ( DoublyLinkedNode<E> node = front
                ; node != null 
                ; node = node.getNext() )
        {
            
            if ( node.getItem().equals(target) ) {
                
                if ( node.getNext() == null ) {
                    node.getPrevious().setNext(null);
                } else {
                    // [ nodo anterior ] -> [ nodo siguiente ]
                    node.getPrevious().setNext(node.getNext());
                    // [ nodo anterior ] <- [ nodo siguiente ]
                    node.getNext().setPrevious(node.getPrevious());
                    // Apartir de aca que se encargue el recolector!!!
                }
                return true;
            }
        } // Pablo: 316 822 8551
        return false;
    }

    @Override
    public void set(int index, E target) {
    }

    @Override
    public int size() {
    }
    
    
}
