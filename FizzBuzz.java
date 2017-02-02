package com.crucerne.www.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class FizzBuzz {

	public static List<String> fizzBuzz(final int number) {
		final List<String> result_list = new ArrayList<>(number);

		for (int i = 1; i <= number; i++) {
			final String string = checkNumber(i, 3, "Fizz") + checkNumber(i, 5, "Buzz");

			if (StringUtils.isEmpty(string)) {
				result_list.add(Integer.toString(i));
			} else {
				result_list.add(string);
			}
		}
		return result_list;
	}

	private static String checkNumber(final int number, final int divisor, final String string) {
		if (number % divisor == 0) {
			return string;
		} else {
			return "";
		}
	}
	
	public static List<String> fizzBuzzSimple(final int number)
	{
		final List<String> result_list = new ArrayList<String>(number);
		
		for (int i = 1; i <= number; i++)
		{
			if (i % 15 == 0)
			{
				result_list.add("FizzBuzz");
			}
			else if (i % 3 == 0)
			{
				result_list.add("Fizz");
			}
			else if (i % 5 == 0)
			{
				result_list.add("Buzz");
			}
			else
			{
				result_list.add(Integer.toString(i));
			}
		}
		return result_list;
	}
}
