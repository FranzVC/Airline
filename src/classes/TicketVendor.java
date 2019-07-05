package classes;

import java.util.ArrayList;
import java.util.List;

public class TicketVendor {
    /*private Airline airline;
    public TicketVendor(Airline airline) {
        this.airline = airline;
    }*/

    private List<Ticket> ticketsSold = new ArrayList<>();

    private Integer reservation_number;

    public TicketVendor()
    {
        reservation_number = 0;
    }

    protected Ticket reserveFlight(Integer flight_number, String passenger_name,Airline airline)
    {
        FlightReservation flightReservation = new FlightReservation(passenger_name,flight_number,reservation_number++);
        Flight flight = airline.confirmBooking(flightReservation);
        if(flight!=null) {
            Ticket ticket = new Ticket(airline.getName(), flight.getFlight_price(), flight.getFlight_date(), flight.getFlight_time(), flight.getFlight_number(), reservation_number++);
            ticketsSold.add(ticket);
            return ticket;
        }else
        {
            return null;
        }

    }

    protected void checkAvailability(Airline airline)
    {
        airline.provideFlightDetailsAvailables();
    }

    protected Flight checkAvailability(Airline airline,Integer flight_number)
    {
        return airline.provideFlight(flight_number);
    }
}
