package schoolManagementSystem;

/**
 * Address class represents an address with a street, postcode, and district.
 * This class adheres to the Single Responsibility Principle (SRP) by focusing
 * solely on the management of address-related details.
 */
public class Address {
    private String street;   // Represents the street part of the address
    private String postcode; // Represents the postcode part of the address
    private String district; // Represents the district part of the address

    /**
     * Constructs an Address with the specified details.
     *
     * @param st   the street of the address
     * @param pc   the postcode of the address
     * @param dist the district of the address
     */
    public Address(String st, String pc, String dist) {
        this.street = st;
        this.postcode = pc;
        this.district = dist;
    }

    /**
     * Compares this Address with another object for equality.
     *
     * @param obj the object to compare with
     * @return true if the given object is an Address with the same street,
     *         postcode, and district as this Address; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Address ad = (Address) obj;
        return this.street.equals(ad.street) &&
                this.postcode.equals(ad.postcode) &&
                this.district.equals(ad.district);
    }

    /**
     * Retrieves the street part of the address.
     *
     * @return the street of the address
     */
    public String getRoad() {
        return street;
    }

    /**
     * Retrieves the postcode part of the address.
     *
     * @return the postcode of the address
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Retrieves the district part of the address.
     *
     * @return the district of the address
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Returns a string representation of the address details.
     *
     * @return a formatted string with address information
     */
    @Override
    public String toString() {
        return "Address : " + "\n" +
                "        Road : " + street + "\n" +
                "        Postcode : " + postcode + "\n" +
                "        District : " + district + "\n";
    }
}
