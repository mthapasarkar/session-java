package day4;

public class SimpleInterest {
    public static void main(String[] args) {

        float p = 300.3f;
        int  t = 4;
        float r = 3.5f;
        float interest = interest(p,t, r);

        System.out.println(interest);
            }
            public static float interest(float p, int t, float r){
                float interest = (p *t *r)/100;
                return interest;
            }

        }



