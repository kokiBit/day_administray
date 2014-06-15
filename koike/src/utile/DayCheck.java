package utile;

public class DayCheck {


	//stringを渡して、日付をチェックするクラス。
	public static boolean check(String str) {
		Check check = new Check();
		if (check.dayCeck(str) == true) {
			if (check.lastDayCheck(str)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
