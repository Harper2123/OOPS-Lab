package practical9;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

@SuppressWarnings("serial")
class Calculator extends JFrame implements ActionListener{
	
	//components of Frame Calculator
	JLabel title = new JLabel("Calculator using Swing");
	JTextField textbar = new JTextField();
	
	//numeric keys
	JButton num1 = new JButton("1");
	JButton num2 = new JButton("2");
	JButton num3 = new JButton("3");
	JButton num4 = new JButton("4");
	JButton num5 = new JButton("5");
	JButton num6 = new JButton("6");
	JButton num7 = new JButton("7");
	JButton num8 = new JButton("8");
	JButton num9 = new JButton("9");
	JButton num0 = new JButton("0");
	
	//operation keys
	JButton opAdd = new JButton("+");
	JButton opSub = new JButton("-");
	JButton opMul = new JButton("*");
	JButton opDiv = new JButton("/");
	JButton opCom = new JButton("=");
	
	//decimal key and others
	JButton dec = new JButton(".");
	JButton reset = new JButton("CE");
	JButton backspace = new JButton("<=");
	JButton sqroot = new JButton("\u221A");
	
	//calculator variable
	Double number1 = 0.00;
	Double number2 = 0.00;
	String op = "Unset";
	
	Calculator(){
		setTitle("Calculator");
		setSize(515,800);
		setVisible(true);
		setLayout(null);
		
		//customize components
		title.setFont(new Font("CALIBRI",Font.PLAIN,26));
		textbar.setFont(new Font("CALIBRI",Font.PLAIN,28));
		backspace.setFont(new Font("CALIBRI",Font.PLAIN,26));
		sqroot.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opDiv.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num7.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num8.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num9.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opMul.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num4.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num5.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num6.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opSub.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num1.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num2.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num3.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opAdd.setFont(new Font("CALIBRI",Font.PLAIN,26));
		reset.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num0.setFont(new Font("CALIBRI",Font.PLAIN,26));
		dec.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opCom.setFont(new Font("CALIBRI",Font.PLAIN,26));
		
		//disable user from editing text bar
		textbar.setEditable(false);
		textbar.setBackground(Color.white);
		textbar.setForeground(Color.red);
		textbar.setBorder(BorderFactory.createCompoundBorder(textbar.getBorder(), BorderFactory.createEmptyBorder(9, 25, 5, 5)));
		
		//set components
		title.setBounds(130, 60, 300, 40);
		textbar.setBounds(35, 120, 430, 60);
		
		//row 1
		backspace.setBounds(35, 230, 80, 60);
		sqroot.setBounds(145, 230, 200, 60);
		opDiv.setBounds(385, 230, 80, 60);
		
		//row 2
		num7.setBounds(35, 320, 80, 60);
		num8.setBounds(145, 320, 80, 60);
		num9.setBounds(265, 320, 80, 60);
		opMul.setBounds(385, 320, 80, 60);
		
		//row 3
		num4.setBounds(35, 410, 80, 60);
		num5.setBounds(145, 410, 80, 60);
		num6.setBounds(265, 410, 80, 60);
		opSub.setBounds(385, 410, 80, 60);
		
		//row 4
		num1.setBounds(35, 500, 80, 60);
		num2.setBounds(145, 500, 80, 60);
		num3.setBounds(265, 500, 80, 60);
		opAdd.setBounds(385, 500, 80, 60);
		
		//row 5
		reset.setBounds(35, 590, 80, 60);
		num0.setBounds(145, 590, 80, 60);
		dec.setBounds(265, 590, 80, 60);
		opCom.setBounds(385, 590, 80, 60);
		
		//add components
		add(title);
		add(textbar);
		
		//add row 1
		add(backspace);
		add(sqroot);
		add(opDiv);
		
		//add row 2
		add(num7);
		add(num8);
		add(num9);
		add(opMul);
		
		//add row 3
		add(num4);
		add(num5);
		add(num6);
		add(opSub);
		
		//add row 4
		add(num1);
		add(num2);
		add(num3);
		add(opAdd);
		
		//add row 5
		add(reset);
		add(num0);
		add(dec);
		add(opCom);
		
		//add Action Listeners to JButtons
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		num0.addActionListener(this);
		opAdd.addActionListener(this);
		opSub.addActionListener(this);
		opDiv.addActionListener(this);
		opMul.addActionListener(this);
		opCom.addActionListener(this);
		sqroot.addActionListener(this);
		dec.addActionListener(this);
		reset.addActionListener(this);
		backspace.addActionListener(this);
	}
	
	@SuppressWarnings("null")
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		if(ae.getSource() == opAdd) {
			
			 op = "+";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource() == opSub) {
			
			 op = "-";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource() == opMul) {
			
			 op = "*";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource() == opDiv) {
			
			 op = "/";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource() == dec) {
			
			textbar.setText(textbar.getText()+".");
		}
		else if(ae.getSource() == backspace) {
			
			try {
				textbar.setText(textbar.getText().substring(0,textbar.getText().length()-1));
			}
			catch(Exception e) {
				textbar.setText("0");
			}
		}
		else if(ae.getSource() == reset) {
			
			textbar.setText("");
		}
		else if(ae.getSource() == opCom) {
			number2 = Double.parseDouble(textbar.getText());
			if(op.equals("+")) {
				Double res = number1 + number2;
				textbar.setText(res.toString());
			}
			else if(op.equals("-")) {
				Double res = number1 - number2;
				textbar.setText(res.toString());
			}
			else if(op.equals("*")) {
				Double res = number1 * number2;
				textbar.setText(res.toString());
			}
			else if(op.equals("/")) {
				Double res = number1 / number2;
				textbar.setText(res.toString());
			}
		}
		else if(ae.getSource() == sqroot) {
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText(""+Math.sqrt(number1));
		}
		else {
			JButton b = (JButton) ae.getSource();
			textbar.setText(textbar.getText()+b.getText());
		}
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		new Calculator();
	}
}
