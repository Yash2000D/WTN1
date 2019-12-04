import java.util.Scanner;
class P2_15
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0,r=0;
while(n!=0)
{
r=n%10;
s=s+r;
n=n/10;
}
System.out.println(s);
}
}