import java.util.Scanner;
public class Quadratic {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a,b,c (Eg(ax^2+bx+c) )");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d=((b*b)-(4*a*c));
        if(d<0)
          System.out.println("The equation has no real root");
        else if(d>0)
        {
           float x=(-b+d)/2*a;
            float y=(-b-d)/2*a;
          System.out.print(x+" "+y);
        }
        else
        {
            float x=(-b+d)/2*a;
            System.out.print(x);
        }

    }
}
