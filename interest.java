import java.util.Scanner;
class interest
{
    public static void main(String[] args) {
        {
            float p,ri,t, sinterest;
            Scanner sc = new Scanner(System.in);

            System.out.print("enter the principal:");
            p = sc.nextFloat();

            System.out.print("enter the rate of principal:");
            ri = sc.nextFloat();

            System.out.print("enter time period in hr:");
            t = sc.nextFloat();

            sinterest = (p*ri*t)/100;
            System.out.print("the simple interest is: " +sinterest);

            
        }
    }
}