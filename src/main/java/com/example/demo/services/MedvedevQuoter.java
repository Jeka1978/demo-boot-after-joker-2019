package com.example.demo.services;

import com.example.demo.services.Quoter;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MedvedevQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Держитесь там, только денег там");
    }
}
