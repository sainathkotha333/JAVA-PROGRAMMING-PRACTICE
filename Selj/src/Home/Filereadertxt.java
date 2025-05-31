package Home;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereadertxt {

	public static void main(String[] args) throws IOException 
	{
		String fpath="C:\\Users\\kotha\\OneDrive\\Desktop\\java-practice\\Filereadersel.txt";
		BufferedReader bf=new BufferedReader(new FileReader(fpath));
		String Startline;
		while((Startline=bf.readLine())!=null)
		{
			System.out.println(Startline);
		}

	}

}
