import java.awt.*;
import java.awt.event.*;
public class Max3 extends Frame implements ActionListener{
    TextField t1,t2,t3,tResult;
    Label l1,l2,l3,IMax;
    Button bFindMax;
    public Max3()
    {
        setLayout(new FlowLayout());
        l1=new Label("Number 1");
        l2=new Label("Number 2");
        l3=new Label("Number 3");
        IMax=new Label("Maximum");

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        tResult=new TextField(10);
        bFindMax=new Button("Find Max");
        tResult.setEditable(false);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(IMax);
        add(tResult);
        bFindMax.addActionListener(this);
        setTitle("Find Maximum of three numbers");
        setSize(250,200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n1,n2,n3,max;
        n1=Integer.parseInt(t1.getText());
        n2=Integer.parseInt(t2.getText());
        n3=Integer.parseInt(t3.getText());
        max=Math.max(n1,Math.max(n2, n3));
        tResult.setText(String.valueOf(max));
    }
    public static void main(String []args)
    {
        new Max3();

    }
        
    }
        
        
        



