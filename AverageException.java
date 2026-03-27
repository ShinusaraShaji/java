import java.util.Scanner;
public class AverageException {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter no of integers:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the integers");
        try{
            for(int i=0;i<n;i++)
            {
                int num=s.nextInt();
                if(num<0)
                {
                    throw new InputException("Number is not positive!!!");
                }
                sum+=num;
            }float avg=(float)sum/n;
                System.out.println("Average is:"+avg);
            }
            catch(InputException e)
            {
                System.out.println(e);
            }
            }
        }
    
    

