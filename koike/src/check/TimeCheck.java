package check;


public class TimeCheck implements TimeMastaCheck {

	@Override
	public boolean check(String before, String after) {

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
