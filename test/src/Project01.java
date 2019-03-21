
import java.util.StringTokenizer;

public class Project01
{
	public static TextFileInput myFile; 
	public static String line;
	public static int cars[];
	static Cars[] unSorted = new Cars[13];
	static Cars[] Sorted = new Cars[13];
	
	
	
    

	public static void main(String[] args) 
    {
        // Initialize the global static variable, 'Cars'
    		
    	myFile = new TextFileInput("cars.txt");
        line = myFile.readLine();
        String delimiter = ",";
        StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
        String make = null;
        String model = null;
        int year = 0;
        int mileage = 0;
        int count = 0;
        
    // when there is no longer token on following line the while stop
        while (tokenizer.hasMoreTokens()) 

        {
        	// takes in the tokens
        	if ( tokenizer.countTokens() == 4)
        	{
        		
         make = tokenizer.nextToken();
         model = tokenizer.nextToken();
        // change the type of year and mileage to int
         year =  Integer.parseInt(tokenizer.nextToken());
         mileage = Integer.parseInt(tokenizer.nextToken());
         Cars mycar = new Cars(make, model, year, mileage);
         
         // go to unSorted
           unSorted[count] = mycar;
           selectionSort(unSorted);
           Sorted [count] =  mycar;
           count++;
            }
        	
        	
           line = myFile.readLine();	
           System.out.println (make);
         }
       

       
        CarsGUI myGui = new CarsGUI(unSorted, Sorted, count, count);        
        myGui.showgui();
        myGui.displayCar(unSorted, Sorted, count, count);
   
    }   
	
	public static void selectionSort (Cars[] input) 
	{
		 for (int i = 0; i < input.length; i++)
	        {
	            Cars min = input[i];
	            // store the index of smallest
	            int smallIndex = i;
	            for (int j = i + 1; j < input.length; j++)
	            {
	            	// while there is a line you compare the two makes
	            	if ( input [j] != null)
	            	{
	            		if (min.getMake().compareTo(input[j].getMake()) > 0)
	            		{
	            			min = input[j];
	            			smallIndex = j;
	            		}	
	            	
	                    
	                }
	            }
	            swap(input, i, smallIndex);
	         }
	}
	  //swap  the values  
	  private static void swap(Cars[] input, int i, int j)
	    {
	        Cars temp = input[i];
	        input[i] = input[j];
	        input[j] = temp;
	    }   


}	 
 