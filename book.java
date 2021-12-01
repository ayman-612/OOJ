import java.util.*;
public class book
{
String name,author;
int price,num_pages;
book()
{}
book(String name,String author,int price,int num_pages)
{
this.name=name;
this.author=author;
this.price=price;
this.num_pages;
}
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the book:");
name=s.nextLine();
System.out.println("Enter the author of the book:");
author=s.nextLine();
System.out.println("Enter the price of the book:");
price=s.nextLine();
System.out.println("Enter the number of pages of the book:");
num_pages=s.nextLine();
}
public String toString()
{
return("Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of pages: "+num_pages);
}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
book b1=new book("Rich Dad Poor Dad","Robert T. Kiyosaki",250,313);
System.out.println("Constructor values : \n"+b1);
System.out.println("Enter the number of books");
int n=sc.nextInt();
book b[]=new book[n];
for(int i=0;i<n;i++)
{
System.out.println("Details of book "+i+": \n"+b[i]);
}
}
}


