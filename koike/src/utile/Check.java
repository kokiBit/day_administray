package utile;

public class Check {

	//日付チェックの正規表現
	public static final String MATCH_DAY = "^[2]{1}[0-9]{3}/[01]?[0-9]/[0123]?[0-9]$+$";

	//日付チェックメソッド
	public boolean dayCeck(String str) {


		if (str.matches(MATCH_DAY)) {
			return true;
		} else {
			return false;
		}
	}
}
