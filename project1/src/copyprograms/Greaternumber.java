package copyprograms;
public class Greaternumber {

	 static int biggestOfThree(int x, int y, int z)
	    {
	 
	        
	        if (x >= y && x >= z)
	            return x;
	 
	        else if (y >= x && y >= z)
	            return y;
	 
	        else
	 
	            return z;
	    }
	 
	   
	    public static void main(String[] args)
	    {
	        int a, b, c, largest;
	 
	        a = 5;
	        b = 10;
	        c = 3;
	        
	        largest = biggestOfThree(a, b, c);
	 
	        System.out.println(largest
	                           + " is the largest number.");
	    }
	}

