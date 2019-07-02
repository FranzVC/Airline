package classes;

public class Flight {
    public String destination;
    public String departure;
    public String flight_date;
    public String flight_time;
    public Integer flight_price;
    public Integer flight_number;

    private boolean availibility;
    private Integer maxPassangers;

    public Flight(String destination, String departure, String flight_date, String flight_time, Integer flight_price, Integer flight_number) {
        availibility = true;
        maxPassangers = 10;
        this.destination = destination;
        this.departure = departure;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_price = flight_price;
        this.flight_number = flight_number;
    }

    public boolean isAvailibility() {
        return availibility;
    }

    public void setAvailibility(boolean availibility) {
        this.availibility = availibility;
    }

    public Integer getMaxPassangers() {
        return maxPassangers;
    }

    public void setMaxPassangers(Integer maxPassangers) {
        this.maxPassangers = maxPassangers;
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
                '}';
    }
}
