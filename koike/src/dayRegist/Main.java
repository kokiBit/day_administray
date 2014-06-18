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
		r.setEndHour(11);
		r.setStartHour(12);
		r.setStartMin(11);
		r.setTask("yaa");

		b.add(r);



		for (Iterator<Record> id = b.iterator(); id.hasNext();) {

			Record re = id.next();
			System.out.println(re.getEndHour());
			System.out.println(re.getEndMin());
			System.out.println(re.getStartHour());
			System.out.println(re.getStartMin());
			System.out.println(re.getTask());

		}

		/*
		 * final DumpFile f = new DumpFile(); Map<String, Menu> map = new
		 * HashMap<String, Menu>(); final Menu r = new Regist();
		 * r.setDumpFile(f); final Menu c = new Comfirm(); c.setDumpFile(f);
		 * map.put("1", r);
		 *
		 * map.put("2", c);
		 *
		 * map.put("3", new Delete());
		 *
		 *
		 * System.out.println("作業実績管理システム");
		 *
		 * System.out.println("*作業実績管理システム"); System.out.println("*作業実績管理システム");
		 * System.out.println("*1)登録"); System.out.println("1)登録");
		 * System.out.println("*2)確認"); System.out.println("*3)削除");
		 * System.out.println("*q)終了");
		 * System.out.println("*************************");
		 *
		 *
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in));
		 *
		 * String str = br.readLine();
		 *
		 * map.get(str).go();
		 */
	}

}
