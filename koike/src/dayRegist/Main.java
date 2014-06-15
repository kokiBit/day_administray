package dayRegist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import menu.Comfirm;
import menu.Delete;
import menu.Menu;
import menu.Regist;
import utile.Check;
import utile.DumpFile;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException  {


		final DumpFile f = new DumpFile();
		Map<String, Menu> map = new HashMap<String, Menu>();
		final Menu r = new Regist();
		r.setDumpFile(f);
		final Menu c = new Comfirm();
		c.setDumpFile(f);
		map.put("1", r);

		map.put("2", c);

		map.put("3", new Delete());

		System.out.println("1登録");
		System.out.println("2確認");
		System.out.println("3削除");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		map.get(str).go();

	}

}
