package utile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import entity.Record;

public class DumpFile {

	// ファイルを作成するメソッド
	public static void create(String file) {
		File newfile = new File(file);

		try {
			newfile.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// ファイルの中身を一行ずつ書き出すファイル
	public static String fileToString(File file) throws IOException {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					file)));

			StringBuffer sb = new StringBuffer();

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

			HashMap<String, Integer> taskTime = new HashMap<String, Integer>();
			HashMap<Integer, String> taskNum = new HashMap<Integer, String>();
			int taskId = 0;

			for (Iterator<Record> id = list.iterator(); id.hasNext();) {

				Record entity = id.next();

				String startHour = String.valueOf(entity.getStartHour());
				String startMin = String.valueOf(entity.getStartMin());
				String endHour = String.valueOf(entity.getEndHour());
				String endMin = String.valueOf(entity.getEndMin());

				String out = startHour + ":" + startMin + "-" + endHour + ":"
						+ endMin + " " + entity.getTask();

				System.out.println(out);

				for (int key = 0; key <= taskId; key++) {
					if (taskNum.containsKey(taskId)) {

						int sum = taskTime.get(entity.getTask())
								+ entity.getWorkTime();
						taskTime.put(entity.getTask(), sum);
					} else {
						taskId = taskId + 1;
						taskNum.put(taskId, entity.getTask());

						taskTime.put(entity.getTask(), entity.getWorkTime());
					}
				}

			}

			for (int count = 1; count <= taskId; count++) {
				int samari = taskTime.get(taskNum.get(count));

				int hour = samari / 60;
				int min = samari % 60;

				String outSamari = null;

				if (min == 0) {
					outSamari = taskNum.get(count) + " " + hour + "." + min
							+ "0";
				} else {
					outSamari = taskNum.get(count) + " " + hour + "." + min;
				}

				System.out.println(outSamari);
			}

			return null;

		} finally {

			br.close();
		}
	}

	public static void delete(String file) {

		File newdir = new File(file);
		newdir.delete();
	}
}
