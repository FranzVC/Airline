package classes;

public class FlightReservation {

    public String passanger_name;
    public Integer flight_number;
    private Integer reservation_number;

    public FlightReservation() {
    }

    public FlightReservation(String passanger_name, Integer flight_number, Integer reservation_number) {
        this.passanger_name = passanger_name;
        this.flight_number = flight_number;
        this.reservation_number = reservation_number;
    }

    public Integer getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(Integer reservation_number) {
        this.reservation_number = reservation_number;
    }
}
