package utile;

import check.DayMastaCheck;

public class Input {

	public String input(String message, DayMastaCheck check) {
		System.out.println(message);
		String input = null;
		do {
			// readline;
			input = "aaa";
		} while (check.check(input));
		return input;
	}
}
