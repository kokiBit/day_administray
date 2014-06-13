package dayRegist;

import java.io.IOException;
import java.util.Calendar;

import utile.Check;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String str = "2012/02/05";
/*
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(str);

		*/

		Check n = new Check();
		n.dayCeck(str);

		String[] strAt = str.split("/");
		int i = Integer.parseInt(strAt[0]);
		int j = Integer.parseInt(strAt[1]);
		int k = Integer.parseInt(strAt[2]);



		Calendar cal = Calendar.getInstance();
		cal.set(i,j-1,k);

		int max = cal.getActualMaximum(Calendar.DATE);

		System.out.println(max);

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
