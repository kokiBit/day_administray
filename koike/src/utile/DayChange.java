package utile;

public class DayChange {

	//日付をファイル用の文字列に帰るクラス
	public static String change(String str) {

		String[] strAt = str.split("/");
		String fileName = strAt[0] + strAt[1] + strAt[2];

		return fileName;
	}
}
