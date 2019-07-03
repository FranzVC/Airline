package classes;

public class FlightReservation {

    private String passenger_name;
    private Integer flight_number;
    private Integer reservation_number;

    public FlightReservation() {
    }

    public FlightReservation(String passenger_name, Integer flight_number, Integer reservation_number) {
        this.passenger_name = passenger_name;
        this.flight_number = flight_number;
        this.reservation_number = reservation_number;
    }

    public Integer getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(Integer reservation_number) {
        this.reservation_number = reservation_number;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }
}
