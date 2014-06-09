package dayRegist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		Map<String, Menu> map = new HashMap<String, Menu>();

		map.put("1", new Regist());

		map.put("2", new Comfirm());

		map.put("3", new Delete());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		map.get(str).go();

	}

}
