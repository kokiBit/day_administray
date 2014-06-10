package menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import dayRegist.DumpFile;

public class Comfirm implements Menu {

	public void go() {

		try {
			// ファイルを読み込む
			InputStreamReader isr = new InputStreamReader(
					new FileInputStream(
							"C:/Users/Kouki Takahasi/workspace/javafestival/src/javafes/test.csv"),
					"Shift_JIS");

			BufferedReader br = new BufferedReader(isr);

			// 読み込んだファイルを１行ずつ処理する
			String line;
			StringTokenizer token;
			while ((line = br.readLine()) != null) {
				// 区切り文字","で分割する
				token = new StringTokenizer(line, ",");

				// 分割した文字を画面出力する
				while (token.hasMoreTokens()) {
					System.out.println(token.nextToken());
				}
				System.out.println("**********");
			}

			// 終了処理
			br.close();

		} catch (IOException ex) {
			// 例外発生時処理
			ex.printStackTrace();
		}

	}

	public void setDumpFile(String file) {

		DumpFile dump = new DumpFile();

		if (file.equals(null)) {
			dump.create(file);
		}

	}

}
