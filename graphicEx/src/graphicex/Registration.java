/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicex;

import java.awt.*;
import javax.swing.*;
import employee_system.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
/**
 *
 * @author nn
 */
public class Registration extends JFrame implements ActionListener, TextListener{
    //field
    int visit = 0;
    Service service = new Service();
    Label l2 = new Label("ID:                  ");
    Label l3 = new Label("Name:           ");    
    Label l4 = new Label("Date of Birth: ");
    JLabel l5 = new JLabel("");
    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    TextField tf3 = new TextField(10);
    Button b1 = new Button("Register");
    Button b2 = new Button("Previous");
    JFrame f = new JFrame();    
    //method
    
    //constructor-
    Registration(){
        
         //Frame
        f.setTitle("Hello Registration");
        f.setBounds(100, 100, 500, 300);
        f.setVisible(true);
        //Layout
        GridLayout  gl = new GridLayout(6,1);
        f.setLayout(gl);
        //components
        Font font = new Font(null, Font.PLAIN, 20);
        Label l1 = new Label("Registration", Label.CENTER);
        l1.setFont(font);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
        Panel p6 = new Panel();
        b1.setVisible(true);
        //add
        
        p1.add(l2);
        p1.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p3.add(l4);
        p3.add(tf3);
        p5.add(b1);
        p5.add(b2);
        p6.add(l5);
        f.add(l1);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p5);
        f.add(p6);
        //action
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visit++;
                p1.add(l2);
                p1.add(tf1);
                int id = Integer.parseInt(tf1.getText());
                String name = tf2.getText();
                String dob = tf3.getText();
                Employee emp = new Employee(id, name, dob);
                service.registration(emp, visit);
                l5.setText("Successfully registed");
                f.setVisible(false);
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                
            }//regist
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Front();             
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void textValueChanged(TextEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//class
