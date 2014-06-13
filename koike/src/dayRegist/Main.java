package dayRegist;

import java.io.IOException;

import utile.Check;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String str = "1014/09/05";

		Check n = new Check();
		n.dayCeck(str);



	/*	final DumpFile f = new DumpFile();
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

		map.get(str).go();*/

	}

}
