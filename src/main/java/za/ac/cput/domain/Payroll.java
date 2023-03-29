/*Payroll.java
 * This is the Payroll POJO Class
 * Author: Cebisani Lamani
 * Date: 24 March
 */
package za.ac.cput.domain;

public class Payroll {
    private String employeeID;
    private Double hoursWorked;
    private Double rate;
    private String bankAccount;

    //Default Constructor
    public Payroll(){}
    //Builder object constructor
    public Payroll(Builder builder){
        this.employeeID = builder.employeeID;
        this.hoursWorked = builder.hoursWorked;
        this.rate = builder.rate;
        this.bankAccount  = builder.bankAccount;
    }

    //Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public Double getRate() {
        return rate;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "employeeID='" + employeeID + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", rate=" + rate +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }
    public static class Builder {
        private String employeeID;
        private Double hoursWorked;
        private Double rate;
        private String bankAccount;

        public Builder employeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder hoursWorked(Double hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder rate(Double rate) {
            this.rate = rate;
            return this;
        }

        public Builder bankAccount(String bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        public Builder copy(Payroll payroll){
            this.employeeID = payroll.employeeID;
            this.hoursWorked = payroll.hoursWorked;
            this.rate = payroll.rate;
            this.bankAccount = payroll.bankAccount;
            return this;
        }

        public Payroll build(){return new Payroll(this);}

    }
}
