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
public class DoublyLinkedList<E> implements List<E> {

    private DoublyLinkedNode<E> front;

    public DoublyLinkedList() {
    }

    @Override
    // Insertar null, es legal en esta lista y tambien en las listas
    // de la biblioteca de java
    public void add( E target ) {
        if ( front == null ) {
            front = new DoublyLinkedNode<>( target );
            return;
        }

        DoublyLinkedNode<E> last = front;
        while ( last.getNext() != null )
            last = last.getNext();

        // Ligo, El nuevo nodo con el ultimo de la lista
        //                                               [target, next, prev]
        DoublyLinkedNode<E> next = new DoublyLinkedNode<>( target, null, last );
        // Ahora el penultimo nodo apuntara al nuevo nodo
        // que sera el ultimo
        last.setNext( next );
    }

    @Override
    public boolean contains( E target ) {
        for ( DoublyLinkedNode<E> node = front; node != null;
                node = node.getNext() ) {
            if ( node.getItem().equals( target ) )
                return true;
        }
        return false;
    }

    @Override
    public E get( int index ) throws IndexOutOfBoundsException {
        int cont = 0;

        if ( index < 0 )
            throw new IndexOutOfBoundsException( "index < 0" );

        for ( DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext() ) {
            if ( index == cont )
                return node.getItem();
            ++cont;
        }
        throw new IndexOutOfBoundsException( "index: " + index + ", size: " + size() );
    }

    @Override
    public void set( int index, E target ) throws IndexOutOfBoundsException {
        int cont = 0;

        if ( index < 0 )
            throw new IndexOutOfBoundsException( "index < 0" );

        for ( DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext() ) {
            if ( index == cont ) {
                node.setItem( target );
                return;
            }
            ++cont;
        }

        throw new IndexOutOfBoundsException( "index: " + index + ", size: " + size() );
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public E remove( int index ) throws IndexOutOfBoundsException {
        int cont = 0;

        if ( index < 0 )
            throw new IndexOutOfBoundsException( "index < 0" );

        for ( DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext(), cont++ ) {
            if ( index == cont ) {
                // [ nodo.anterior ] -> [ nodo.siguiente ]
                if ( node.getPrevious() != null )
                    node.getPrevious().setNext( node.getNext() );

                // [ nodo.anterior ] <- [ nodo.siguiente ]
                if ( node.getNext() != null )
                    node.getNext().setPrevious( node.getPrevious() );

                // Java no me permite liberar memoria ,(._.),
                if ( index == 0 )
                    front = front.getNext();
                return node.getItem();
            }
        }

        throw new IndexOutOfBoundsException( "index: " + index + ", size: " + size() );
    }

    @Override
    public boolean remove( E target ) {
        for ( DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext() ) {
            if ( node.getItem().equals( target ) ) {
                // [ nodo.siguiente.anterior ] -> [ nodo.anterior ]
                if ( node.getNext() != null )
                    node.getNext().setPrevious( node.getPrevious() );

                // [ nodo.anterior.siguiente ] -> [ nodo.siguiente ]
                if ( node.getPrevious() != null )
                    node.getPrevious().setNext( node.getNext() );

                if ( front.getItem().equals( target ) )
                    front = front.getNext();
                // Apartir de aca que se encargue el recolector!!!
                return true;
            }
        }

        return false;
    }

    @Override
    public void add( int index, E target ) throws IndexOutOfBoundsException {
        if ( index < 0 )
            throw new IndexOutOfBoundsException( "index < 0" );

        int cont = 0;
        DoublyLinkedNode<E> newNode;

        for ( DoublyLinkedNode<E> node = front;
                node != null;
                node = node.getNext(), cont++ ) {
            if ( index == cont ) {
                newNode = new DoublyLinkedNode<>( target, node, node.getPrevious() );

                // [ nodo.anterior.siguiente ] -> [ newNode ]
                if ( node.getPrevious() != null )
                    node.getPrevious().setNext( newNode );
                // [ nodo.anterior ] -> [ newNode ]
                node.setPrevious( newNode );

                if ( index == 0 )
                    front = newNode;

                return;
            } else if ( node.getNext() == null ) {
                newNode = new DoublyLinkedNode<>( target, null, node );
                node.setNext( newNode );
                return;
            }
        }

        if ( index == 0 && isEmpty() ) {
            front = new DoublyLinkedNode<>( target );
            return;
        }

        throw new IndexOutOfBoundsException( "index: " + index + ", size: " + size() );
    }

    @Override
    public int size() {
        DoublyLinkedNode<E> node = front;
        int size = 0;
        for ( ; node != null; node = node.getNext() ) {
            ++size;
        }
        return size;
    }

    @Override
    public void reverse() {
        DoublyLinkedNode<E> node = front;
        while ( node != null ) {
            node = node.getNext();
            front.setNext( front.getPrevious() );
            front.setPrevious( node );
            if ( node != null )
                front = node;
        }
    }

}
