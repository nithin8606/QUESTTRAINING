package com.quest.casestudy.casestudy25;
import java.time.LocalDateTime;
import java.io.Serializable;
public class ServiceBooking implements Cloneable,Serializable {
    private String bookingId;
    private Customer customer;
    private LocalDateTime serviceDate;
    private String serviceType;
    private double cost;

    public ServiceBooking(String bookingId, Customer customer, LocalDateTime serviceDate, String serviceType, double cost) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.serviceDate = serviceDate;
        this.serviceType = serviceType;
        this.cost = cost;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getServiceDate() {
        return serviceDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getCost() {
        return cost;
    }

    // Clone method to create a discounted service booking
    @Override
    public ServiceBooking clone() {
        try {
            ServiceBooking clonedBooking = (ServiceBooking) super.clone();
            clonedBooking.cost = this.cost * 0.85; // Applying 15% discount
            return clonedBooking;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Service Date: " + serviceDate + ", Service Type: " + serviceType + ", Cost: " + cost;
    }
}
