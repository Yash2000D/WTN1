import java.util.Scanner;
class P2_2
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
int s=n%2;
if(s==0)
System.out.println("The given number is even");
else
System.out.println("The given number is odd");
}
}
