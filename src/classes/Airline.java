package classes;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String name;
    private boolean reservation_availability;
    private List<Flight> flightArray = new ArrayList<>();
    private List<FlightReservation> flightReservationList = new ArrayList<>();
    private List<TicketVendor> ticketVendorList = new ArrayList<>();

    public List<Flight> getFlightArray() {
        return flightArray;
    }

    public List<FlightReservation> getFlightReservationList() {
        return flightReservationList;
    }

    public List<TicketVendor> getTicketVendorList() {
        return ticketVendorList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReservation_availability() {
        return reservation_availability;
    }

    public void setReservation_availability(boolean reservation_availability) {
        this.reservation_availability = reservation_availability;
    }

    public Airline(String name){
        reservation_availability = true;
        this.name = name;
    }
    public Flight provideFlight(Integer flight_number)
    {
        for (Flight flight:flightArray)
        {
            if(flight.getFlight_number().equals(flight_number) ) {
                return flight;
            }
        }
        return null;
    }

    public boolean isFlightAvailable(Integer flight)
    {
        for (Flight f:flightArray)
        {
            if(f.getFlight_number().equals(flight) && f.isAvailability()) {
                return true;
            }
        }
        return false;
    }

    public void provideFlightDetailsAvailables()
    {
        for (Flight flight:flightArray)
        {
            if(flight.isAvailability()) {
                System.out.println(flight.toString());
            }
        }
    }

    public Flight confirmBooking(FlightReservation flightReservation)
    {
        for (Flight flight:flightArray)
        {
            if(flight.getFlight_number().equals(flightReservation.getFlight_number())&& flight.getMaxPassengers()>flight.getTotalPassengers()){
                flightReservationList.add(flightReservation);
                flight.setTotalPassengers(flight.getTotalPassengers()+1);
                return flight;
            }
            if (flight.getTotalPassengers()>=flight.getMaxPassengers())
            {
                flight.setAvailability(false);
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
