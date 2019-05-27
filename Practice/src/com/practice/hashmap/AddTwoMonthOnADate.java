package com.practice.hashmap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class AddTwoMonthOnADate {

	public static void main(String arg[]) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String actualDate = "2018-11-26";

		Date current = sdf.parse(actualDate);

		System.out.println(current);

		Calendar c = Calendar.getInstance();

		c.setTime(current);

		c.set(Calendar.MONTH, (c.get(Calendar.MONTH) + 2));

		current = c.getTime();

		System.out.println(current);

		c.setTime(current);

		System.out.println(c.get(Calendar.YEAR) + "-"
				+ String.format("%2s", (c.get(Calendar.MONTH) + 1)).replace(' ', '0') + "-" + "15");

	}

}
