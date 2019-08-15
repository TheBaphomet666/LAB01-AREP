package com.arep;

import com.arep.model.LinkedList;
import com.arep.model.Node;
import org.javatuples.Pair;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        LinkedList<Double> l =new LinkedList<Double>();
        l.add(new Node(2.2));
        System.out.println(l.getSize());
        l.add(new Node(2.3));
        l.add(new Node(2.4));
        l.add(new Node(2.5));
        System.out.println(l.getSize());
        System.out.println(l.getLast());
        System.out.println(l);
        l.remove(0);
    }
}
