package package2;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class thankyoupage extends Frame implements ActionListener{
    Label l1,l2;
    Button b1;
    Frame f;
    public thankyoupage(){
        f=new Frame("PIZZAZAZA");
        Font p = new Font("Monospaced",Font.BOLD,20);
        f.setBackground(Color.ORANGE);
        f.setSize(400,200);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,1));
        l1=new Label("YOUR ORDER HAS BEEN PLACED",Label.CENTER);
        l2=new Label("THANKYOU!",Label.CENTER);
        b1=new Button("OKAY");
        f.add(l1);l1.setFont(p);
        f.add(l2);l2.setFont(p);
        f.add(b1); b1.setFont(p);
        b1.addActionListener(this);
        
        Color PURPLE= new Color(164,66,220);
        b1.setBackground(PURPLE);
        b1.setForeground(Color.WHITE);
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            f.dispose();
        }
    }
    
    public static void main(String[] args) {
        thankyoupage p = new thankyoupage();
    }
}