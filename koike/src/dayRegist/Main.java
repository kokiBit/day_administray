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
import utile.DumpFile;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException  {



	/*	String str = "2012/02/05";*/

/*
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


		//日時チェック
		String befor = "16:55";
		String after ="17:00";
		n.timeCheck(befor);
		n.timeCheck(after);

	    n.timeComfirm(befor, after);
*/

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
