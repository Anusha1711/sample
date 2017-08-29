package mvc;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorView extends JFrame{
	private JTextField n1=new JTextField(20);
	private JLabel additionlabel=new JLabel("+");
	private JTextField n2=new JTextField(10);
	private JButton calculatebutton=new JButton("calculalte");
	private JTextField result=new JTextField(10);
	CalculatorView()
	{
		JPanel calcpanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		calcpanel.add(n1);
		calcpanel.add(additionlabel);
		calcpanel.add(n2);
		calcpanel.add(calculatebutton);
		calcpanel.add(result);
		this.add(calcpanel);
	}
	public int getnumberone() {
	
		return Integer.parseInt(n1.getText());
	}
	public int getnumbertwo() {
		
		return Integer.parseInt(n2.getText());
	}
	public int getresult() {
		
		return Integer.parseInt(result.getText());
	}
	public void setsolution(int solution)
	{
		result.setText(Integer.toString(solution));
	} 
	void addcalculatorlistener(ActionListener Listforcalbutton) {
		calculatebutton.addActionListener(Listforcalbutton);
	}
	void displayerror(String msg)
	{
		JOptionPane.showMessageDialog(this, msg);
	}

}
