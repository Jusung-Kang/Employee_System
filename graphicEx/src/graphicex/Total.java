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
/**
 *
 * @author nn
 */
public class Total extends JFrame implements ActionListener{
    //field
    Service service = new Service();
    JLabel jl1= new JLabel("");
    Label l1 = new Label();
    Button b1 = new Button("Previous");
    //method
    
    //constructor
    Total(){
         //Frame
        JFrame f = new JFrame();
        f.setTitle("Hello Registration");
        f.setBounds(100, 100, 500, 300);
        f.setVisible(true);
        //Layout
        GridLayout  gl = new GridLayout(3,1);
        f.setLayout(gl);
        //components
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        
        //add
        
        p1.add(jl1);
        p2.add(b1);
        f.add(l1);
        f.add(p1);
        f.add(p2);
        
        //action
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Target();
            }
        });
        jl1.setText("TOTAL NUMBER OF EMPLOYEE: "+String.valueOf(service.count()));
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//class
