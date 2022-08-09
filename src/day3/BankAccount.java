package day3;

import java.security.PrivateKey;

public class BankAccount {

  private   String accountNumber;

   private String accountHolderName;

   private String accountType;

  private   String address;

  private   String connectedMobileNumber;

   private String bnbNumber;

  private   String socialSecurityNumber;

 private    double accountBalance;


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;


    }

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getBnbNumber() {
        return bnbNumber;
    }

    public void setBnbNumber(String bnbNumber) {
        this.bnbNumber = bnbNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", address='" + address + '\'' +
                ", connectedMobileNumber='" + connectedMobileNumber + '\'' +
                ", bnbNumber='" + bnbNumber + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
