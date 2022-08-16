package day3;


import java.sql.SQLOutput;

public class BankOfAmericaApp {

    public static void main(String[] args) {

        BankAccount thapaAccount = new BankAccount();

        thapaAccount.getAccountNumber();
        thapaAccount.setBnbNumber("0554");
        thapaAccount.setSocialSecurityNumber("1234567");
        thapaAccount.setAccountHolderName ("Susan Thapa");
        thapaAccount.setAccountType("Checking");
        thapaAccount.setAccountBalance(5000.0);
        thapaAccount.setAddress("Brooklyn NewYork 11556");
        thapaAccount.setConnectedMobileNumber("888-888-8888");


        System.out.println(thapaAccount.getAccountNumber());
        System.out.println(thapaAccount.getBnbNumber());
        System.out.println(thapaAccount.getAccountBalance());
        System.out.println(thapaAccount.getAccountHolderName());
        System.out.println(thapaAccount.getAddress());
        System.out.println(thapaAccount.getConnectedMobileNumber());
        System.out.println(thapaAccount.getAccountType());




        BankAccount friendAccount = new BankAccount();
        friendAccount.getAccountNumber();
        friendAccount.setBnbNumber("0554");
        friendAccount.setSocialSecurityNumber("1234567");
        friendAccount.setAccountHolderName ("Susan Thapa");
        friendAccount.setAccountType("Checking");
        friendAccount.setAccountBalance(2000.0);
        friendAccount.setAddress("Brooklyn NewYork 11554");
        friendAccount.setConnectedMobileNumber("888-888-8889");

        System.out.println(friendAccount.getAccountNumber());
        System.out.println(friendAccount.getBnbNumber());
        System.out.println(friendAccount.getAccountBalance());
        System.out.println(friendAccount.getAccountHolderName());
        System.out.println(friendAccount.getAddress());
        System.out.println(friendAccount.getConnectedMobileNumber());
        System.out.println(friendAccount.getAccountType());



        System.out.println("========Before  Transaction=========");


        BankAccount dummyAccount = new BankAccount();
        dummyAccount.transferBalance(thapaAccount,friendAccount,300);

        System.out.println("=======After Transaction=======");
    }
}
