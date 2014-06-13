package utile;



public class Check {

	//日付チェックの正規表現
	public static final String MATCH_DAY = "^[2]{1}[0-9]{3}/[01]?[0-9]/[0123]?[0-9]$+$";

	private static final String DATE_PATTERN = "yyyy.MM.dd HH:mm";

	//日付チェックメソッド
	public boolean dayCeck(String str) {

	/*	DateFormat foramt=new SimpleDateFormat("yyyy/MM/dd");
		Date date = format.parse(str);
		*/
		if (str.matches(MATCH_DAY)) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
