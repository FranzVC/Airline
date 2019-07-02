package classes;

public class TicketVendor {
    /*private Airline airline;

    public TicketVendor(Airline airline) {
        this.airline = airline;
    }*/

    protected void reserveFlight(Integer flight_number, String passanger_name, Integer reservation_number,Airline airline)
    {
        FlightReservation flightReservation = new FlightReservation(passanger_name,flight_number,reservation_number);
        airline.confirmBooking(flightReservation);
    }

    protected void checkAvailability(Airline airline)
    {
        airline.provideFlightDetailsAvailibles();
    }


}
