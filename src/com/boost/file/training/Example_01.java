package com.boost.file.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example_01 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("trial.txt");
			FileInputStream fis = new FileInputStream("trial.txt");

			fos.write(65);
			byte[] array = { 101, 80, 88 };
			fos.write(array);
			String string = "Hello World.";
			fos.write(string.getBytes());

			int flag = -1;
			while ((flag = fis.read()) != -1) {

				System.out.println((char) fis.read());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// BUFFERED//////////////////////////////////

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("trial.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("trial.txt"));
			writer.write("row 1" + "\n");
			writer.write("row 2");
			writer.flush();
			String flag2;
			while ((flag2 = reader.readLine()) != null) {

				System.out.println(flag2);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
