package utile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {


	//何日の日付かチェックする。
	public static String day() throws IOException {

		System.out.println("何日の進捗を登録しますか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		boolean ch;
		ch = DayCheck.check(str);

		if(ch==false) {
			System.out.println("指定された文字ではありません。再入力してください。");
			day();
		}

		return str;
	}
	
	
	//何時に出社したかチェックする。
	public static String start() {
		
		System.out.println("何時に出社しました？");
	}

}
