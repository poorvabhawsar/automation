package com.slokam.examples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileRead {

	public void test1() {

		File file = new File("D:\\ads.txt");

		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int d = 0;
			while ((d = bis.read()) != 1) {
				char c = (char) d;
				System.out.print(c);
			}

			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test2() {
		File file = new File("D:\\ads.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			
			String st = "";
			while((st = br.readLine())!=null) {
				System.out.println(st);
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void test3() {
		File file = new File("D:\\abc.txt");
		try {
			FileWriter fr = new FileWriter(file);
			BufferedWriter br = new BufferedWriter(fr);
			String st = "bharath";
			br.write(st);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void test4() {
		File file = new File("D://app.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			
			String val = props.getProperty("url");
			System.out.println(val);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		fr.test4();
	}
}
