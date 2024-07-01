
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("SpanishGreetingService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hola";
    }
}
    