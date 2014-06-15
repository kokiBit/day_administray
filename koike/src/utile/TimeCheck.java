package utile;

public class TimeCheck {

	public static boolean timeCheck(String before, String after) {

		Check check = new Check();
		if (check.timeCheck(after) == true) {
			if (check.timeComfirm(before, after) == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
}
