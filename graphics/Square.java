package graphics;
import java.util.Scanner;
public class Square implements Area_cal {
    int a;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side length:");
        a=sc.nextInt();
        System.out.println("Area of Square:"+(a*a));
    }
    
}
