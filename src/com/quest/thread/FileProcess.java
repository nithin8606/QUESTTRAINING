package com.quest.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcess {
    public static void main(String[] args) {

        String[] files = {"file1.txt", "file2.txt", "file4.txt"};

        for (String file : files) {
            Thread thread = new Thread(new FileProcessor(file));
            thread.start();
        }
    }
}

class FileProcessor implements Runnable {
    private String fileName;


    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        readFile(fileName);
    }

    public void readFile(String fileName) {
        try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from: " + fileName);
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName);
        }
    }
}
