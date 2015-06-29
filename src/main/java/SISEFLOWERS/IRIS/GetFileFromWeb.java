package SISEFLOWERS.IRIS;
//test
//test2 commit
//$
import java.io.*;
import java.net.*;
import java.util.Stack;

public class GetFileFromWeb {
	 
   protected static Stack<String> iris = new Stack<String>();
	 
	public void getfilenow() throws Exception {

	    URL oracle = new URL("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data");
	    BufferedReader in = new BufferedReader(
	    new InputStreamReader(oracle.openStream()));

	    String inputLine;
	    while ((inputLine = in.readLine()) != null)
	    //	System.out.println(inputLine.toString());
	    	iris.push(inputLine);
	    in.close();
	}
	
//	public static void main(String[] args)
//	{
//		System.out.println("OMOM");
//		 try {
//			GetFileFromWeb.getfilenow();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
} 