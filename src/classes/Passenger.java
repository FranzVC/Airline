package classes;

public class Passenger {
    private String name;
    private String address;
    private Integer social_security_number;

    public Passenger() {
    }

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

    public void requestFlight()
    {
        //implementation
    }

    public void payForTicket()
    {
        //implementation
    }

}
