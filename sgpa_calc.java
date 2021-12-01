import java.util.*;
public class SGPA
{
String usn, name;
String[] subjects=new String[5];
int marks[] ;
int credits[];
int no_of_subjects;
double sgpa =0.0;
public static void main(Strings args[])
{
Scanner sc=new Scanner(System.in) ;
int i;
System.out.println("Enter the number of subjects:");
no_of_subjects=sc.nextInt();
for (i=0;i<no_of_subjects;i++)
{
System.out.println("Enter the name of subject "+ i+"  :");
subjects[i]=sc.nextLine();
System.out.println("Enter the number of credits in this subject :");
credits[i]=sc.nextInt();
}
System.out.println("Enter the number of students:") ;
int n=sc.nextInt();
SGPA obj=new SGPA();
for(i=0;i<n;i++)
{
SGPA.accept() ;
SGPA.calculate() ;
SGPA.display() ;
}
} 

void accept() 
{
System.out.println("Enter name:") ;
name=sc.nextLine();
System.out.println("Enter USN:") ;
usn=sc.nextLine();
for(int i=0;i<no_of_subjects;i++)
{
System.out.println("Enter marks in subject " +i) ;
marks[i] = sc.nextInt();
} 
} 

void calculate()
{ double gp=0.0;
for(int i=0;i<no_of_subjects;i++) 
{ 
if(marks[i] >=90)
{ gp=10*credits[i];}
if(marks[i] >=80 && marks[i]<90)
{ gp=9*credits[i];}
if(marks[i] >=70 && marks[i]<80)
{ gp=8*credits[i];}
if(marks[i] >=60 && marks[i]<70)
{ gp=7*credits[i];}
if(marks[i] >=50 && marks[i]<60)
{ gp=6*credits[i];}
if(marks[i] >=40 && marks[i]<50)
{ gp=5*credits[i];}
else
{gp=0;}
sgpa+=gp;
}
sgpa=sgpa/n;
} 

void display() 
{ 
System.out.println("Name : "+name+" \nUSN : "+usn+" \nSGPA = "+sgpa+" \n") ;
System.out.print("The student Grade is: ");
  if(avg>=90)
  {System.out.print("S");   }
   else if(avg>=80 && avg<90)
   {System.out.print("A");   } 
   else if(avg>=70 && avg<80)
{System.out.print("B");  }
  else if(avg>=60 && avg<70) 
{System.out.print("C"); }
 else if(avg>=50 && avg<60)
 {System.out.print("D");}
 else if(avg>=40 && avg<50)
  {System.out.print("E");}
  else if(avg<40)
 {System.out.print("F");}  
  }
} 



