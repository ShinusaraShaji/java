class SuperParent{
    int rollno;
    SuperParent(int rno)
    {
        rollno=rno;
    }
}
class SuperChild extends SuperParent{
    String name;
    SuperChild(int rno,String name1)
    {
        super(rno);
        name=name1;
    }
    void display()
    {
        System.out.println("Roll no.:"+rollno);
        System.out.println("Name.:"+name);
    }
    }

public class SuperDemo {
    public static void main(String args[])
    {
        SuperChild ob=new SuperChild(23,"Deepthy");
        ob.display();
    }
    
}
