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
public interface List<E> {
    
    void add(E object);
    
    boolean contains(E object);
    
    E get(int index);
    
    
}