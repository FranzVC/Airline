package classes;

import java.util.ArrayList;
import java.util.List;

public class TicketVendor {
    /*private Airline airline;
    public TicketVendor(Airline airline) {
        this.airline = airline;
    }*/

    public List<Ticket> ticketsSold = new ArrayList<>();

    private Integer reservation_number;

    public TicketVendor()
    {
        reservation_number = 0;
    }
                                                        // This variable name has misspelling need to change (passenger_name)
    protected Ticket reserveFlight(Integer flight_number, String passanger_name,Airline airline)
    {
        FlightReservation flightReservation = new FlightReservation(passanger_name,flight_number,reservation_number++);
        Flight flight = airline.confirmBooking(flightReservation);
        if(flight!=null) {
            Ticket ticket = new Ticket(airline.name, flight.flight_price, flight.flight_date, flight.flight_time, flight.flight_number, reservation_number++);
            ticketsSold.add(ticket);
            return ticket;
        }else
        {
            return null;
        }

    }

    protected void checkAvailability(Airline airline)
    {
        airline.provideFlightDetailsAvailibles();
    }

    protected Flight checkAvailability(Airline airline,Integer flight_number)
    {
        return airline.provideFlight(flight_number);
    }
}
