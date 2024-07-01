
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("EnglishGreetingService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello";
    }
}
    