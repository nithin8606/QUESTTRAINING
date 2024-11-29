package com.quest.oops.collection;

import java.net.http.HttpRequest;
import java.util.*;

public class MainEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee(101, "Nithin", 75000, "HR");
        Employee e2 = new Employee(102, "Nithinkrishna", 80000, "Finance");
        Employee e3 = new Employee(103, "Nk", 70000, "IT");
        Employee e4 = new Employee(104, "Nithink", 85000, "HR");

        List<Integer> ids = new ArrayList<>();
        ids.add(e1.getId());
        ids.add(e2.getId());
        ids.add(e3.getId());
        ids.add(e4.getId());
        ids.forEach(System.out::println);


        Map<Integer, String> nameMap = new HashMap<>();
        nameMap.put(e1.getId(), e1.getName());
        nameMap.put(e2.getId(), e2.getName());
        nameMap.put(e3.getId(), e3.getName());
        nameMap.put(e4.getId(), e4.getName());
        nameMap.forEach((k, v) -> System.out.println(k + ": " + v));

        Queue<Double> salaryQueue = new PriorityQueue<>();
        salaryQueue.add(e1.getSalary());
        salaryQueue.add(e2.getSalary());
        salaryQueue.add(e3.getSalary());
        salaryQueue.add(e4.getSalary());
        salaryQueue.forEach(System.out::println);
        salaryQueue.poll();
        salaryQueue.forEach(System.out::println);

        Set<String> departments = new HashSet<>();
        departments.add(e1.getDepartment());
        departments.add(e2.getDepartment());
        departments.add(e3.getDepartment());
        departments.add(e4.getDepartment());
        departments.forEach(department -> System.out.println("Department: " + department));
    }
}
