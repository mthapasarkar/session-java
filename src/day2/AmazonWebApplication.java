package day2;

public class AmazonWebApplication {

    public static void main(String[] args) {
        Mobile iphone12 = new Mobile();

      //  iphone12.brand="apple";
        iphone12.setBrand("apple");

        //iphone12.color ="red";
        iphone12.setColor("red");

       // iphone12.os = "ios 15.1";
        iphone12.setOs("ios 15.1");

       //iphone12.model ="pro";
        iphone12.setModel("pro");

       // iphone12.numberOfCamera = 3;
        iphone12.setNumberOfCamera(3);


        iphone12.serialNumber = "87665ur3hg3i685y9856";

        iphone12.size = 6.0f;
        iphone12.storage = "64";
        iphone12.unit = "gb";
        iphone12.price = 999.99f;


        Mobile samsungS22 = new Mobile();
        samsungS22.brand = "samsung";
        samsungS22.color = "black";
        samsungS22.os = "android";
        samsungS22.serialNumber = "49593475946t5iur3hg548y8tg";
        samsungS22.numberOfCamera = 4;
        samsungS22.storage = "128";
        samsungS22.unit = "gb";
        samsungS22.model = "ultra";
        samsungS22.price = 799.99f;
        samsungS22.size = 6.2f;



        System.out.println(iphone12.getBrand());
        System.out.println(iphone12.getColor());
        System.out.println(iphone12.getOs());
        System.out.println(iphone12.getModel());

// GiftCard
        GiftCard target = new GiftCard();
        target.companyName = "target";
        target.Amount = 599.99f;
        target.limit = "2";





// LotteryTickets
         LotteryTickets powerBall = new LotteryTickets();
         powerBall.setNumbers(123455864);
         powerBall.setName("Winner Name");
         powerBall.setAmount(434444);
         powerBall.getBarCode();
         powerBall.getCompanyName();
         powerBall.getDate();


        System.out.println(powerBall.getNumbers());
        System.out.println(powerBall.getName());
        System.out.println(powerBall.getAmount());
        System.out.println(powerBall.getBarCode());
        System.out.println(powerBall.getCompanyName());
        System.out.println((powerBall.getDate();

    }
}
