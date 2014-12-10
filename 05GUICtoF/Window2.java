import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window2 extends JFrame implements ActionListener{//requires overriding abstract method actionPerformed
    private Container pane;
    private JButton b;
    private JLabel lt,lc;
    private JTextField t;
    private JCheckBox c,f;
    public Window2() {
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(600,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);


	pane = this.getContentPane();
	pane.setLayout(new GridLayout(3,1));
	
	lt = new JLabel("Input: ",null,JLabel.CENTER);
	t = new JTestField(12);
	lc = new JLabel("Convert to:",null,JLabel.CENTER);
	c = new JCheckBox("Celsius");
	f = new JCheckBox("Fahrenheit");
        b = new JButton("Convert!");


	b.addActionListener(this);
	b.setActionCommand("Convert!");

	pane.add(lt);
	pane.add(t);
	pane.add(lc);
	pane.add(c);
	pane.add(f);
	pane.add(b);
    }

    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();       
	System.out.println(s);
	if(c.isSelected()){
	    //do conversion to Celsius
	}else if(f.isSelected()){
	    //do converion to Fahrenheit
	}
    }

    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}
