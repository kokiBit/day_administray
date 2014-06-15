package menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import utile.DumpFile;


public class Delete implements Menu  {

	public void go() throws IOException {

		System.out.println("何日の進捗を確認しますか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String fi = "C:" + str + ".csv";

		// 日付にファイルを持たす。
		File file = new File(fi);
		DumpFile.fileToString(file);

		System.out.println("上記実績を本当に削除しても良いですか？[y/n]");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br1.readLine();

		if(str1.equals("y")) {
			DumpFile.delete(fi);
			System.out.println("実績を削除しました。");
		}
	}

	public void setDumpFile(DumpFile file) {

	}
}
