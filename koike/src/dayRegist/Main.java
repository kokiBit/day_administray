package dayRegist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Record;


public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {


		List<Record> b = new ArrayList<Record>();

		Record r = new Record();

		r.setEndHour(11);
		r.setEndMin(11);

		for(Iterator<Record> i = b.iterator();i.hasNext();) {
			int in = i.next(); //次の要素の呼び出し
            System.out.println(in);
            i.remove(); //要素の削除

			System.out.println(i.next());
		}





		/*final DumpFile f = new DumpFile();
		Map<String, Menu> map = new HashMap<String, Menu>();
		final Menu r = new Regist();
		r.setDumpFile(f);
		final Menu c = new Comfirm();
		c.setDumpFile(f);
		map.put("1", r);

		map.put("2", c);

		map.put("3", new Delete());


		System.out.println("作業実績管理システム");

		System.out.println("*作業実績管理システム");
		System.out.println("*作業実績管理システム");
		System.out.println("*1)登録");
		System.out.println("1)登録");
		System.out.println("*2)確認");
		System.out.println("*3)削除");
		System.out.println("*q)終了");
		System.out.println("*************************");


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		map.get(str).go();
*/
	}

}
