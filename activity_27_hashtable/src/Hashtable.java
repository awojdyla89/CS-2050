/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Motaimport java.util.*;
 * Description: Activity 27 - Hashtable class
 */

import java.util.Iterator;
import java.util.Queue;

public class Hashtable<K, V> implements Iterable<T> {

    private static final int SIZE = 17;
    private HashNode<K, V>[] table;

    public Hashtable() {
        table = new HashNode[SIZE];
    }

    // TODO: finish the implementation of the method
    public void put(K key, V value) {

        // index points to the location in the table
        int index = key.hashCode() % SIZE;

        // TODO: create a new HashNode from (key, value)
        HashNode<K, V> newNode = new HashNode(key, value);

        // TODO: if table @ index is unoccupied, have the location point to the new node
        if (table[index] == null)
            table[index] = newNode;

            // TODO: otherwise, search the hash nodes at the location for one with the same key
        else {
            HashNode<K, V> current = table[index];
            while (!current.getKey().equals(key) && current.getNext() != null) {
                current = current.getNext();

            }

            // TODO: if found, rewrite the value of hash node
            if (current.getKey().equals(key))
                current.setValue(value);
                // TODO: if not found, add the new hash node at the end of the list
            else {
                current.setNext(newNode);
            }
        }
    }

    // TODO: finish the implementation of the method
    public V get(K key) {

        // index points to the location in the table
        int index = key.hashCode() % SIZE;

        // TODO: get the hash node at table @ index
        HashNode<K,V> current = table[index];

        // TODO: try to find a hash node with the same key and if found, return the hash node's
        //  value
            while(current != null){
                if(current.getKey().equals(key))
                    return current.getValue();
            }

        // if not found, the method returns null
        return null;
    }



    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                str += "[" + i + "]: ";
                HashNode<K, V> current = table[i];
                while (current != null) {
                    str += current.toString() + " ";
                    current = current.getNext();
                }
                str += "\n";
            }
        }
        return str;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            Queue<HashNode<K,V>> heads;

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public K next() {
                return null;
            }
        };
    }
}
