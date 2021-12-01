import java.util.*;
class quadratic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter the values of a,b,c: ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
double d=(b*b)-(4*a*c);
double root1,root2;
if(d>0)
{
root1=-b-Math.sqrt((b*b)-(4*a*c))/(2*a);
root2=-b+Math.sqrt((b*b)-(4*a*c))/(2*a);
System.out.println("root1 = "+root1+"\nroot 2 = "+root2);
}
else if (d==0)
{
root1=root2=-b/(2*a);
}
else 
{
double real=-b/(2*a);
double imaginary=Math.sqrt(-d)/(2*a);
System.out.println("root 1 = "+real+ " + "+imaginary+"i");
System.out.println("root 2 = "+real+ " - "+imaginary+"i");
}
}
}
