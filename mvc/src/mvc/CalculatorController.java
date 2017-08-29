package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
  private CalculatorView theview;
  private CalculatorModel themodel;
  public CalculatorController(CalculatorView theview,CalculatorModel themodel)
  {
	  this.theview=theview;
	  this.themodel=themodel; 
	  this.theview.addcalculatorlistener(new CacluateListener());
  }
  
  class CacluateListener implements ActionListener
  {
	 	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 int n1,n2=0;
		  try {
			  n1=theview.getnumberone();
			  n2=theview.getnumbertwo();
			  themodel.add(n1, n2);
			  theview.setsolution(themodel.calculatedvalue());
		  }
		  catch(NumberFormatException ex)
		  {
			  theview.displayerror(" you need to enter 2 num");
		  }
	}

	
  }
}
