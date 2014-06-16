package utile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import check.DayMastaCheck;
import check.TimeMastaCheck;

public class InputCheck {

	// 日付をチェックするメソッド
	public String dayInput(String message, DayMastaCheck check)
			throws IOException {

		String input = null;
		do {
			System.out.println(message);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			input = br.readLine();

		} while (check.check(input) == false);

		return input;
	}

	// 時間チェックを行うメソッド
	public String timeInput(String message, TimeMastaCheck check)
			throws IOException {

		String time = null;
		do {
			System.out.println(message);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			time = br.readLine();

		} while (check.check(time) == false);

		return time;
	}

	// 比較を行うメソッド
	public String confirm(String message, String before, TimeMastaCheck check)
			throws IOException {

		String after = null;
		do {
			System.out.println(message);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			after = br.readLine();

		} while (check.confirmCheck(before, after) == false);

		return after;
	}

}
