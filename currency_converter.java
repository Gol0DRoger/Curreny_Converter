import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class currency_converter{ 
  
    public static void Ca() 
    { 
  
        JFrame f = new JFrame("RUPEE_CONVERTER"); 
  
        JLabel l1, l2, l3, l4; 
        JTextField t1, t2, t3, t4; 
        JButton b1, b2, b3, b4, b5, b6, b7; 

        l1 = new JLabel("Rupees:"); 
        l1.setBounds(20, 40, 60, 30); 
        l2 = new JLabel("Dollars:"); 
        l2.setBounds(170, 40, 60, 30); 
        l3 = new JLabel("Euros:");
        l3.setBounds(320, 40, 60, 30);
        l4 = new JLabel("Japanese Yen:");
        l4.setBounds(450, 40, 80, 30);
  
        t1 = new JTextField("0"); 
        t1.setBounds(80, 40, 60, 30); 
        t2 = new JTextField("0"); 
        t2.setBounds(220, 40, 60, 30);
        t3 = new JTextField("0"); 
        t3.setBounds(360, 40, 60, 30); 
        t4 = new JTextField("0"); 
        t4.setBounds(540, 40, 60, 30); 
   
        //Buttons
        b1 = new JButton("INR-D"); 
        b1.setBounds(50, 80, 80, 15); 
        b5 = new JButton("INR-E");
        b5.setBounds(50, 120, 80, 15);
        b6 = new JButton("INR-JY");
        b6.setBounds(50, 160, 80, 15);
        b2 = new JButton("Dollar"); 
        b2.setBounds(190, 80, 80, 15); 
        b3 = new JButton("CLOSE"); 
        b3.setBounds(260, 150, 75, 35);
        b4 = new JButton("Euro"); 
        b4.setBounds(350, 80, 80, 15);  
        b7 = new JButton("Yen"); 
        b7.setBounds(490, 80, 80, 15);  
  
        //Action listener 
        b1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            {  
                double d 
                    = Double.parseDouble(t1.getText()); 
  
                // Converting rupees to dollars 
                double d1 = (d / 83.4); 
  
                String str1 = String.valueOf(d1); 
                t2.setText(str1); 
            } 
        }); 
  
        // Adding action listener 
        b2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                // Converting to double 
                double d2 
                    = Double.parseDouble(t2.getText()); 
  
                // converting Dollars to rupees 
                double d3 = (d2 * 83.4); 
  
                String str2 = String.valueOf(d3); 
  
                // Placing it in the text box 
                t1.setText(str2); 
            } 
        }); 
        
        b4.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                double d4 
                    = Double.parseDouble(t3.getText()); 
  
                double d5 = (d4 * 90); 
  
                String str3 = String.valueOf(d5); 
  
                t1.setText(str3); 
            } 
        }); 

        b5.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                double d6 
                    = Double.parseDouble(t1.getText()); 
  
                double d7 = (d6 / 90); 
  
                String str4 = String.valueOf(d7); 
  
                t3.setText(str4); 
            } 
        }); 

        b6.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                double d8 
                    = Double.parseDouble(t1.getText()); 
  
                double d9 = (d8 * 2); 
  
                String str5 = String.valueOf(d9); 
  
                t4.setText(str5); 
            } 
        }); 

        b7.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                double d10
                    = Double.parseDouble(t4.getText()); 
  
                // converting Yen to rupees 
                double d11 = (d10 / 2); 
  
                String str6 = String.valueOf(d11); 
  
                t1.setText(str6); 
            } 
        }); 
        


  
        // Action listener to close the form 
        b3.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                f.dispose(); 
            } 
        }); 
  
        // Default method for closing the frame 
        f.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) 
            { 
                System.exit(0); 
            } 
        }); 
  
        // Adding the created objects 
        // to the form 
        f.add(l1); 
        f.add(t1); 
        f.add(l2); 
        f.add(t2);
        f.add(l3);
        f.add(t3); 
        f.add(l4);
        f.add(t4);
        f.add(b1); 
        f.add(b2); 
        f.add(b3); 
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        
  
        f.setLayout(null); 
        f.setSize(800, 600); 
        f.setVisible(true); 
    } 
  
    public static void main(String args[]) throws Exception
    { 
        String str ="com.jtattoo.plaf.luna.LunaLookAndFeel";
        UIManager.setLookAndFeel(str);
        Ca(); 
    } 
} 