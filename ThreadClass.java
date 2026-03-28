import java.util.Scanner;
class Multiplication extends Thread 
{
    @Override
    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 5 = " + (i * 5));
        }
        System.out.println("Exiting from Thread Multiplication....");
    }
}
class PrimeNumbers extends Thread 
{
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printPrimes(n);
        sc.close();
    }
    static void printPrimes(int n) 
    {
        int x, y;
        boolean flag;
        System.out.println("All the prime numbers between 1 and " + n + " are:");
        for (x = 2; x <= n; x++)
            {
            flag = true;
            for (y = 2; y <= x / 2; y++) 
                {
                if (x % y == 0) 
                {
                    flag = false;
                    break;
                }
            }
            if (flag)   
            {
                System.out.print(x + "\t");
            }
        }
        System.out.println();
    }
}
public class ThreadClass {
    public static void main(String[] args) 
    {
        Multiplication a = new Multiplication();
        PrimeNumbers b = new PrimeNumbers();
        a.start();
        b.start();
    }
}
