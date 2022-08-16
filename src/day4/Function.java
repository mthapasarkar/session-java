package day4;

public class Function {

    public static void main(String[] args) {

        int a = 7;
        int b = 8;
        int c = 4;

       // add(a, b, c);
        int add1 = addAndReturn(a, b ,c);
        System.out.println(add1);


        int e = 44;
        int g = 87;
        int i = 9;

      //  add(e, g, i);
       int add2 = addAndReturn(e, g, i);
        System.out.println(add2);

        int x = 87;
        int y = 99;
        int z = 2;

        //add(x, y, z);
        int add3 = addAndReturn(x, y, z);
        System.out.println(add3);
    }
    public static int addAndReturn( int a,int b, int c){
        int add1 = a + b + c;
        return add1;
    }
 public static void add(int a, int b, int c){
            int add1 = a + b + c;


            System.out.println( add1);

        }

    }

