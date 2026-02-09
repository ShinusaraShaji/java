public class Square 
{
    int side;
    void getinput(int s)
    {
        side=s;
    }
    int calArea()
    {
        return side*side;
    }
    public static void main(String args[])
    {
        Square ob=new Square();
        ob.getinput(4);
        System.out.println("Area of square: "+ob.calArea());
    }
}
