package assigment;

import java.io.File;

public class ListAllFiles {
	
	static void RecursivePrint(File[] arr, int level)  
    {  
        for (File f : arr)  
        { 
            for (int i = 0; i < level; i++) 
                System.out.print("\t"); 
             
            if(f.isFile())  
                System.out.println(f.getName()); 
              
            else if(f.isDirectory())  
            {  
                System.out.println("[" + f.getName() + "]");
                RecursivePrint(f.listFiles(), level + 1); 
            } 
        }
    } 

	public static void main(String[] args) 
    { 
		String dirpath = "C:/Users/mr.sonu/eclipse-workspace/Files"; 
		File path = new File(dirpath);
		
		if(path.exists() && path.isDirectory()) 
        {  
            File arr[] = path.listFiles(); 
              
            System.out.println("Files from main directory : " + path);   
            RecursivePrint(arr, 0);  
       }  
    }
}
