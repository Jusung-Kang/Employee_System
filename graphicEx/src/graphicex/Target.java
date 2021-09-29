package graphicex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Target extends JFrame implements ActionListener{
    //field
    Button b1= new Button("Search");;
    Button b2= new Button("Number of Employees");
    Button b3= new Button("Print");
    Button b4= new Button("Exit");
    //method
    
    //constructor
     Target(){
         //Frame
        JFrame f = new JFrame();
        f.setTitle("Hello Target");
        f.setBounds(100, 100, 500, 300);
        f.setVisible(true);
        //Layout
        GridLayout  gl = new GridLayout(4,1);
        f.setLayout(gl);
        //components
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        //add
        p1.add(b1);
        p2.add(b2);
        p3.add(b3);
        p4.add(b4);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        //action
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Search();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Total();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Print();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//front
     
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//class
