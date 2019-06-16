package assigment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:/Users/mr.sonu/eclipse-workspace/Files/file1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:/Users/mr.sonu/eclipse-workspace/Files/file2.txt",true);
			String s;
			
			while((s=br.readLine()) != null)
			{
				fw.write(s);
				fw.flush();
			}
			br.close();
			fw.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
