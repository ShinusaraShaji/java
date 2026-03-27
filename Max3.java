import java.awt.*;
import java.awt.event.*;

public class Max3 extends Frame implements ActionListener {

    TextField t1, t2, t3, tResult;
    Label l1, l2, l3, lMax;
    Button bFindMax;

    public Max3() {

        // Set layout with rows and columns
        setLayout(new GridLayout(5, 2, 10, 10));

        // Labels
        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
        l3 = new Label("Number 3");
        lMax = new Label("Maximum");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        tResult = new TextField();
        tResult.setEditable(false);

        // Button
        bFindMax = new Button("Find Max");
        bFindMax.addActionListener(this);

        // Add components row by row
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(lMax); add(tResult);
        add(new Label(""));  // Empty space
        add(bFindMax);

        setTitle("Find Maximum");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());

            int max = Math.max(n1, Math.max(n2, n3));
            tResult.setText(String.valueOf(max));
        } catch (Exception e) {
            tResult.setText("Invalid");
        }
    }

    public static void main(String[] args) {
        new Max3();
    }
}