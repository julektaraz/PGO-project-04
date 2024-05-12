public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String streetName;
    private String apartmentNumber;

    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    public String createAddress(String country, String city, String postalCode, String streetName) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s");
    }
}