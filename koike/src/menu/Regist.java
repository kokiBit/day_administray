package menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import utile.DayChange;
import utile.DumpFile;
import utile.InputCheck;
import check.DayCheck;
import check.TimeCheck;

public class Regist implements Menu {

	// dumpFileを扱うクラスを作成
	public static DumpFile dumpFile;

	public void go() throws IOException {

		// ファイルの入力チェックを行う
		InputCheck inputCheck = new InputCheck();
		String str = inputCheck.dayInput("何日の進捗を登録しますか？[blank:2012/XX/XX]",
				new DayCheck());

		// 文字をファイル用の日付に変換
		String str1 = DayChange.change(str);

		// faileの名前を作成
		String fileName = "C:" + str1 + ".csv";

		// ファイルインスタンス生成。
		File file = new File(fileName);

		if (file.exists()) {
			// ファイルが存在した場合の処理

			System.out.println("ファイルは存在します。");

		} else {

			DumpFile.create(fileName);

			String before = inputCheck.timeInput("何時に出社しましたか?", new TimeCheck());

			System.out.println(before + "から何をしましたか？");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String content = br.readLine();

			String after = inputCheck.confirm(content + "を何時まで行いましたか？", before,
					new TimeCheck());

			String set =  before + "-" + after +" " + content;

			System.out.println("『" + set + "』" + "を登録しますがよろしいでしょうか？(y/n)");

			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			String lastCheck = br1.readLine();

			if (lastCheck.equals("y")) {
				FileWriter fw = new FileWriter(file, false); // ※ファイルへの書き出し作業
				PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
				pw.println(set);

				pw.close();
			}
		}

	}

	public void setDumpFile(DumpFile file) {

	}

}
