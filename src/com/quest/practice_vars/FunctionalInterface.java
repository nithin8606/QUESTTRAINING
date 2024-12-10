package com.quest.practice_vars;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {

        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        Function<Integer, Integer> processNumber = n -> isEven.test(n) ? n * n : n * 2;

        Consumer<Integer> printResult = result -> System.out.println("Result: " + result);

        int number = randomSupplier.get();
        System.out.println("Generated number: " + number);

        int result = processNumber.apply(number);
        printResult.accept(result);
    }
}

