import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GuiDemo implements ActionListener{
	//JFrame: windows frame
	private JFrame frame;
	//JPanel: separate section in a frame
	private JPanel panel;
	//JLabel: user can click
	private JLabel label;
	private JLabel output;
	//JTextField: for user input
	private JTextField textField1;
	private JTextField textField2;
	//JButton
	private JButton button;
	//constructor: to initialize the instance variables
	
	public GuiDemo() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(350, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		panel = new JPanel();
		panel.setBackground(Color.PINK);
  
		label = new JLabel();
		label.setText("Enter number");
		label.setForeground(Color.white);
		output = new JLabel();
 
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
 
		button = new JButton("Find sum");
		button.addActionListener(this);
  
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);

		frame.add(panel);
 
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println(textField1.getText() + textField2.getText());
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double sum = num1+num2;
		output.setText(String.valueOf(sum));
	}
}
