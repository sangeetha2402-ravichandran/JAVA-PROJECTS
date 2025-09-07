import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TallyCounter extends Frame{

    TextField display;
    Button increment, reset;

    TallyCounter(){
        display = new TextField("0");
        display.setBounds(50,50,300,50);

        increment = new Button("Increment");
        increment.setBounds(100,150,100,30);

        increment.addActionListener(new ActionListener() {

            
            @Override
            public void actionPerformed(ActionEvent e) {
              int num = Integer.parseInt(display.getText());
              display.setText(String.valueOf(++num));
            }
        });

        reset = new Button("Reset");
        reset.setBounds(200,150,100,30);

        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                 display.setText(String.valueOf(0));
            }
        });

        add(display);
        add(increment);
        add(reset);
        setLayout(null);
        setVisible(true);
        setSize(500 ,500);
        setTitle("AWT");
       
    }


    
}




public class Tally {

    public static void main(String[] args) {
           new TallyCounter();
    }
 

}
