package package2;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class order extends Frame implements ActionListener{
    Label l11,l12,l13,l21,l22,l23,l31,l32,l41,l42,lp,lp1,lp2,lp3,lp4,Heading,errorMessage;
    TextArea INVOICE;
    Button b1,b2,b3;
    TextField t13,t23,t32,t42,tp1,tp2,tp3,tp4;
    Choice c1,c2,c3,c4,c5,cb1,cb2,cb3,cb4;
    int i,size,type,TOTAL,q1,q2,q3,q4,a1,a2,a3,a4,extra1,extra2,amt1=0,amt2=0,amt3=0,amt4=0;
    String x1,x2,x3,x4,s1,s2;
    Frame f;
    public order(){
        f=new Frame("PIZZAZAZA MEAL ");
        f.setSize(1050,620);
        f.setVisible(true);
        f.setLayout(null);
        f.setBackground(Color.orange);
        
        //row1
        Heading=new Label( "Welcome! Please enter your order details.");

        //row2
        l11=new Label("Veg Pizzas:");

        cb1 = new Choice();
        cb1.add("");
        cb1.add("Margherita ₹150");
        cb1.add("VegLoaded ₹250");

        l12=new Label("Size : ");
        c1 = new Choice();
        c1.add("");
        c1.add("Small");
        c1.add("Regular +₹20");
        c1.add("Large +₹40");

        l13=new Label("Quantity : ");
        t13=new TextField(1);


        //row3
        l21=new Label("NonVeg Pizzas:");

        cb2 = new Choice(); 
        cb2.add("");
        cb2.add("Pepperoni ₹200");
        cb2.add("Sausage₹200");
        cb2.add("BBQChicken₹300");

        l22=new Label("Size : ");

        c2 = new Choice();
        c2.add("");
        c2.add("Small");
        c2.add("Regular +₹20");
        c2.add("Large ₹40");

        l23=new Label("Quantity : ");
        t23=new TextField(1);

        //row3
        l31=new Label("Desserts:");

        cb3 = new Choice();
        cb3.add("");
        cb3.add("ChocoLavaCake ₹70");
        cb3.add("WalnutBrownie ₹100");

        l32=new Label("Quantity : ");
        t32=new TextField(1);

        //row4
        l41=new Label("SoftDrinks:");
        cb4 = new Choice();
        cb4.add("");
        cb4.add("CocoCola ₹20");
        cb4.add("Sprite ₹20");
        cb4.add("Mirinda ₹20");

        l42=new Label("Quantity : ");
        t42=new TextField(1);


        //row5
        lp=new Label("Enter your Personal Details: ");
        //row678
        lp1=new Label("Name: ");
        tp1=new TextField(10);
        lp2=new Label("Mobile No. : ");
        tp2=new TextField(10);
        lp3=new Label("Address : ");
        tp3=new TextField(10);

        //row6
        b1=new Button("Add");
        b2=new Button("Confirm Order");
        b3=new Button("Cancel Order");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        errorMessage=new Label("",Label.CENTER);
        
        Font s= new Font("Dialog",Font.BOLD,12);
        Font F= new Font("Monospaced",Font.BOLD,20);
        
        f.add(Heading);
        f.add(l11);f.add(cb1);f.add(l12);f.add(c1);f.add(l13);f.add(t13);
        f.add(l21);f.add(cb2);f.add(l22);f.add(c2);f.add(l23);f.add(t23);
        f.add(l31);f.add(cb3);f.add(l32);f.add(t32);
        f.add(l41);f.add(cb4);f.add(l42);f.add(t42);
        f.add(lp);
        f.add(lp1);f.add(tp1);f.add(lp2);f.add(tp2);f.add(lp3);f.add(tp3);
        f.add(b1);f.add(b2);f.add(b3);
        f.add(errorMessage);
        
        Color PURPLE= new Color(164,66,220);
        
        b1.setBackground(PURPLE);b1.setForeground(Color.WHITE);
        b2.setBackground(PURPLE);b2.setForeground(Color.WHITE);
        b3.setBackground(PURPLE);b3.setForeground(Color.WHITE);

        Heading.setFont(F);lp.setFont(F);
        b1.setFont(s); b2.setFont(s); b3.setFont(s);errorMessage.setFont(s);
        
        l11.setFont(s);
        l21.setFont(s);
        l31.setFont(s);
        l41.setFont(s);
        lp1.setFont(s);
        lp2.setFont(s);
        lp3.setFont(s);

        l12.setFont(s);
        l22.setFont(s);
        l32.setFont(s);
        l42.setFont(s);
        l13.setFont(s);
        l23.setFont(s);
        
        Heading.setBounds(40,60,500,30);
        l11.setBounds(20,100,80,20);
        cb1.setBounds(120,100,130,20);
        l12.setBounds(270,100,40,20);
        c1.setBounds(320,100,90,20);
        l13.setBounds(440,100,50,20);
        t13.setBounds(500,100,20,20);

        l21.setBounds(20,130,80,20);
        cb2.setBounds(120,130,130,20);
        l22.setBounds(270,130,40,20);
        c2.setBounds(320,130,90,20);
        l23.setBounds(440,130,50,20);
        t23.setBounds(500,130,20,20);

        l31.setBounds(20,160,80,20);
        cb3.setBounds(120,160,130,20);
        l32.setBounds(270,160,60,20);
        t32.setBounds(340,160,20,20);

        l41.setBounds(20,190,80,20);
        cb4.setBounds(120,190,130,20);
        l42.setBounds(270,190,60,20);
        t42.setBounds(340,190,20,20);

        lp.setBounds(40,250,500,20);

        lp1.setBounds(20,290,80,20);
        tp1.setBounds(120,290,180,20);

        lp2.setBounds(20,320,85,20);
        tp2.setBounds(120,320,180,20);

        lp3.setBounds(20,350,50,20);
        tp3.setBounds(120,350,180,80);

        b1.setBounds(40,480,95,40);
        b2.setBounds(160,480,95,40);
        b3.setBounds(280,480,95,40);
        
        errorMessage.setBounds(30,540,360,30);
        
        INVOICE=new TextArea();
        INVOICE.setBounds(550,80,460,490);
        f.add(INVOICE);
        INVOICE.setEditable(false);
        
        t13.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(!((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') && (t13.getText().length() <=1))){
                    e.consume();
                }
            } 
        });

        t23.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(!((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') && (t23.getText().length() <=1))){
                    e.consume();
                }
            } 
        });

        t32.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(!((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') && (t32.getText().length() <=1))){
                    e.consume();
                }
            } 
        });

        t42.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(!((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') && (t42.getText().length() <=1))){
                    e.consume();
                }
            } 
        });

        tp1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(!((e.getKeyChar() >= 'A' && e.getKeyChar() <= 'Z') || (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z'))){
                    e.consume();
                }
            } 
        });

        tp2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(!((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') && (tp2.getText().length() <=10))){
                    e.consume();
                }
            }  
        });
        
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        

        if("".equals(c1.getSelectedItem())){ 
            s1="";
            extra1=0;   
        } 
        else if("Small".equals(c1.getSelectedItem())){ 
            s1="(S)";
            extra1=0;
        } 
        else if("Regular +₹20".equals(c1.getSelectedItem())){
            s1="(R)";
            extra1=20;
        }
        else if("Large +₹40".equals(c1.getSelectedItem())){ 
            s1="(L)";
            extra1=40;
        }
        
        
        if("".equals(cb1.getSelectedItem())){ 
            x1="";
            s1="";
            a1=0;
            extra1=0;
            amt1=(a1+extra1)*q1;
        } 
        else if("Margherita ₹150".equals(cb1.getSelectedItem())){ 
            x1="Margherita";
            a1=150;
            amt1=(a1+extra1)*q1; 
        } 
        else if("VegLoaded ₹250".equals(cb1.getSelectedItem())){ 
            x1="VegLoaded";
            a1=250;
            amt1=(a1+extra1)*q1;
        }
        
        if("".equals(c2.getSelectedItem())){ 
            s2="";
            extra2=0;
        } 
        else if("Small".equals(c2.getSelectedItem())){ 
            s2="(S)";
            extra2=0;
        } 
        else if("Regular +₹20".equals(c2.getSelectedItem())){
            s2="(R)";
            extra2=20;
        }
        else if("Large +₹40".equals(c2.getSelectedItem())){ 
            s2="(L)";
            extra2=40;
        } 
        

        if("".equals(cb2.getSelectedItem())){ 
            x2="";
            s2="";
            a2=0;
            extra2=0;
            amt2=a2*q2;   
        } 
        else if("Pepperoni ₹200".equals(cb2.getSelectedItem())){
            x2="Pepperoni";
            a2=200;
            amt2=(a2+extra2)*q2;  
        } 
        else if("Sausage₹200".equals(cb2.getSelectedItem())){ 
            x2="Sausage";
            a2=200;
            amt2=(a2+extra2)*q2;  
        } 
        else if("BBQChicken₹300".equals(cb2.getSelectedItem())){ 
            x2="BBQChicken";
            a2=300;
            amt2=(a2+extra2)*q2;  
        }


        if("".equals(cb3.getSelectedItem())){
            x3="";
            a3=0;
            amt3=a3*q3;  
        } 
        else if("ChocoLavaCake ₹70".equals(cb3.getSelectedItem())){
            x3="ChocoLavaCake";
            a3=70;
            amt3=a3*q3;  
        }
        else if("WalnutBrownie ₹100".equals(cb3.getSelectedItem())){ 
            x3="WalnutBrownie";
            a3=100;
            amt3=a3*q3;  
        } 


        if("".equals(cb4.getSelectedItem())){ 
            x4="";
            a4=0;
            amt4=a4*q4;    
        } 
        else if("CocoCola ₹20".equals(cb4.getSelectedItem())){
            x4="CocoCola ";
            a4=20;
            amt4=a4*q4;  
        } 
        else if("Sprite ₹20".equals(cb4.getSelectedItem())){ 
            x4="Sprite          ";
            a4=20;
            amt4=a4*q4; 
        }
        else if("Mirinda ₹20".equals(cb3.getSelectedItem())){ 
            x4="Mirinda";
            a4=20;
            amt4=a4*q4;  
        } 
        
        TOTAL=amt1+amt2+amt3+amt4;
          
        
        if(e.getSource() == b1){
            if(cb1.getSelectedItem()==null || cb2.getSelectedItem()==null ||cb3.getSelectedItem()==null || cb4.getSelectedItem()==null ||c1.getSelectedItem()==null || c2.getSelectedItem()==null ||"".equals(t13.getText()) ||"".equals(t23.getText()) ||"".equals(t32.getText()) ||"".equals(t42.getText()) ||"".equals(tp1.getText()) ||"".equals(tp2.getText()) ||"".equals(tp3.getText()) ){
               errorMessage.setText("Please enter all details!"); 
            }
            else{
                errorMessage.setText("Done! Click on confirm to view your invoice.");
            }
                q1= Integer.parseInt(t13.getText());
                q2= Integer.parseInt(t23.getText());
                q3= Integer.parseInt(t32.getText());
                q4= Integer.parseInt(t42.getText());    
        }
        else if (e.getSource()==b2){ 
            if(cb1.getSelectedItem()==null || cb2.getSelectedItem()==null ||cb3.getSelectedItem()==null || cb4.getSelectedItem()==null ||c1.getSelectedItem()==null || c2.getSelectedItem()==null ||"".equals(t13.getText()) ||"".equals(t23.getText()) ||"".equals(t32.getText()) ||"".equals(t42.getText()) ||"".equals(tp1.getText()) ||"".equals(tp2.getText()) ||"".equals(tp3.getText()) ){
               errorMessage.setText("Please enter all details!"); 
            }
            else{
                errorMessage.setText("Done!");
            
            INVOICE.setText("\n"+
            "\n"+
            "\n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "\n"+
            "\t\t\tPIZZAZAZA\n" +
            "\n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "\n"+
            "\tCustomer Name:"+ tp1.getText() +"\tPhone No:"+ tp2.getText()+ "\n"+
            "\n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "\tPARTICULARS   \t\tRATE\tQTY\tVALUE\n" +
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "\t1."+x1+s1+"  \t\t"+a1+"+"+extra1+"\t"+q1+"\t"+amt1+"\n"+
            "\t2."+x2+s2+"  \t\t"+a2+"+"+extra2+"\t"+q2+"\t"+amt2+"\n"+        
            "\t3."+x3+"   \t\t"+a3+"\t"+q3+"\t"+amt3+"\n"+
            "\t4."+x4+"   \t\t"+a4+"\t"+q4+"\t"+amt4+"\n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+  
            "\t\tGRAND TOTAL : "+TOTAL+"\n" +
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "\t\tThankYou for your order!\n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n"+
            "  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  \n");
            thankyoupage ty=new thankyoupage();
        }
        }
        else if(e.getSource() == b3){
            f.dispose();
            order fresh =new order();
        }
    }
    public static void main(String[] args) {
        order m = new order();
    }
}
