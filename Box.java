public class Box
{
      private double length,breadth,height;
      
      
      //constructor
      
      public Box(double l,double b,double h)
      {
    	  length=l;
    	  breadth=b;
    	  height=h;
      }
      public void setLength(double length)
      {
    	  this.length=length;
      }
      
    
	public void setBreadth(double breadth)
      {
    	  this.breadth=breadth;
      }
      
      public void setHeight(double height)
      {
    	  this.height=height;
      }
      public double getLength() {
  		return length;
  	}

  	public double getBreadth() {
  		return breadth;
  	}

  	public double getHeight() {
  		return height;
  	}

      public double volume()
      {
    	  return length*breadth*height;
      }
      public static void main(String args[])
      {
    	  Box b=new Box(23,58,89);
    	
    	  b.setLength(10.0);
    	  b.setBreadth(10.0);
    	  b.setHeight(10.0);
    	  
    	  System.out.println("Volume:"+b.volume());
    	  
      }
      
      
      

}
