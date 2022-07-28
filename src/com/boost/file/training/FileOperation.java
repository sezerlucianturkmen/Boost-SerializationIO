package com.boost.file.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {

		FileOperation fileOperation = new FileOperation();
		fileOperation.menu();

	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("0-Exit");
			System.out.println("1-Create a File");
			System.out.println("2-Add");
			System.out.println("3-Read");
			System.out.println("4-Change Letter");
			System.out.println("5-Delete a File");
			System.out.println("Please enter any selection...");
			input = Integer.parseInt(scanner.nextLine());

			switch (input) {

			case 1 -> {
				try {
					createFile(FileConstant.file);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			case 2 -> {
				addToFile(FileConstant.file);
			}
			case 3 -> {
				readFile(FileConstant.file);
			}
			case 4 -> {
				changeLetter(readFileAsString(FileConstant.file));
			}
			case 5 -> {
				try {
					deleteFile(FileConstant.file);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			}
		} while (input != 0);

	}

	public void createFile(File file) throws Exception {

		if (file.exists()) {
			throw new Exception("File is already exist.");
		} else {
			System.out.println("The file creation is on progress.");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("The file is created.");
		}
	}

	public void addToFile(File file) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to write into the file?");
		String string = scanner.nextLine();
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(string + "\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("it is successfully added.");
	}

	public void readFile(File file) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String read;
			System.out.println("------------------"
					+ file.getName().substring(0, (file.getName().length() - 4)).toUpperCase() + "-----------------");
			while ((read = reader.readLine()) != null) {
				System.out.println(read);
			}
			System.out.println("----------------THE END----------------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String readFileAsString(File file) {
		BufferedReader reader = null;
		String text = "";
		try {
			String read = "";
			reader = new BufferedReader(new FileReader(file));
			while ((read = reader.readLine()) != null) {
				text += read + "\n";
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	public void changeLetter(String text) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which charachter would you like to change");
		String oldc = scanner.nextLine();
		System.out.println("Enter the new charachter");
		String newc = scanner.nextLine();

		text = text.replace(oldc, newc);
		System.out.println(text);

		FileConstant.file.delete();

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(FileConstant.file));
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("it is successfully changed.");

	}

	public void deleteFile(File file) throws Exception {

		if (file.exists()) {
			System.out.println("On progress of deleting...");
			Thread.sleep(1000);
			file.delete();
			System.out.println("The file is deleted.");
		} else {
			throw new Exception("File is already exist.");
		}
	}
}
