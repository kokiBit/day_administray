package menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Regist implements Menu {

	public void go() throws IOException {

		System.out.println("何日の進捗を登録しますか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();



		//日付にファイルを持たす。
		File file = new File("C:/"+str+".csv");

		if (file.exists()) {
			//ファイルが存在した場合の処理
			System.out.println("何時に出社しました？");

		} else {

			//ファイルを新規で作成
			file.createNewFile();

			System.out.println("何時に出社しました？");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			String str2 = br1.readLine();

			setTime(str2);

		}

	}

	public void setDumpFile(String file) {

	}

	// 時間を登録するメソッド
	public void setTime(String str) throws IOException {

		System.out.println(str + "から何をしましたか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();

		System.out.println(str1 + "を何時まで行いましたか");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br1.readLine();



	}

}
