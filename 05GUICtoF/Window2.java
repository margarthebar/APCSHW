import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window2 extends JFrame implements ActionListener{//requires overriding abstract method actionPerformed
    private Container pane;
    private JButton b;
    private JLabel l;
    private JTextField t;
    private JCheckBox c,f;
    public Window2() {
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(600,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);


	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));

	b = new JButton("");
	l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
	t = new JTextField(12);
	c = new JCheckBox("Overclock!!!");

	b.addActionListener(this);
	b.setActionCommand("Do Something");

	pane.add(l);
	pane.add(b);
	pane.add(t);
	pane.add(c);
    }

    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();       
	System.out.println(s);
	if(s.equals("Do Something")){
	    String text = t.getText();
	    text+=".";
	    t.setText(text);
	}
    }

    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}
