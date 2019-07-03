package classes;

public class Flight {
    // What do you think about? if  we can to change from public to private in these two attributes (destination, departure,
    // flight_date, flight_time, flight_price, flight_number)
    // And we can add setters and getters methods
    public String destination;
    public String departure;
    public String flight_date;
    public String flight_time;
    public Integer flight_price;
    public Integer flight_number;

    private boolean availibility;
    private Integer maxPassangers;

    // What do you think about? if  we can to change from public to private in these two attributes (totalPassangers)
    // And we can add setters and getters methods
    // You have a misspelling here please change (totalPassangers) to (totalPassenger)
    public Integer totalPassangers;

    public Flight(String destination, String departure, String flight_date, String flight_time, Integer flight_price, Integer flight_number) {
        availibility = true;
        maxPassangers = 10;
        totalPassangers = 0;
        this.destination = destination;
        this.departure = departure;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_price = flight_price;
        this.flight_number = flight_number;
    }

    // What do you think about? if we change the name of this method to (getAvailability) instead of (isAvailibility), it will correct
    // the misspelling  as well
    public boolean isAvailibility() {
        return availibility;
    }

    // You have a misspelling here please change (setAvailibility) to (setAvailability)
    public void setAvailibility(boolean availibility) {
        this.availibility = availibility;
    }

    // You have a misspelling here please change (getMaxPassangers) to (getMaxPassenger)
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
                ", availibility=" + availibility +
                ", maxPassangers=" + maxPassangers +
                ", totalPassangers=" + totalPassangers +
                '}';
    }
}
