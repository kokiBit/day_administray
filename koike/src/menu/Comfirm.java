package menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import utile.DayChange;
import utile.DumpFile;

public class Comfirm implements Menu {

	public static DumpFile dumpFile;

	public void go() throws IOException {

		System.out.println("何日の進捗を確認しますか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String str1 = DayChange.change(str);
		String fi = "C:" + str1 + ".csv";

		// 日付にファイルを持たす。
		File file = new File(fi);

		DumpFile.dumpSamari(file);


	}

	public void setDumpFile(DumpFile file) {

		/*
		 * this.dumpFile = file;
		 *
		 * DumpFile dump = new DumpFile();
		 *
		 * if (file.equals(null)) { dump.create(file); }
		 */
	}

}
