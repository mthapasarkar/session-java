package day5;

public class schoolApp {
    public static void main(String[] args) {
        student student1 = new student();
        student1.setName("Ram");
        student1.setAge(12);
        student1.setGrade(5);



        teacher teacher1 = new teacher();
        teacher1.setName("Hari");
        teacher1.setAge(30);
        teacher1.setSubject("Computer");


        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getGrade());
        System.out.println(student1.getRollNumber());

        System.out.println(teacher1.getName());
        System.out.println(teacher1.getAge());
        System.out.println(teacher1.getSubject());

         person holiday = new person();
         holiday.takeLeave();





    }
}
