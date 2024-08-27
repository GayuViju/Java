import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the factorial");
int n=sc.nextInt();
int f=1;
while(n>0)
{
 f=f*n;
 n--;
}
System.out.println("The Factorial is "+f);
sc.close();
    }
}
