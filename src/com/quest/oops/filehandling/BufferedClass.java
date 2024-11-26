package com.quest.filehandling;

import java.io.*;

public class BufferedClass {

    public static void main(String[] args) {

        String str = "Hello World";

        try {
            // Writing the string to a file using BufferedOutputStream
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File1.txt"));
            bos.write(str.getBytes());
            bos.close();

            // Reading the file content using BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File1.txt"));
            byte[] buf = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buf)) != -1) {
                System.out.print(new String(buf, 0, bytesRead));
            }
            bis.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}