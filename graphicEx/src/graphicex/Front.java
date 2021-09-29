package graphicex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import employee_system.*;

public class Front extends JFrame implements ActionListener, TextListener{
    //field
    TextField tf1 = new TextField(10);
    Button b1 = new Button("Log in");
    Button b2 = new Button("Register");
    Service service = new Service();
    int visit = 0;
    Registration regist = new Registration();
    //method
    
    //constructor
    Front(){
        regist.f.setVisible(false);
        //Frame
        JFrame f = new JFrame();
        f.setTitle("Hello Graphic");
        f.setBounds(100, 100, 500, 300);
        f.setVisible(true);
        //Layout
        GridLayout  gl = new GridLayout(3,1);
        f.setLayout(gl);
        //components
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Font font = new Font(null,Font.PLAIN, 20);
        Label l1 = new Label("Welcome", Label.CENTER);
        l1.setFont(font);
        Label l2 = new Label("ID:");
        
        //add
        f.add(l1);
        p1.add(l2);
        p1.add(tf1);
        p1.add(b1);
        f.add(p1);
        p2.add(b2);
        f.add(p2);
        //action
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tf1.getText());
                if(id == service.search(id).getId()){
                    System.out.println(service.search(id).getId()+" "+service.search(id).getName()+" "+service.search(id).getDob());
                    new Target();
                }
                
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regist.f.setVisible(true);
            }
        });
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//front

    @Override
    public void actionPerformed(ActionEvent e) {
        //if(tf1.getText().equals("123")){
        //   new Target();
        //}
    }

    @Override
    public void textValueChanged(TextEvent e) {
    }
}//class
