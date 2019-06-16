package assigment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileWithinDirectories {
	
	public static void main(String[] args) throws IOException
	{
		Path src = Paths.get("C:/Users/mr.sonu/eclipse-workspace/Files/efvre");
        Path dest = Paths.get("C:/Users/mr.sonu/eclipse-workspace/Files/asd");

        //copy source to target using Files Class
        Files.copy(src, dest);	

	  }

}
