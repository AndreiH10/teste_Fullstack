package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Esta linha é mágica, ela liga o Spring!
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}