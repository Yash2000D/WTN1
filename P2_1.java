import java.util.Scanner;
class P2_1
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
if(n<0)
System.out.println("The given number is negative");
else if(n>0)
System.out.println("The given number is positive");
else
System.out.println("The given number is zero");
}

}
