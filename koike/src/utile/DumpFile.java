package utile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

			int c;

			String t;
			List<String> a = new ArrayList<String>();

			List<Record> b = new ArrayList<Record>();

			Record r = new Record();

			r.setEndHour(11);
			b.add(r);

				for(Iterator<Record> i = b.iterator();i.hasNext();) {
					System.out.println(i.next());
				}



			t = br.readLine();
			a.add(t);


			while ((c = br.read()) != -1) {
				DayChange.change(br.readLine());
				/*sb.append((char) c);*/
			}

			/*System.out.println(sb.toString());*/
			System.out.println(a.get(0));
			System.out.println(a.get(1));
			return sb.toString();
		} finally {

			br.close();
		}
	}


	public static void delete(String file) {

		File newdir = new File(file);
		newdir.delete();
	}
}
