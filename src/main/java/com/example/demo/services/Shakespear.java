package com.example.demo.services;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Shakespear implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("2 B || ! 2 B");
    }
}
