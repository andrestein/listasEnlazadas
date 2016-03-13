/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agudelor_grandap;

/**
 *
 * @author Johan Smith
 * @author Andres Granda
 * @param <E>
 */
public interface List<E> {

    void add( E target );

    boolean contains( E target );

    E get( int index );

    void set( int index, E target );

    boolean isEmpty();

    E remove( int index );

    boolean remove( E target );

    void add( int index, E target );

    int size();

    void reverse();

}
