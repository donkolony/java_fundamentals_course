package com.example;

import java.util.List;

public class VersionExperiment {

    public static void main(String[] args) {

        // 1. Works in Java 16+
        var numbers = List.of(1, 2, 3);
        var result = numbers.stream().map(n -> n * 2).toList();
        System.out.println(result);

        // 2. Java 21 feature (pattern matching for switch)
        Object obj = 42;

        String message = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown";
        };

        System.out.println(message);

        // 3. Java 21 feature (virtual threads)
        Thread.startVirtualThread(() ->
                System.out.println("Hello from virtual thread")
        );
    }
}