/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import employee_system.*;

/**
 *
 * @author nn
 */
public class Print extends JFrame implements ActionListener {
    //field
    JTextArea ta = new JTextArea();
    Button b1= new Button("Press to print");
    Button b2 = new Button("Previous");
    Service service = new Service();
    Employee emp[] = new Employee[10];
    int index = 0;
    //mehtod
    
    //constructor
    Print(){
        //Frame
        JFrame f = new JFrame();
        f.setTitle("Hello Search");
        f.setBounds(100, 100, 500, 300);
        f.setVisible(true);
        //Layout
        GridLayout  gl = new GridLayout(2,1);
        f.setLayout(gl);
        //components
        Panel p1 = new Panel();
        //add
        p1.add(b1);
        p1.add(b2);
        f.add(ta);
        f.add(p1);
        //action
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emp = service.print();
                while(emp[index] != null){
                    String str = emp[index].getId()+" "+emp[index].getName()+" "+emp[index].getDob()+"\n";
                    ta.append(str);
                    index++;
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Target();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}//class
