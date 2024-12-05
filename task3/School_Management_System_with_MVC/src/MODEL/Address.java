package MODEL;

public class Address {
    private String street;   // Represents the street part of the address
    private String postcode; // Represents the postcode part of the address
    private String district; // Represents the district part of the address

    public Address() {
    }

    public Address(String st, String pc, String dist) {
        this.street = st;
        this.postcode = pc;
        this.district = dist;
    }

    @Override
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Address ad = (Address) obj;
        return this.street.equals(ad.street) &&
                this.postcode.equals(ad.postcode) &&
                this.district.equals(ad.district);
    }

    //setter getter done
   

    public void setStreet(String street) {
        this.street = street;
    }
    
     public String getStreet() {
        return street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
     public String getPostcode() {
        return postcode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return 
                "Street : " + street +","+
                "  Postcode : " + postcode +","+
                "  District : " + district + "\n";
    }
}