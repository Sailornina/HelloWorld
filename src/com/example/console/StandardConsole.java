package com.example.console;

public class StandardConsole implements Console {
    public void log(String message) {
        System.out.println(message);
    }
}
