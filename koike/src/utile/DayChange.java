package utile;

public class DayChange {

	// 日付をファイル用の文字列に帰るクラス
	public static String change(String str) {

		String[] strAt = str.split("/");

		int i = Integer.parseInt(strAt[1]);
		strAt[1] = String.valueOf(i);

		int j = Integer.parseInt(strAt[2]);
		strAt[2] = String.valueOf(j);

		String fileName;

		String zero = "0";

		if (i < 10 && j <10) {
			fileName = strAt[0] + zero + strAt[1] + zero + strAt[2];
		} else if(i < 10) {
			fileName = strAt[0] + zero + strAt[1] + strAt[2];
		} else if(j <10) {
			fileName = strAt[0]  + strAt[1] + zero + strAt[2];
		} else {
			fileName = strAt[0]  + strAt[1] + strAt[2];
		}

		return fileName;
	}
}
