package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle aircraft = new Aircraft();

        Vehicle[] vehicles = new Vehicle[]{bus, train, aircraft};
        for (Vehicle a : vehicles) {
            a.move();
        }

        Vehicle busEngine = new Bus();
        Vehicle trainEngine = new Train();
        Vehicle aircraftEngine = new Aircraft();

        Vehicle[] vehiclesEngines = new Vehicle[]{busEngine, trainEngine, aircraftEngine};
        for (Vehicle a : vehiclesEngines) {
            a.enginetype();
        }
    }
}