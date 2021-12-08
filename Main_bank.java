import java.util.*;
import java.lang.Math;
class bank
{
String name;
int acc_no;
float bal,si;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the name of account holder:");
name=sc.nextLine();
System.out.println("Enter the account number:");
acc_no=sc.nextInt();
System.out.println("Enter account balance:");
bal=sc.nextFloat();
}
void display()
{
System.out.println("\nDetails:\nName : "+name+"\nAccountnumber : "+acc_no+"\nBalance : "+bal);
}
void deposits()
{Scanner sc=new Scanner(System.in);
System.out.println("\nDo you want to deposit?\nEnter 1 for yes, 2 for no");
int d=sc.nextInt();
if(d==1)
{
System.out.println("Enter the amount to be deposited : ");
int amt=sc.nextInt();
bal+=amt;
System.out.println("Available balance = "+bal);
}
}
}
class current extends bank
{
float service_charge=100;
void cheque()
{
System.out.println("\nCheque service available");
}
void withdrawal()
{
float amount;
Scanner sc=new Scanner(System.in);
System.out.println("Minimum balance = Rs.1000.00");
System.out.println("Enter the amount to be withdrawn:");
amount=sc.nextFloat();
if(amount>bal)
{
System.out.println("Balance is insufficient");
}
else
{
bal-=amount;
if(bal<1000)
{
bal-=service_charge;
System.out.println("Servuce charge of Rs."+service_charge+"  is added");
System.out.println("Available balance = "+bal);
}
else
{
System.out.println(amount+ " withdrawn");
System.out.println("Available balance = " +bal);
}
}
}
}
class savings extends bank
{
void cheque()
{
System.out.println("\nNo cheque services");
}
void simple_interest()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter sale of interest : ");
int r=sc.nextInt();
System.out.println("Enter the number of times interest applied per time period:");
int n=sc.nextInt();
System.out.println("Enter the time of elapse:");
int t=sc.nextInt();
si=bal*(1+r/n);
System.out.println("Simple interest = Rs."+(Math.pow(si,n*t)));
}
void withdrawal()
{
Scanner sc=new Scanner(System.in);
float amount;
System.out.println("No minimum balance required\nEnter the amount to be withdrawn:");
amount =sc.nextFloat();
if(amount>bal)
{
System.out.println("Balance insufficient");
}
else
{
bal-=amount;
System.out.println(amount+" withdrawn\nAvailable balance= "+bal);
}
}
}
public class Main_bank
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
savings obj1=new savings();
current obj2=new current();
System.out.println("1.Savings\n2.Current\nEnter your choice:");
int ch=sc.nextInt();
switch(ch)
{
case 1:
obj1=new savings();
obj1.accept();
obj1.display();
obj1.cheque();
obj1.deposits();
obj1.simple_interest();
obj1.withdrawal();
break;
case 2:
obj2=new current();
obj2.accept();
obj2.display();
obj2.cheque();
obj2.deposits();
obj2.withdrawal();
break;
default:
System.out.println("Invalid input!");
}
}
}
