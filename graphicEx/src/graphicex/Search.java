/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import employee_system.*;
/**
 *
 * @author nn
 */
public class Search extends JFrame implements ActionListener{
    //field
    Label l1 = new Label("Insert ID");
    JLabel jl2 = new JLabel("");
    TextField tf1 = new TextField(10);
    Button b1 = new Button("Enter");
    Button b2 = new Button("Previous");
    Service service = new Service();
    //method
    
    //constructor
    Search(){
        //Frame
        JFrame f = new JFrame();
        f.setTitle("Hello Search");
        f.setBounds(100, 100, 500, 300);
        f.setVisible(true);
        //Layout
        GridLayout  gl = new GridLayout(3,1);
        f.setLayout(gl);
        //components
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        //add
        p1.add(l1);
        p1.add(tf1);
        p1.add(b1);
        p2.add(jl2);
        p3.add(b2);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        //action
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tf1.getText());
                service.search(id);
                jl2.setText(service.search(id).getId()+" "+service.search(id).getName()+" "+service.search(id).getDob());
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
