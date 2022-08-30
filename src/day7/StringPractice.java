package day7;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {

        String name = "Harry";


        String name1 = "Harry";

        boolean isInSameMemoryLocation = name == name1;  //never use == in equity test in object

        System.out.println(isInSameMemoryLocation);

        boolean isInSameMemoryLocation1 = name.equals(name1);  //always use .equals method for equity check in objects

        System.out.println(isInSameMemoryLocation1);

        String a = "Max";
        String b = "Tom";

        int compared = a.compareToIgnoreCase(b); // a-b (-, 0,+) a = 97, A = 65

        System.out.println(compared);

        String greeting = "Hello"+ "Namasate"+"HOw do yo do";

        boolean isMaxContained = greeting.toLowerCase().contains("Max");
        System.out.println(isMaxContained);

        String number = String.valueOf(2);


        String fullName = "Sushant Thapa";
        String verificationEmailLink = "http: // domainemail.com/verift/8ksjifj";
        String combinedString = "Hello " + fullName +" Welcome  to  our website" + " Check your status here;";

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append(fullName);
        builder.append(" Welcome to our website");
        builder.append(" Check you status here");
        builder.append(verificationEmailLink);

        String builderCombinedString = builder.toString();

        System.out.println(combinedString);
        System.out.println(builderCombinedString);


    }
}
