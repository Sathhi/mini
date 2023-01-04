package amgtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Readandwrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//read from properties file
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\jayam\\eclipse-workspace\\Miniproj\\src\\test\\resources\\properties\\testdata.properties");
		p.load(fis);
		System.out.println(p.getProperty("browser"));
		
		//writing to the properties file
		FileOutputStream fos=new FileOutputStream("C:\\Users\\jayam\\eclipse-workspace\\Miniproj\\src\\test\\resources\\properties\\testdata.properties");
		p.setProperty("testdata", "3444");
		p.store(fos, "customerdata");
	}

}
