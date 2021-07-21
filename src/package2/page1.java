package package2;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class page1 extends Frame implements ActionListener{
    Label l1,l2;
    Button b1;
    Frame f;
    public page1(){
        f=new Frame("PIZZAZAZA");
        Font p = new Font("Monospaced",Font.BOLD,25);
        Font q = new Font("Monospaced",Font.BOLD,17);
        f.setBackground(Color.ORANGE);
        f.setSize(500,200);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,1));
        l1=new Label("Hello!",Label.CENTER);
        l2=new Label("Click here to customize your Pizzazaza Meal",Label.CENTER);
        b1=new Button("Place an order");
        f.add(l1);l1.setFont(p);
        f.add(l2);l2.setFont(q);
        f.add(b1); b1.setFont(q);
        
        Color PURPLE= new Color(164,66,220);
        b1.setBackground(PURPLE);
        b1.setForeground(Color.WHITE);

        b1.addActionListener(this);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            order o = new order();
        }
    }
    public static void main(String[] args) {
        page1 p = new page1();
    }
}