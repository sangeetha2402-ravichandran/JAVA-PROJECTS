import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Simple {
   
    Simple(){
        Frame frame = new Frame();
       
        Label email = new Label("Email");
        email.setBounds(50,130,100,30);
        frame.add(email);
            
        TextField emailtextField = new TextField("Enter your email");
        emailtextField.setBounds(170,130,100,30);
        frame.add(emailtextField);

        Label password = new Label("Password");
        password.setBounds(50,170,100,30);
        frame.add(password);
       
        TextField passtextField = new TextField("Enter your password");
        passtextField.setBounds(170,170,100,30);
        frame.add(passtextField); 
       
       




        Label age = new Label("Age");
        age.setBounds(50,210,100,30);
         frame.add(age);
        TextField agTextField = new TextField("Enter your AGE");
        agTextField.setBounds(170,210,100,30);    
        frame.add(agTextField);
       

        Button btn = new Button("Submit");
        btn.setBounds(170,270  ,100,30);

        ActionListener submListener = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(emailtextField.getText());
                System.out.println(passtextField.getText());
                System.out.println(agTextField.getText());

            }


        };

        btn.addActionListener(submListener);

        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500 ,500);
        frame.setTitle("AWT");
        frame.add(btn);
    }
}


public class Game1 {

    public static void main(String[] args) {
        new Simple();
        
    }
    
}
