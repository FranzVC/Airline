package classes;


public class AirlineTicketVendor extends TicketVendor {

    private String airline_name;
    private String airline_address;

    public AirlineTicketVendor(Airline airline, String airline_name, String airline_address) {
        this.airline_name = airline.getName();
        this.airline_address = airline_address;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getAirline_address() {
        return airline_address;
    }

    public void setAirline_address(String airline_address) {
        this.airline_address = airline_address;
    }
}
