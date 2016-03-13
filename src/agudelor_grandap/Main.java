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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Character> list = new DoublyLinkedList<>();
        
        String str = "Escriba una clase DoublyLinkedList (Lista doblemente enlazada).";
        //String str = "Esc";
        for ( int i = 0; i < str.length(); i++ ) {
            list.add(str.charAt(i));
        }
        
        printList(list);
        list.reverse();
        printList(list);
        list.reverse();
        
        print("\nsize: " + list.size() + " str.size:" + str.length());
        list.remove( new Character('E'));
        list.remove( new Character('.'));
        list.remove( new Character('('));
        printList(list);

        list.remove(6);
        list.remove( 0 );
        list.remove( list.size() - 1 );
        printList(list);
        
        list.add(0,'E');
        list.add(1,'s');
        list.add(list.size() - 1, '&');
        list.add(list.size(), ')');
        list.add(list.size(), '.');

        list.add(7, ' ');
        printList(list);
        
        list.set(0, 'e');
        list.set(list.size() - 1, '?');
        list.set(7, '_');
        printList(list);
        
        
        str = list.get(0).toString() + " ";
        str += list.get(list.size() - 1).toString() + " ";
        str += list.get(7);
        print(str);
        
        list.add(0, '!');
        print("contains c:" + list.contains('c'));
        print("contains !:" + list.contains('!'));
        print("contains ?:" + list.contains('?'));
        print("contains ?:" + list.contains('0'));
        
        while ( list.size() != 0 ) {
            list.remove( (list.size() - 1) / 2 );
        }
        print("\nsize: " + list.size() + " str.size:" + str.length());

    }
    
    public static void printList(List list) {
        System.out.println("");
        for ( int i = 0; i < list.size(); i++ )
            System.out.print(list.get(i));
        System.out.println("");
    }
    
    public static void print(String str) {
        System.out.println(str);
    }
}
