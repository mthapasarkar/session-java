package day8;

public class MarkSheet {
    public static void main(String[] args) {


            String name = "Tom";
            int studentClass = 9;

            float maths = 95;
            float science = 78;
            float english = 87;
            float computer = 88;
            float social = 77;
            float nepali = 66;

            float percentage = ((maths + science + english + computer + social + nepali)/600)*100;

            System.out.println(percentage);

            boolean isDistinction = percentage >= 80;
            boolean isFirstDivision = percentage >= 70 && percentage < 80;
            boolean secondDivision = percentage >= 50 && percentage < 70;
            boolean thirdDivision = percentage >= 40 && percentage < 50;
            boolean failed = percentage >= 0 && percentage < 40;

            System.out.println("Distinction : " + isDistinction);
            System.out.println("First Division : " + isFirstDivision);
            System.out.println("Second Division : " + secondDivision);
           System.out.println("Third Division : " + thirdDivision);
           System.out.println("Failed : " + failed);
        }
    }



