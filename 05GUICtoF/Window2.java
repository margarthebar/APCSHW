import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window2 extends JFrame implements ActionListener{//requires overriding abstract method actionPerformed
    private Container pane;
    private JButton b;
    private JLabel lt,lc;
    private JTextField t;
    private JRadioButton c,f;
    private ButtonGroup group;
    public Window2() {
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(400,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);


	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,3));

	lt = new JLabel("Input: ",null,JLabel.CENTER);
	t = new JTextField(12);
	lc = new JLabel("Convert to:",null,JLabel.CENTER);
	c = new JRadioButton("Celsius",true);
	f = new JRadioButton("Fahrenheit",false);
        b = new JButton("Convert!");
	group = new ButtonGroup();
	group.add(c);
	group.add(f);

	pane.add(lc);
	pane.add(c);
	pane.add(f);
	pane.add(lt);
	pane.add(t);
	pane.add(b);

	b.addActionListener(this);
	b.setActionCommand("Convert!");
    }

    public double convert(double num){
	double ans = 0.0;
	if(c.isSelected()){
	    ans = (num-32)*(5.0/9.0);
	}else{
	    ans = (num+32)*(9.0/5.0);
	}
	return ans;
    }

    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();       
	String input = t.getText();
	double in = Double.parseDouble(input);
	t.setText(""+convert(in));
	if(c.isSelected()){
	    f.setSelected(true);
	    c.setSelected(false);
	}else{
	    c.setSelected(true);
	    f.setSelected(false);
	}
    }

    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}
