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


       // iphone12.serialNumber = "87665ur3hg3i685y9856";
         iphone12.setSerialNumber("87665ur3hg3i685y9856");

       // iphone12.size = 6.0f;
        iphone12.setSize(6.0f);

        //iphone12.storage = "64";
        iphone12.setStorage("64");

        //iphone12.unit = "gb";
        iphone12.setUnit("gb");

        //iphone12.price = 999.99f;
        iphone12.setPrice(999.99f);


        Mobile samsungS22 = new Mobile();

        samsungS22.setBrand("Samsung");
        samsungS22.setColor("Black");
        samsungS22.setOs("Android");
        samsungS22.setSerialNumber("49593475946t5iur3hg548y8tg");
        samsungS22.setNumberOfCamera(4);
        samsungS22.setStorage("128");
        samsungS22.setUnit("GB");
        samsungS22.setModel("ULTRA");
        samsungS22.setPrice(799.99f);
        samsungS22.setSize(6.1f);


        System.out.println(samsungS22.getBrand());
        System.out.println(samsungS22.getUnit());
        System.out.println(samsungS22.getStorage());
        System.out.println(samsungS22.getPrice());
        System.out.println(samsungS22.getSerialNumber());
        System.out.println(samsungS22.getNumberOfCamera());
        System.out.println(samsungS22.getOs());
        System.out.println(samsungS22.getSize());
        System.out.println(samsungS22.getColor());
        System.out.println(samsungS22.getModel());



        System.out.println(iphone12.getBrand());
        System.out.println(iphone12.getColor());
        System.out.println(iphone12.getOs());
        System.out.println(iphone12.getModel());
        System.out.println(iphone12.getNumberOfCamera());
        System.out.println(iphone12.getSerialNumber());
        System.out.println(iphone12.getPrice());
        System.out.println(iphone12.getStorage());
        System.out.println(iphone12.getUnit());

// GiftCard
        GiftCard target = new GiftCard();
        target.setCompanyName("Target");
        target.setAmount(55.9f);
        target.setLimit("2");

        System.out.println(target.getCompanyName());
        System.out.println(target.getAmount());
        System.out.println(target.getLimit());





// LotteryTickets
        LotteryTickets powerBall = new LotteryTickets();
        powerBall.setNumber("12334845746476");
        powerBall.setName("Winner");
        powerBall.setAmount(500.0f);
        powerBall.setTime();
        powerBall.setDate();
        powerBall.setCompanyName("NY Lottery");
        powerBall.setSerialNumber("3h485hj667j55646j46h");
        powerBall.setBarCode("jhf7e5t5e8uhg4edt5");
        powerBall.setType("Single play");

        System.out.println(powerBall.getNumber());
        System.out.println(powerBall.getAmount());
        System.out.println(powerBall.getDate());
        System.out.println(powerBall.getCompanyName());
        System.out.println(powerBall.getSerialNumber());
        System.out.println(powerBall.getType());
        System.out.println(powerBall.getName());
        System.out.println(powerBall.getTime());
        System.out.println(powerBall.getBarCode());







    }
}
