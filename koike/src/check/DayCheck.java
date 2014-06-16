package check;



public class DayCheck implements DayMastaCheck {


	//stringを渡して、日付をチェックするクラス。
	@Override
	public boolean check(String str) {
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
