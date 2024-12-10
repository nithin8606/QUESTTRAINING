package com.quest.casestudy.casestudy25;

import java.util.*;

public class ServiceCenter<T> {
    private Set<T> servicedVehicles = new HashSet<>();

    public void addServicedVehicle(T vehicle) {
        servicedVehicles.add(vehicle);
    }

    public Set<T> getAllServicedVehicles() {
        return servicedVehicles;
    }
}

