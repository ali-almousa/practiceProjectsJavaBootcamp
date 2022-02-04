package practiceProjects;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling{
	
	public static void main(String[] args) throws IOException{
		
		// WRITING TO A FILE 
		try(FileWriter output = new FileWriter("./output.txt");){
			output.write("This is a practice project for file handling");
		}
		
		// APPENDING TO A FILE 
		try(FileWriter output = new FileWriter("./output.txt", true);){
			output.append("\nThis is an appended text");
		}
		
		// READING FROM A FILE 
		try(FileReader input = new FileReader("./output.txt");){
			int i;
			while((i = input.read()) != -1) {
				System.out.print((char)i);
			}
		}
		
	}
	
}
