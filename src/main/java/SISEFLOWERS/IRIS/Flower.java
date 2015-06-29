package SISEFLOWERS.IRIS;
public class Flower {
	String NameOfFlower;
	float[] datairis=new float[4] ;
	
	
	
	public Flower(String NameOfFlower,float[] datairis) {
		//super();
		this.NameOfFlower=NameOfFlower;
		this.datairis=datairis;
	}

	public Flower(String NameOfFlower,float first, float second,float third,float fourth)
	{
		this.NameOfFlower=NameOfFlower;
		this.datairis[0]=first;
		this.datairis[1]=second;
		this.datairis[2]=third;
		this.datairis[3]=fourth;
	}
	
	public Flower(String NameOfFlower,String first, String second,String third,String fourth)
	{
		
		this.NameOfFlower=NameOfFlower;
		this.datairis[0]=floatToString(first);
		this.datairis[1]=floatToString(second);
		this.datairis[2]=floatToString(third);
		this.datairis[3]=floatToString(fourth);
		System.out.println(first+" "+second+" "+third+" "+fourth+"	"+NameOfFlower);
	}
	@Override
	public String toString(){
		return "Flower [NameOfFlower="+NameOfFlower+", datairis="+ datairis[0]+"]";
	
	}
	
	private float floatToString(String stringfloat){
		 float f = 0 ;
		  try
		    {
		       f = Float.valueOf(stringfloat.trim()).floatValue();
		      return f;
		    }
		    catch (NumberFormatException nfe)
		    {
		      System.out.println("NumberFormatException: " + nfe.getMessage());
		      
		    }
		return f;
		
		
		
	}
	
}