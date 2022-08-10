package day3;


public class BankOfAmericaApp {

    public static void main(String[] args) {

        BankAccount thapaAccount = new BankAccount();

        thapaAccount.getAccountNumber();
        thapaAccount.setBnbNumber("0554");
        thapaAccount.setSocialSecurityNumber("1234567");
        thapaAccount.setAccountHolderName ("Susan Thapa");
        thapaAccount.setAccountType("Checking");
        thapaAccount.setAccountBalance(5000.0);
        thapaAccount.setAddress("60 seneca av Brooklyn NewYork 11556");
        thapaAccount.setConnectedMobileNumber("888-888-8888");


        System.out.println(thapaAccount.getAccountNumber());
        System.out.println(thapaAccount.getBnbNumber());
        System.out.println(thapaAccount.getAccountBalance());
        System.out.println(thapaAccount.getAccountHolderName());
        System.out.println(thapaAccount.getAddress());
        System.out.println(thapaAccount.getConnectedMobileNumber());
        System.out.println(thapaAccount.getAccountType());






    }
}
