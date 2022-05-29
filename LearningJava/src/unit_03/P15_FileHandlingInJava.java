package unit_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandlingInJava {

	public static void main(String[] args) {
		
		FileInJava obj=new FileInJava();
		try {
			obj.takeInputFromAFileNotFromConsole();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		obj.saveOutputIntoAFile();
		obj.createALogFile(); 
		try {
			obj.countWords();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class FileInJava
{
	
	void takeInputFromAFileNotFromConsole() throws IOException
	{
		String path="/Users/Lavesh Kashyap/git/JavaPrograms/LearningJava/src/unit_03/input.txt";
		File file=new File(path);
		BufferedReader br=new BufferedReader (new FileReader(file));
		
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}  
		br.close(); 
		BufferedReader br1=new BufferedReader (new FileReader(file));
	     //list that holds strings of a file
		List<String>listOfStrings=new ArrayList<String>();
		//read entire line as string
		
		String line = br1.readLine();

		while (line != null) {
			listOfStrings.add(line);
			line = br1.readLine();
		}
        for(String str:listOfStrings)
        {
        	System.out.println(str);
        }
        System.out.println("\n");
        
        br1.close();
		
	}
	void saveOutputIntoAFile()
	{
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("/Users/Lavesh Kashyap/git/JavaPrograms/LearningJava/src/unit_03/output.txt");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		try {
			f_writer.write(text);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			f_writer.close();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	void createALogFile()
	{
           int a=10;
           a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\Lavesh Kashyap\\git\\JavaPrograms\\LearningJava\\src\\unit_03\\log.txt",true);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try { 
			f_writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	void countWords() throws IOException
	{
		String path="/Users/Lavesh Kashyap/git/JavaPrograms/LearningJava/src/unit_03/input.txt";
		File file=new File(path);
	    BufferedReader br=new BufferedReader (new FileReader(file)); 
		int count=0;
		int ch;
		while((ch=br.read())!=-1)
		{
			if((char)ch==' '||(char)ch=='\n')
			{
				count++;
			}
		}
		count++;
		System.out.println("total words in the file: "+count);
	}
}
