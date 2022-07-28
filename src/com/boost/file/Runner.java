package com.boost.file;

import java.io.File;
import java.nio.file.Path;

public class Runner {

	public static void main(String[] args) {
		File file = new File("empty.txt");
		Path path = Path.of("error.txt");
		Path path2 = Path.of("error2.txt");

		System.out.println("Is it exist...: " + file.exists());
		System.out.println("Path route...: " + file.getAbsolutePath());
		System.out.println("File name...: " + file.getName());
		System.out.println("Location where it is...: " + file.getParent());
		System.out.println("Is it a file...: " + file.isFile());
		System.out.println("Lenght by byte...: " + file.length());
		System.out.println("Last modified time...: " + file.lastModified());

	}

}
