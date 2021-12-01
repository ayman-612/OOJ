import java.util.*;
abstract class shape
{
double a,b;
abstract void printArea();
}
class rectangle extends shape
{
void getdata(double x,double y)
{
a=x;
b=y;
}
void printArea()
{
System.out.println("Area of rectangle = "+(a*b));
}
}
class triangle extends shape
{
void getdata(double x,double y)
{
a=x;
b=y;
}
void printArea()
{
double area=0.5*a*b;
System.out.println("Area of triangle + "+area);
}
}
class circle extends shape
{
void getdata(double x)
{
a=x;
}
void printArea()
{
double area=3.14*a*a;
System.out.println("Area of circle = "+area);
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch;
shape s1;
rectangle r=new rectangle();
triangle t=new triangle();
circle c=new circle();
System.out.println("\n1.Rectangle\n2.Triangle\n3.Circle\nEnter your choice:\n");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter length and breadth");
double l=sc.nextInt();
double b=sc.nextInt();
r.getdata(l,b);
r.printArea();
break;
case 2:
System.out.println("Enter base and height:");
double base=sc.nextDouble();
double height=sc.nextDouble();
t.getdata(base,height);
t.printArea();
break;
case 3:
System.out.println("Enter radius:");
double radius=sc.nextDouble();
c.getdata(radius);
c.printArea();
break;
default:
System.out.println("Invalid input!");
}
}
}

