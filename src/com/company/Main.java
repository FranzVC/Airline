package com.company;

import classes.Airline;
import classes.Flight;

public class Main {

    public static void main(String[] args) {
        Flight f1 = new Flight("la paz","cocha","12/12/19","14:16",1000,15);
        Airline a1 = new Airline();

        a1.newFlight(f1);
        a1.provideFlightDetails(f1.flight_number);


    }
}
