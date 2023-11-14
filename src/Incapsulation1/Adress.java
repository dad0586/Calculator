package Incapsulation1;

public class Adress {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
    private String phone;
    private String website;

    public Adress(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
        this.phone = phone;
        this.website = website;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
