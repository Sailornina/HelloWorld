package com.example.console;

public class ConsoleFactory {
    public static Console create() {
        return new FileConsole();
    }
}
