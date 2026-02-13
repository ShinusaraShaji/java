import java.util.Scanner;
public class MatrixDemo {
    public static void main(String args[])
    {
        int row,col, i,j;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=s.nextInt();
        System.out.println("Enter the number coloumns");
        col=s.nextInt();
        int mat[][]=new int [row][col];
        System.out.println("Enter the elements of Matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix");
        System.out.println("------------");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        
    
    

