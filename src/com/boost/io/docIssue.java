package com.boost.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.boost.entity.Log;

public class docIssue {

	public void saveLog(Log log) {

		try {

			FileOutputStream fileOut = new FileOutputStream("C:\\log_errors\\log_errors.text");
			ObjectOutputStream write = new ObjectOutputStream(fileOut);
			write.writeObject(write);
			write.close();

		} catch (Exception e) {
			System.out.println("Something went wrong.." + e.toString());
		}

	}

}
