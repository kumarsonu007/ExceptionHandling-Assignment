package assigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleExceptions {

	public static void main(String[] args)
	{
		int a = 1; 
	    int b = 0; 
	    try
	    { 
	    	System.out.println(a/b);
	    } 
	    catch(ArithmeticException ex) 
	    { 
	        System.out.println(ex.getMessage()); 
	    } 
	    int arr[] = new int[10];
	    try
	    { 
	    	System.out.println(arr[11]);
	    } 
	    catch(ArrayIndexOutOfBoundsException ex) 
	    { 
	        System.out.println(ex.getMessage()); 
	    } 
	    try {  
	        File file = new File("E:// file.txt"); 
	        FileReader fr = new FileReader(file); 
	    } 
	    catch (FileNotFoundException e) { 
	        System.out.println("File does not exist"); 
	    } 
	}
}
