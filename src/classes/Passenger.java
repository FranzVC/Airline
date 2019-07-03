package classes;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private String address;
    private Integer social_security_number;

    private List<Ticket> ticketsPurchased = new ArrayList<>();

    public Passenger(String name, String address, Integer social_security_number) {
        this.name = name;
        this.address = address;
        this.social_security_number = social_security_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSocial_security_number() {
        return social_security_number;
    }

    public void setSocial_security_number(Integer social_security_number) {
        this.social_security_number = social_security_number;
    }


    // You have a misspelling here please change (requestFlightsAvailibles) to (getFlightsAvailable)
    public void requestFlightsAvailibles(Airline airline)
    {
        airline.provideFlightDetailsAvailibles();
    }

    public void payForTicket(TicketVendor ticketVendor,Integer flight_number, String passanger_name,Airline airline)
    {
        Ticket ticket = ticketVendor.reserveFlight(flight_number, passanger_name, airline);
        if (ticket != null)
        {
            System.out.println("HERE IS YOUR TICKET");
            System.out.println(ticket.toString());
            ticketsPurchased.add(ticket);
        }
        else
        {
            System.out.println("Flight no availible");
        }
    }

    // You have a misspelling here please change (passangersOfFlight) to (getTotalPassengerOfFlight), what do you think about?
    public void passangersOfFlight(Airline airline,Flight flight){
        System.out.println("total passangers: "+airline.provideFlight(flight.flight_number).totalPassangers+"  flight: "+ flight.flight_number);
    }

    // Misspelling here please change it to (isFlightAvailable)
    public void isFlightAvailible(Integer flight_number, Airline airline){
        if(airline.isFlightAvailible(flight_number))
        {
            System.out.println("Flight "+flight_number+" is availible");
        }
        else
        {
            System.out.println("Flight "+flight_number+" is not availible");
        }
    }
}
