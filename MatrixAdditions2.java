import java.util.Scanner;
class MatrixAdd{
    Scanner s=new Scanner(System.in);
    int r,c;
    int[][]mat1,mat2,res;
    MatrixAdd(int r1,int c1){
        r=r1;
        c=c1;
    }
    void getData()
    {
        mat1=new int[r][c];
        mat2=new int[r][c];
        res=new int[r][c];
     System.out.println("Enter elements of first matrix:");
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        mat1[i][j]=s.nextInt();
    }
}
System.out.println("Enter elements of second matrix:");
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        mat2[i][j]=s.nextInt();
    }


    }
}
void addMatrix(){
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        res[i][j]=mat1[i][j]+mat2[i][j];

}

    }
}
void display(){
    System.out.println("Resultant Matrix:");
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(res[i][j]+"\t");
    }
    System.out.println();
}

}
}
  public class MatrixAdditions2 {
  
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.print("Enter rows and columjns of first matrix:");
        r1=s.nextInt();
        c1=s.nextInt();
       System.out.print("Enter rows and columjns of second matrix:");
        r2=s.nextInt();
        c2=s.nextInt();
        if(r1==r2&& c1==c2)
        {
            MatrixAdd obj=new MatrixAdd(r1, c1);
            obj.getData();
            obj.addMatrix();
            obj.display();
        }
        else
        {
            System.out.println("Matrix addition not possible");
        }
    }
  } 







