public class InheritanceDemo {
    int rollno=10;
    String name="Anitha";
}
class ChildInheritance extends InheritanceDemo{
    int marks=80;
    void display()
    {
        System.out.println("Roll no.:"+rollno);
        System.out.println("Name.:"+name);
        System.out.println("Marks.:"+marks);
    }
}
class SingleInheritance
{
    public static void main(String args[])
    {
        ChildInheritance ob=new ChildInheritance();
        ob.display();
    }
}
        


