package mvc;

public class CalculatorModel {
	private int value;
	public void add(int n1,int n2)
	{
		value=n1+n2;
	}
	public int calculatedvalue()
	{
		return value;
	}

}
