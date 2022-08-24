package day9;

public class BankAccount {

    private  String accountNumber;

    private String accountHolderName;

    private String accountType;

    private String address;

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    private String  connectedMobileNumber;


    public BankAccount() {}

    public BankAccount(String accountNumber, String accountHolderName, String accountType, String address, String connectedMobileNumber, String bnbNumber, String socialSecurityNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.address = address;
        this.connectedMobileNumber = connectedMobileNumber;
        this.bnbNumber = bnbNumber;
        this.socialSecurityNumber = socialSecurityNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountNumber, String accountHolderName, String accountType, String address, String connectedMobileNumber, String bnbNumber, String socialSecurityNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.address = address;
        this.connectedMobileNumber = connectedMobileNumber;
        this.bnbNumber = bnbNumber;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    public String getBnbNumber() {
        return bnbNumber;
    }

    public void setBnbNumber(String bnbNumber) {
        this.bnbNumber = bnbNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private String bnbNumber;

    private String socialSecurityNumber;

    private  double accountBalance;




    }

