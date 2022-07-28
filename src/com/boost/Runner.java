package com.boost;

import com.boost.entity.Log;

public class Runner {

	public static void main(String[] args) {

		try {
			String text = null;
			String subString = text.substring(5);

		} catch (NullPointerException e) {
			System.out.println("Something went wrong.. " + e.toString());
			Log log = new Log(e.toString(), "Runner", "main", System.currentTimeMillis(),
					"There is a error related to null value on 15th row");
		} catch (Exception e) {
			System.out.println("Something went wrong.. " + e.toString());
		}

	}

}
