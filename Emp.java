import java.util.Scanner;

public class Emp {
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n Enter Employee Name:");
        name=scan.nextLine();
        System.out.println("\n\n Enter Employee Number:");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Nunmber:"+empno);
    }
    public static void main(String args[]){
        Emp e=new Emp();
        e.getData();
        System.out.println("\n\nEmployee Details\n");
        System.out.println("\n\n---------");
        e.display();
    }
    
}
