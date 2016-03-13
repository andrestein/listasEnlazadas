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
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
        List<Character> list = new DoublyLinkedList<>();

        String str = "Escriba una clase DoublyLinkedList (Lista doblemente enlazada).";
        //String str = "Esc";
        for ( int i = 0; i < str.length(); i++ )
            list.add( str.charAt( i ) );

        printList( list );

        println( "reverse:" );
        list.reverse();
        printList( list );

        println( "reverse:" );
        list.reverse();
        printList( list );

        println( "list isEmpty: " + list.isEmpty() 
                + " size: " + list.size() 
                + " str.size:" + str.length() );

        println( "removing:" );
        list.remove( new Character( 'E' ) );
        list.remove( new Character( '.' ) );
        list.remove( new Character( '(' ) );
        printList( list );

        println( "removing with index:" );
        list.remove( 6 );
        list.remove( 0 );
        list.remove( list.size() - 1 );
        printList( list );

        println( "add:" );
        list.add( 0, 'E' );
        list.add( 1, 's' );
        list.add( list.size() - 1, '&' );
        list.add( list.size(), ')' );
        list.add( list.size(), '.' );
        list.add( 7, ' ' );
        printList( list );

        println( "set:" );
        list.set( 0, 'e' );
        list.set( list.size() - 1, '?' );
        list.set( 7, '_' );
        printList( list );

        println( "get:" );
        String str1 = list.get( 0 ).toString() + " ";
        str1 += list.get( list.size() - 1 ).toString() + " ";
        str1 += list.get( 7 );
        println( str1 );

        list.add( 0, '!' );
        println( "contains: " );
        println( "contains c:" + list.contains( 'c' ) );
        println( "contains !:" + list.contains( '!' ) );
        println( "contains ?:" + list.contains( '?' ) );
        println( "contains ?:" + list.contains( '0' ) );

        println( "\nremoving all:" );
        while ( list.size() != 0 )
            print( list.remove( (list.size() - 1) / 2 ) + " " );
        
        println( "\nlist isEmpty: " + list.isEmpty() 
                + " size: " + list.size() 
                + " str.size:" + str.length() );

    }

    public static void printList( List list ) {
        for ( int i = 0; i < list.size(); i++ )
            System.out.print( list.get( i ) );
        System.out.println( "\n" );
    }

    public static void println( String str ) {
        System.out.println( str );
    }

    public static void print( String str ) {
        System.out.print( str );
    }

}
