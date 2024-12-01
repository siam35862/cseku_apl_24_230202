/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author MSI-USER
 */
public class Address {
    private String street;   // Represents the street part of the address
    private String postcode; // Represents the postcode part of the address
    private String district; // Represents the district part of the address

    
    public Address()
    {
        
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

   
    public String getRoad() {
        return street;
    }

   
    public String getPostcode() {
        return postcode;
    }

    
    public String getDistrict() {
        return district;
    }

   
    @Override
    public String toString() {
        return "Address : " + "\n" +
                "        Road : " + street + "\n" +
                "        Postcode : " + postcode + "\n" +
                "        District : " + district + "\n";
    }
}
