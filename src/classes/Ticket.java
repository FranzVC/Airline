package classes;

public class Ticket {
    private String airline_name;
    private Integer ticket_price;
    private String flight_date;
    private String flight_time;
    private Integer flight_number;
    private Integer ticket_number;

    public Ticket(String airline_name, Integer ticket_price, String flight_date, String flight_time, Integer flight_number, Integer ticket_number) {
        this.airline_name = airline_name;
        this.ticket_price = ticket_price;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_number = flight_number;
        this.ticket_number = ticket_number;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "airline_name='" + airline_name + '\'' +
                ", ticket_price=" + ticket_price +
                ", flight_date='" + flight_date + '\'' +
                ", flight_time='" + flight_time + '\'' +
                ", flight_number=" + flight_number +
                ", ticket_number='" + ticket_number + '\'' +
                '}';
    }
}
