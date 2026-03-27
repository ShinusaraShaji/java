import java.util.Scanner;
import pkgOperation.Add;
import pkgOperation.Subtract;
import pkgOperation.Multiply;
import pkgOperation.Divide;
public class Arithmetic{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a=sc.nextInt();
            System.out.println("Enter the second Number:");
            int b=sc.nextInt();
            Add obj1=new Add();
            Subtract obj2=new Subtract();
            Multiply obj3=new Multiply();
            Divide obj4=new Divide();
            obj1.cal(a,b);
            obj2.cal(a,b);
            obj3.cal(a,b);
             obj4.cal(a,b);
    }}
