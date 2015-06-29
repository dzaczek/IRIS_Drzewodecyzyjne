package SISEFLOWERS.IRIS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Lab extends GetFileFromWeb implements Ilab  {

	protected static List<Flower> flowers=new ArrayList<Flower>();
	

	
	   void copyDataFromStackToArraryClass() {
		try {
			getfilenow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<String> iter = iris.iterator();
		 System.out.println("Check0");
		 int i=0;
		while (iter.hasNext())
		{
			
			i=i+1;
			System.out.println(i);
			List<String> item =Arrays.asList(iter.next().split("[\\s,]+"));
			
			
				flowers.add(new Flower(item.get(4), item.get(0),item.get(1),item.get(2), item.get(3)));

			   
		}
		
	   }
	   
	public void printAllFLowers(){
		for(int i=0;i<flowers.size();i++)
		{
			System.out.println(flowers.get(i).toString());
		}
	}
	public void addFlower(String name, float first, float second,float third,float fourth)
	{
		flowers.add(new Flower(name,first,second,third,fourth));
	}
	
	
	public Lab(){
		copyDataFromStackToArraryClass();
	}
	
	public static void main(String[] args)
	{
		 System.out.println("Check3");
		 Lab a=new Lab();
		//a.printAllFLowers();
		}
	
	
}

