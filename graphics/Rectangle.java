package graphics;
import java.util.Scanner;
public class Rectangle implements Area_cal{
    int l,b;
    public void area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length:");
        l=sc.nextInt();
        System.out.println("Input breadth");
        b=sc.nextInt();
        System.out.println("Area of rectangle:"+(l*b));}
    
}
