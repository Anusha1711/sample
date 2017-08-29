package mvc;

public class MVCCalculator {
	public static void main(String args[])
	{
		CalculatorView theview=new CalculatorView();
		CalculatorModel	themodel=new CalculatorModel();	
		CalculatorController thecontroller=new CalculatorController(theview,themodel);
		theview.setVisible(true);
	}

}
