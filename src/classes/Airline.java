package classes;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    // What do you think? if  we can to change from public to private in these two attributes (name, reservation_availability)
    // And we can add setters and getters methods
    public String name;
    public boolean reservation_availability;

    private List<Flight> flightArray = new ArrayList<>();
    private List<FlightReservation> flightReservationList = new ArrayList<>();
    private List<TicketVendor> ticketVendorList = new ArrayList<>();

    public Airline(String name){
        reservation_availability = true;
        this.name = name;
    }
    public Flight provideFlight(Integer flight_number)
    {
        for (Flight flight:flightArray)
        {
            // What do you think? if we can to change (==) operator instead of equal method
            if(flight.flight_number==flight_number ) {
                return flight;
            }
        }
        return null;
    }

    // You have a misspelling here it should be isFlightAvailable instead of isFlightAvailible
    public boolean isFlightAvailible(Integer flight)
    {
        for (Flight f:flightArray)
        {
            // What do you think? if we can to change (==) operator instead of equal method
            if(f.flight_number==flight && f.isAvailibility()) {
                return true;
            }
        }
        return false;
    }

    // You have a misspelling here it should be isFlightAvailable instead of isFlightAvailible
    public void provideFlightDetailsAvailibles()
    {
        for (Flight flight:flightArray)
        {
            if(flight.isAvailibility()) {
                System.out.printf(flight.toString());
                System.out.println();
            }
        }
    }

    public Flight confirmBooking(FlightReservation flightReservation)
    {
        for (Flight flight:flightArray)
        {
            //si hay espacio en el vuelo
            // What do you think? if we can to change (==) operator instead of equal method
            if(flight.flight_number==flightReservation.flight_number && flight.getMaxPassangers()>flight.totalPassangers){
                flightReservationList.add(flightReservation);
                flight.totalPassangers++;
                return flight;
            }
            if (flight.totalPassangers>=flight.getMaxPassangers())
            {
                flight.setAvailibility(false);
                return null;
            }
        }
        return null;
    }

    public void newFlight(String destination, String departure, String flight_date, String flight_time, Integer flight_price, Integer flight_number)
    {
        Flight flight = new Flight( destination, departure, flight_date, flight_time, flight_price, flight_number);
        flightArray.add(flight);
    }

    public void newTicketVendor(TicketVendor ticketVendor)
    {
        ticketVendorList.add(ticketVendor);
    }

}
