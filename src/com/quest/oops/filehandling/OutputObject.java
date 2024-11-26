package com.quest.fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutputObject {

    public static void main(String[] args) {

        String s1 = "Added Content";

        try {
            // Appending content to the file using BufferedOutputStream
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file4.txt", true));
            bos.write(s1.getBytes(StandardCharsets.UTF_8)); // Added StandardCharsets.UTF_8 for encoding
            bos.close();

            System.out.println("Buffered data is added successfully");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file4.txt"));
            int c;

            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
            bis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new RuntimeException("I/O error occurred: " + e.getMessage(), e);
        }
    }
}