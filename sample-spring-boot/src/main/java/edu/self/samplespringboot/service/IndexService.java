package edu.self.samplespringboot.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {
    public String getIndexString() {
        return "Hello SpringBoot from Service Class.";
    }
}