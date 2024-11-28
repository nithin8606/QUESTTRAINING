package com.quest.filehandling;

import java.io.*;

public class BufferedClass {

    public static void main(String[] args) {

        String str = "Hello World";

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File1.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File2.txt"));

            byte[] buf = new byte[1024];
            int c;

            while ((c = bis.read(buf)) != -1) {
                bos.write(buf, 0, c);
                System.out.print(new String(buf, 0, c));
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//BufferedInputStream is used to read data from an underlying InputStream (e.g., FileInputStream) in a more efficient manner by using a buffer.
//read(): Reads a single byte of data from the stream.
//read(byte[] b): Reads an array of bytes into a buffer.
//available(): Returns the number of bytes that can be read without blocking.
//skip(long n): Skips over n bytes of data.
//close(): Closes the stream and releases resources.
//BufferedOutputStream is used to write data to an underlying OutputStream (e.g., FileOutputStream) in a more efficient manner by using a buffer.
//write(int b): Writes a single byte of data to the stream.
//write(byte[] b): Writes an array of bytes to the stream.
//flush(): Forces any buffered data to be written to the underlying stream.