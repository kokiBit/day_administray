package menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utile.DayChange;
import utile.DumpFile;
import utile.InputCheck;
import check.DayCheck;
import check.TimeCheck;
import entity.Record;

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

		String reBefore = null;

		if (file.exists()) {
			// ファイルが存在した場合の処理

			String before = dump(file);
			reBefore = input(fileName, before, file);

		} else {

			File newFile = DumpFile.create(fileName);

			String before = inputCheck
					.timeInput("何時に出社しましたか?", new TimeCheck());

			reBefore = input(fileName, before, newFile);

		}

		while (reBefore != null) {
			System.out.println("続けて登録しますか(y/n)？");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			String con = br1.readLine();

			if (con.equals("y")) {
				reBefore = input(fileName, reBefore, file);
			} else {
				reBefore = null;
			}

		}

		System.out.println("登録を終了します。");

	}

	public void setDumpFile(DumpFile file) {

	}

	public String input(String fileName, String before, File file)
			throws IOException {

		InputCheck inputCheck = new InputCheck();

		System.out.println(before + "から何をしましたか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String content = br.readLine();

		String after = inputCheck.confirm(content + "を何時まで行いましたか？", before,
				new TimeCheck());

		String set = before + "-" + after + " " + content;

		System.out.println("『" + set + "』" + "を登録しますがよろしいでしょうか？(y/n)");

		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(System.in));
		String lastCheck = br1.readLine();

		if (lastCheck.equals("y")) {

			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream(fileName,true), "Shift-JIS");

			PrintWriter pw = new PrintWriter(new BufferedWriter(osw));
			pw.println(set);

			pw.close();

			return after;

		}
		return null;
	}

	public String dump(File file) throws IOException {
		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					file), "Shift-JIS"));

			String lien = null;

			List<Record> list = new ArrayList<Record>();

			while ((lien = br.readLine()) != null) {

				// 読み込んだ値を分割
				String[] strAt = lien.split("-");
				String[] strAt1 = strAt[1].split(" ");
				String[] after = strAt[0].split(":");
				String[] before = strAt1[0].split(":");

				// 値をエンティティに格納
				Record rec = new Record();
				rec.setStartHour(Integer.parseInt(after[0]));
				rec.setStartMin(Integer.parseInt(after[1]));
				rec.setEndHour(Integer.parseInt(before[0]));
				rec.setEndMin(Integer.parseInt(before[1]));
				rec.setTask(strAt1[1]);

				list.add(rec);
			}
			for (Iterator<Record> id = list.iterator(); id.hasNext();) {

				Record entity = id.next();

				String startHour = String.valueOf(entity.getStartHour());
				String startMin = String.valueOf(entity.getStartMin());
				String endHour = String.valueOf(entity.getEndHour());
				String endMin = String.valueOf(entity.getEndMin());

				String out = startHour + ":" + startMin + "-" + endHour + ":"
						+ endMin + " " + entity.getTask();

				System.out.println(out);
			}

			int count = list.size()-1;
			int beforeHour = list.get(count).getEndHour();
			int beforeMin = list.get(count).getEndMin();

			String before = String.valueOf(beforeHour) + ":"
					+ String.valueOf(beforeMin);

			return before;

		} finally {

			br.close();
		}
	}

}
