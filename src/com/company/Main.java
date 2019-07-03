package com.company;

import classes.*;

public class Main {

    public static void main(String[] args) {
        Airline a1 = new Airline("BOA");
        TicketVendor ticketVendor= new TravelAgent("jose","sevilla");
        TicketVendor ticketVendor1 = new AirlineTicketVendor(a1,a1.getName(),"dasfdgfs");


        a1.newFlight("la paz","cocha","12/12/19","14:16",1000,15);
        a1.newTicketVendor(ticketVendor);
        a1.newTicketVendor(ticketVendor1);

        Passenger passenger = new Passenger("juan","perez",123);

        passenger.isFlightAvailable(15,a1);

        Flight flight = a1.provideFlight(15);
        passenger.getTotalPassengerOfFlight(a1,flight);

        passenger.requestFlightsAvailables(a1);

        passenger.payForTicket(ticketVendor,15,passenger.getName(),a1);


    }
}
