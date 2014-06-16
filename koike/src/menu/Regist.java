package menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import utile.Check;
import utile.DumpFile;
import utile.Input;

public class Regist implements Menu {

	// dumpFileを扱うクラスを作成
	public static DumpFile dumpFile;

	public void go() throws IOException {


		//日付の入力チェックを行う
		String str = Input.day();

		String fileName = "C:" + str + ".csv";

		// 日付にファイルを持たす。
		File file = new File(fileName);

		if (file.exists()) {
			// ファイルが存在した場合の処理

			System.out.println("ファイルは存在します。");

		} else {

			file.createNewFile();

			System.out.println("何時に出社しました？");
			// 書き出すファイルを読み出す。
			String set = setTime();

			FileWriter fw = new FileWriter(file, false); // ※ファイルへの書き出し作業
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			pw.println(set);

			pw.close();
		}



	}

	public void setDumpFile(DumpFile file) {

	}

	// 時間を登録するメソッド
	public String setTime() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befor = br.readLine();

		// Checkクラスのインスタンスを生成し、チェックする。
		Check check = new Check();

		if (check.timeCheck(befor) == true) {
			System.out.println(befor + "から何をしましたか？");
		} else {
			setTime();
		}

		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(System.in));
		String content = br1.readLine();

		System.out.println(content + "を何時まで行いましたか");

		BufferedReader br2 = new BufferedReader(
				new InputStreamReader(System.in));
		String after = br2.readLine();


		// 書式を決定する。
		String set = "『" + befor + "-" + after + "』" + content;

		System.out.println(set + "を登録しますがよろしいでしょうか？(y/n)");

		return set;

	}

}
