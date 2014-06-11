package utile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DumpFile {


	//ファイルを作成するメソッド
	public void create(String file) {
		File newfile = new File(file);

		try {
			newfile.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}


	public void update(File file)  {


	}


	public static String fileToString(File file) throws IOException {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					file)));

			StringBuffer sb = new StringBuffer();

			int c;

			while ((c = br.read()) != -1) {
				sb.append((char) c);
			}

			return sb.toString();
		} finally {

			br.close();
		}
	}


	public void delete(String file) {

		File newdir = new File(file);
		newdir.delete();
	}
}
