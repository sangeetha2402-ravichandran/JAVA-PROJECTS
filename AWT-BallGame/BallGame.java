import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class BallGame extends Frame implements MouseMotionListener{

    int circleX =200;
    int circleY=200;
    int circleRadius =20;

    BallGame(){
        addMouseMotionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(500 ,600);
        setTitle("Ball Game");

    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circleX, circleY, 2 * circleRadius, 2 * circleRadius);

    }
    @Override
    public void mouseDragged(MouseEvent e) {
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x =e.getX();
        int y =e.getY();
        if(x < circleX+circleRadius){
            circleX++;
        }
        if(x > circleX+circleRadius){
            circleX--;
        }

        if(y < circleY+circleRadius){
            circleY++;
        }
        if(y > circleY+circleRadius){
            circleY--;
        }
        repaint();
    }
    public static void main(String[] args) {
        new BallGame();
    }

}
