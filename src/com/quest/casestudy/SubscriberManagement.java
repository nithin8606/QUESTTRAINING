package com.quest.casestudy;

public interface SubscriberManagement {
    void addSubscriber(String id, String name, String phoneNumber, String planType, double balance);
    void updateBalance(String id, double amount);
    void recordCall(String id, String callType, double duration);
    void displaySubscribers();
    void generateBill(String id);
    void displayCallHistory(String id);
}
