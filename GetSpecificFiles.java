package assigment;

import java.io.File;

public class GetSpecificFiles {
	
	public static void main(String[] args)
	{
		String directoryPath = "C:/Users/mr.sonu/eclipse-workspace/Files/asd";
		
		  File dir = new File(directoryPath);
		  for (File file : dir.listFiles()) {
		    if (file.getName().endsWith((".txt"))) {
		    	System.out.println(file.getName());
		    	file.delete();
		    }
		  }
	}
}
