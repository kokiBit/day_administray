package menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import utile.DumpFile;

public class Regist implements Menu {

	// dumpFileを扱うクラスを作成
	public static DumpFile dumpFile;

	public void go() throws IOException {

		System.out.println("何日の進捗を登録しますか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String fi = "C:" + str + ".csv";

		// 日付にファイルを持たす。
		File file = new File(fi);

		if (file.exists()) {
			// ファイルが存在した場合の処理

			System.out.println("ファイルは存在します。");

		} else {

			file.createNewFile();
			System.out.println("何時に出社しました？");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			String str2 = br1.readLine();

			// 書き出すファイルを読み出す。
			String set = setTime(str2);

			 FileWriter fw = new FileWriter(file, false);  //※１
	         PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			 pw.println(set);

			 pw.close();
		}

	}

	public void setDumpFile(DumpFile file) {

	}

	// 時間を登録するメソッド
	public String setTime(String str) throws IOException {

		System.out.println(str + "から何をしましたか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();

		System.out.println(str1 + "を何時まで行いましたか");

		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(System.in));
		String str2 = br1.readLine();

		// 書式を決定する。
		String set = "『" + str + "-" + str2 + "』" + str1;

		System.out.println(set + "を登録しますか(y/n)");

		return set;

	}

}
