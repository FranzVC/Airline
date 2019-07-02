package classes;

public class TravelAgent extends TicketVendor{

    private String vendor_name;
    private String vendor_address;

    public TravelAgent(String vendor_name, String vendor_address) {
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }
}
