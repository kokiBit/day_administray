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
		String str = "2014/9/5";
/*
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(str);

		*/

		Check n = new Check();
		n.dayCeck(str);

		int f = Integer.parseInt(str);

		Calendar cal = Calendar.getInstance();
		cal.set(f,1,1);

		cal.getActualMaximum(Calendar.DATE);


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
