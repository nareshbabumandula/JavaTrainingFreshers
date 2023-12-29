package com.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionsTest {

	void checkedExceptionExample() throws IOException  {
		File file = new File("./files/data.txt");
		try {
			FileReader fr = new FileReader(file);
			int n;
			while ((n=fr.read())!=-1) {
				System.out.println((char)n);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void checkedExceptionBufferedReaderExample() throws IOException  {
		File file = new File("./files/data.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void checkedExceptionFileWriterExample() throws IOException  {
		File file = new File("./files/output1.txt");
		try {
			FileWriter fw=new FileWriter(file);    
			fw.write("Welcome to java.");    
			fw.close();    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void checkedExceptionBufferedWriterExample() throws IOException  {
		File file = new File("./files/data2.txt");
		try {
			FileWriter fw=new FileWriter(file);    
			BufferedWriter br = new BufferedWriter(fw);
			br.write("hello world");
			br.write("\n");
			br.write("welcome");
			br.write("\n");
			br.write("to core java");
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}




	public static void main(String[] args) throws IOException {
		CheckedExceptionsTest cet = new CheckedExceptionsTest();
		//cet.checkedExceptionExample();
		//cet.checkedExceptionBufferedReaderExample();
		//cet.checkedExceptionFileWriterExample();
		cet.checkedExceptionBufferedWriterExample();
	}

}
