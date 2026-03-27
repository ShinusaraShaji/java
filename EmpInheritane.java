import java.util.Scanner;

class Employee
{
 int empid;
 String name,address,subject;
 double salary;
 Employee(int empid,String name,String address,double salary)
 {
  this.empid=empid;
  this.name=name;
  this.address=address;
  this.salary=salary;
 }
}
class Teacher extends Employee
{
 String dept,subject;
 Teacher(int empid,String name,String address,double salary,String subject,String dept)
 {
  super(empid,name,address,salary);
  this.subject=subject;
  this.dept=dept;
 }
 void display()
 {
  System.out.println("Empid:"+empid);
  System.out.println("Name:"+name);
  System.out.println("Address:"+address);
  System.out.println("Salary:"+salary);
  System.out.println("Department:"+dept);
  System.out.println("Subject:"+subject);
 }
}
public class EmpInheritane
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of Employee:");
    int n=sc.nextInt();
    Teacher arr[]=new Teacher[n];
    for(int i=0;i<n;i++)
    {
     System.out.println("Enter the details of Employee "+(i+1)+": Empid,Name,Address,Salary,Subject,Department");   
     System.out.println("Enter the Employee id:");
     int empid=sc.nextInt();
     String name=sc.next();
     String address=sc.next();
     double salary=sc.nextDouble();
     String subject=sc.next();
     String dept=sc.next();
     arr[i]=new Teacher(empid,name,address,salary,subject,dept);
    }
    System.out.println("\n**Information of All the Employees**");
    for(int i=0;i<n;i++)
    {
     System.out.println("Details of Employee "+(i+1)+":");
     System.out.println("-----------------------------");
     arr[i].display();
    }
    sc.close();
    } 
 }