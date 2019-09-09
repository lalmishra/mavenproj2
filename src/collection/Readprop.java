package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readprop {

	public static void main(String[] args) throws IOException {

		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("C://Users//Nivedita Roy//eclipse-workspace//collection//lal.properties");
		pr.load(fis);
		String s = pr.getProperty("myname");
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
	}

}
