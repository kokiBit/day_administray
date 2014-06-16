package check;


public class TimeCheck implements TimeMastaCheck {

	@Override
	public boolean confirmCheck(String before, String after) {

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

	@Override
	public boolean check(String time) {

		Check check = new Check();
		if (check.timeCheck(time) == true) {
			return true;
		}else {
			return false;
		}
	}

}
