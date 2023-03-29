/*AddressEmployee.java
 * This is the Address POJO Class
 * Author: Cebisani Lamani
 * Date: 24 March
 */
package za.ac.cput.domain;

public class AddressEmployee {
    private String houseNumber;
    private String  streetNumber;
    private String suburb;
    private String customerID;

    //Default Constructor
    public AddressEmployee(){}
    //Builder object constructor
    public AddressEmployee(Builder builder){
        this.houseNumber = builder.houseNumber;
        this.streetNumber = builder.streetNumber;
        this.suburb = builder.suburb;
        this.customerID  = builder.customerID;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return "AddressEmployee{" +
                "houseNumber='" + houseNumber + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", suburb='" + suburb + '\'' +
                ", customerID='" + customerID + '\'' +
                '}';
    }

    public static class Builder {
        private String houseNumber;
        private String  streetNumber;
        private String suburb;
        private String customerID;

        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder streetNumber(String streetNumber) {
            this.streetNumber= streetNumber;
            return this;
        }

        public Builder suburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder customerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder copy(AddressEmployee addressEmployee){
            this.houseNumber = addressEmployee.houseNumber;
            this.streetNumber = addressEmployee.streetNumber;
            this.suburb = addressEmployee.suburb;
            this.customerID = addressEmployee.customerID;
            return this;
        }
        public AddressEmployee build(){return new AddressEmployee(this);}
    }

}
