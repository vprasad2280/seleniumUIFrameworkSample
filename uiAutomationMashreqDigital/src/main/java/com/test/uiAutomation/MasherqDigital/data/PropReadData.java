package com.test.uiAutomation.MasherqDigital.data;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReadData {
	public static File f;
	public static Properties prop;
	public static FileInputStream fis;
	static String filepath="C:\\Users\\Venkat\\workspace\\FrameworkBDD\\WalletHub\\TestData.properties";
	
	public static void PropReadDataReader() throws IOException{
	 f=new File(filepath);
	fis= new FileInputStream(f);
	prop = new Properties();
	prop.load(fis);
	
	}
	
	public static String PropGetData(String Data) throws IOException{
		PropReadDataReader() ;
	String data=prop.getProperty(Data);
	return data;
		
	}
	
	
}
