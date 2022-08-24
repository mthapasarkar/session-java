package day9;

import java.sql.SQLOutput;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount Harry = new BankAccount();
        Harry.getAccountNumber();
        Harry.setAccountHolderName("Harry");
        Harry.setAccountType("Checking");
        Harry.setAddress("New York");
        Harry.setSocialSecurityNumber("98765");
        Harry.setConnectedMobileNumber("999999999");
        Harry.setBnbNumber("098");


        System.out.println(Harry.getAccountNumber());
        System.out.println(Harry.getAccountHolderName());
        System.out.println(Harry.getAccountType());
        System.out.println(Harry.getAddress());
        System.out.println(Harry.getBnbNumber());
        System.out.println(Harry.getConnectedMobileNumber());
        System.out.println(Harry.getAccountBalance());


        BankAccount BankAccount3 = new BankAccount("78954535", "Karl","Saving","New york","999999999","8888","123456",573567);

        BankAccount BankAccount4 = new BankAccount("97738836","Tom","Checking","New Jersey","87797979","987","9876789");

        System.out.println(BankAccount3.getAccountBalance());
        System.out.println(BankAccount3.getAccountHolderName());
        System.out.println(BankAccount3.getAccountType());
        System.out.println(BankAccount3.getAccountNumber());
        System.out.println(BankAccount3.getAddress());
        System.out.println(BankAccount3.getBnbNumber());


        System.out.println(BankAccount4.getAccountNumber());
        System.out.println(BankAccount4.getAccountHolderName());
        System.out.println(BankAccount4.getAccountType());
        System.out.println(BankAccount4.getBnbNumber());
        System.out.println(BankAccount4.getConnectedMobileNumber());





    }



}
