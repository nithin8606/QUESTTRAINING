package com.quest.casestudy;

import java.io.*;
import java.util.*;

public class SubscriberManagementSystem implements SubscriberManagement {
    private static Map<String, Subscriber> subscribers = new HashMap<>();
    private static Map<String, List<Call>> callHistory = new HashMap<>();
    private static final String DATA_FILE = "data.txt";

    // Load data from file
    public static void loadData() {
        File file = new File(DATA_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                subscribers = (Map<String, Subscriber>) ois.readObject();
                callHistory = (Map<String, List<Call>>) ois.readObject();
                System.out.println("Data loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading data: " + e.getMessage());
            }
        } else {
            System.out.println("No existing data found, starting fresh.");
        }
    }

    // Save data to file
    public static void saveData() {

        File file = new File(DATA_FILE);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(subscribers);
            oos.writeObject(callHistory);
            System.out.println("Data saved successfully to " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    @Override
    public void addSubscriber(String id, String name, String phoneNumber, String planType, double balance) {
        Subscriber subscriber = new Subscriber(id, name, phoneNumber, planType, balance);
        subscribers.put(id, subscriber);
    }

    @Override
    public void updateBalance(String id, double amount) {
        Subscriber subscriber = subscribers.get(id);
        if (subscriber != null && subscriber.getPlanType().equals("Prepaid")) {
            subscriber.setBalance(subscriber.getBalance() + amount);
        } else {
            System.out.println("Subscriber not found or not a prepaid plan.");
        }
    }

    @Override
    public void recordCall(String id, String callType, double duration) {
        Call call = new Call(callType, duration);
        callHistory.putIfAbsent(id, new ArrayList<>());
        callHistory.get(id).add(call);
    }

    @Override
    public void displaySubscribers() {
        for (Subscriber subscriber : subscribers.values()) {
            System.out.println(subscriber);
        }
    }

    @Override
    public void generateBill(String id) {
        Subscriber subscriber = subscribers.get(id);
        if (subscriber != null && subscriber.getPlanType().equals("Postpaid")) {
            double totalBill = 0;
            List<Call> calls = callHistory.get(id);
            if (calls != null) {
                for (Call call : calls) {
                    switch (call.getCallType()) {
                        case "Local":
                            totalBill += call.getDuration() * 1;
                            break;
                        case "STD":
                            totalBill += call.getDuration() * 2;
                            break;
                        case "ISD":
                            totalBill += call.getDuration() * 5;
                            break;
                    }
                }
            }
            System.out.println("Total Bill for " + id + ": ₹" + totalBill);
        } else {
            System.out.println("Subscriber not found or not a postpaid plan.");
        }
    }

    @Override
    public void displayCallHistory(String id) {
        List<Call> calls = callHistory.get(id);
        if (calls != null) {
            for (Call call : calls) {
                System.out.println(call);
            }
        } else {
            System.out.println("No call history found for " + id);
        }
    }

}
