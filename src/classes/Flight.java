package classes;

public class Flight {
    private String destination;
    private String departure;
    private String flight_date;
    private String flight_time;
    private Integer flight_price;
    private Integer flight_number;

    private boolean availability;
    private Integer maxPassengers;
    private Integer totalPassengers;

    public Flight(String destination, String departure, String flight_date, String flight_time, Integer flight_price, Integer flight_number) {
        availability = true;
        maxPassengers = 10;
        totalPassengers = 0;
        this.destination = destination;
        this.departure = departure;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_price = flight_price;
        this.flight_number = flight_number;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", flight_date='" + flight_date + '\'' +
                ", flight_time='" + flight_time + '\'' +
                ", flight_price=" + flight_price +
                ", flight_number=" + flight_number +
                ", availability=" + availability +
                ", maxPassengers=" + maxPassengers +
                ", totalPassengers=" + totalPassengers +
                '}';
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Integer getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(Integer totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public Integer getFlight_price() {
        return flight_price;
    }

    public void setFlight_price(Integer flight_price) {
        this.flight_price = flight_price;
    }
}
