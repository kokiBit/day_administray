package utile;

public class Check {

	// 日付チェックの正規表現
	public static final String MATCH_DAY = "^[2]{1}[0-9]{3}/[01]?[0-9]/[0123]?[0-9]$+$";

	// 日時チェックの正規表現
	public static final String MATCH_TIME = "^([01]?[0-9]|2[0-3]):[0-5]?[0-9]$";

	// 日付チェックメソッド
	public boolean dayCeck(String str) {

		if (str.matches(MATCH_DAY)) {
			return true;
		} else {
			return false;
		}
	}

	// 日時のチェックメソッド
	public boolean timeCheck(String str) {

		if (str.matches(MATCH_TIME)) {
			return true;
		} else {
			return false;
		}
	}

	// 日時の比較メソッド
	public boolean timeComfirm(String befor, String after) {

		String[] beforTime = befor.split(":");
		//int型に変換
		int beforHour = Integer.parseInt(beforTime[0]);
		int beforMinute = Integer.parseInt(beforTime[1]);

		String[] afterTime = after.split(":");
		//int型に変換
		int afterHour = Integer.parseInt(afterTime[0]);
		int afterMinute = Integer.parseInt(afterTime[1]);


		//日時の大小チェック
		if(beforHour==afterHour) {  //時間が一緒の場合
			if(beforMinute<afterMinute) {  //時間がafterの方が多いとtrueを返す。
				return true;
			}
			else {
				return false;
			}
		}
		else if(beforHour<afterHour) { //時間がafterの方が多いとtrueを返す。
			return true;
		}
		else {
			return false;
		}
	}

}
