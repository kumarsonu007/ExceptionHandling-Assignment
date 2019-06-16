package assigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GenerateException {
	public static void main(String[] args) throws FileNotFoundException
	{
		int a = 1; 
        int b = 0; 
    	System.out.println(a/b);
    	int arr[] = new int[10];
    	System.out.println(arr[11]);
        File file = new File("E:// file.txt");
        FileReader fr = new FileReader(file); 
	}
}
