package com.quest.fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class OutputObject {

    public static void main(String[] args) {

        String s1 = "Added Content";

        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File2.txt", true));
            bos.write(s1.getBytes());


            System.out.println("Buffered data is added successfully");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File2.txt"));
            int c;

            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//HashMap
//List:
//
//Allows duplicates.
//Maintains insertion order.
//Can access elements by index.
//        Set:
//
//Does not allow duplicates.
//Does not guarantee any specific order, except in LinkedHashSet (insertion order) or TreeSet (sorted order).
//Queue:
//
//Used for storing elements to be processed in a particular order (usually FIFO).
//Deque allows for insertion and removal at both ends.
//Map:
//
//Stores key-value pairs.
//Keys must be unique.
//Values can be duplicated.
//Collection Methods (Commonly Used)
//add(): Adds an element to the collection.
//remove(): Removes an element from the collection.
//contains(): Checks if an element exists in the collection.
//size(): Returns the number of elements in the collection.
//clear(): Removes all elements from the collection.
//isEmpty(): Checks if the collection is empty.
//Collection Framework provides a set of classes and interfaces that implement commonly used data structures like lists, sets, queues, and maps. The Collection Framework makes it easy to store, retrieve, and manipulate data in various forms