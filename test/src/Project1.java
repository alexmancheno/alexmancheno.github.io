import java.util.StringTokenizer;
import java.lang.NumberFormatException;
import javax.swing.*;

public class Project1{
	public static void main(String[] args){
		Car[] array = new Car[listSize(args[0])];
		Car[] arraySort = new Car[listSize(args[0])];
		
		fillArray(array, args[0]);
		fillArraySort(array, arraySort);
		selectionSort(arraySort);
		
		CarGUI carGui = new CarGUI("Unsorted vs Sorted Cars");
		carGui.showGUI();
		carGui.arrayDisplay(array, arraySort);
	}
	
	private static int listSize(String file){
		TextFileInput input = new TextFileInput(file);
		int count = 0;
		String line = input.readLine();
		while (line != null){
			line = input.readLine();
			count++;
		}
		return count;
	}
	
	public static void fillArray(Car[] array, String file){
		TextFileInput input = new TextFileInput(file); // for Input file
		String line = input.readLine();
		String delimiter = ",";
		
		StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
		int i = 0;
		while (line != null){
			try{
				tokenizer = new StringTokenizer(line,delimiter);
				while (tokenizer.hasMoreTokens()){
					tokenizer = new StringTokenizer(line,delimiter);
					
					String make = tokenizer.nextToken();
					String model = tokenizer.nextToken();
					int year = Integer.parseInt(tokenizer.nextToken());
					int mileage = Integer.parseInt(tokenizer.nextToken());
					array[i++] = new Car(make, model, year, mileage);
					
					line = input.readLine();
				}
			}
			catch (Exception e){
				System.out.println(line);
				line = input.readLine();
			}
		}
	}
	
	public static void fillArraySort(Car[] array, Car[] arraySort){
		for (int i = 0; i < Car.count(); i++)
			arraySort[i] = array[i];
	}
	
	public static void selectionSort(Car[] array){
		for (int i = 0; i < Car.count() - 1; i++){
			int min = i;
			for (int j = i + 1; j < Car.count(); j++){
				if (0 > array[j].compareTo(array[min]))
					min = j;
			}
			Car temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}	
}