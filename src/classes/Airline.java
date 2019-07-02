package classes;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    public String name;
    public boolean reservation_availability;
    private List<Flight> flightArray = new ArrayList<>();
    private List<FlightReservation> flightReservationList = new ArrayList<>();
    private List<TicketVendor> ticketVendorList = new ArrayList<>();

    public void provideFlightDetails(Integer flight_number)
    {
        for (Flight flight:flightArray)
        {
            if(flight.flight_number==flight_number )
                System.out.printf(flight.toString());
                System.out.println();
        }
    }

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

    public boolean confirmBooking(FlightReservation flightReservation)
    {
        for (Flight flight:flightArray)
        {
            //si hay espacio en el vuelo
            if(flight.flight_number==flightReservation.flight_number && flight.getMaxPassangers()>0){
                flightReservationList.add(flightReservation);
                flight.setMaxPassangers(flight.getMaxPassangers()-1);
                return true;
            }
            if (flight.getMaxPassangers()<=0)
            {
                flight.setAvailibility(false);
                return false;
            }
        }
        return false;
    }

    public void newFlight(Flight flight)
    {
        flightArray.add(flight);
    }

    public void newTicketVendor(TicketVendor ticketVendor)
    {
        ticketVendorList.add(ticketVendor);
    }

}
