/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agudelor_grandap;

/**
 *
 * @author LENOVO
 * @param <E>
 */
public class DoublyLinkedNode<E> {
    
    
    private E item;
    private DoublyLinkedNode<E> next;
    private DoublyLinkedNode<E> previous;
    
    public DoublyLinkedNode(E item) {
        this.item = item;
    }
    
    public DoublyLinkedNode (E item, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
        this.item = item;
        this.next = next;
        this.previous = previous;
    }

    /**
     * @return the item
     */
    public E getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(E item) {
        this.item = item;
    }

    /**
     * @return the next
     */
    public DoublyLinkedNode<E> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(DoublyLinkedNode<E> next) {
        this.next = next;
    }

    /**
     * @return the previous
     */
    public DoublyLinkedNode<E> getPrevious() {
        return previous;
    }

    /**
     * @param previus the previous to set
     */
    public void setPrevious(DoublyLinkedNode<E> previus) {
        this.previous = previus;
    }
    
}
