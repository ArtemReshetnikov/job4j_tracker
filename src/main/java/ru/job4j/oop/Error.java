package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error(){
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + "code " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 101, "Hello, i'm here!");
        error.printInfo();
        Error empty = new Error();
        empty.printInfo();
    }
}